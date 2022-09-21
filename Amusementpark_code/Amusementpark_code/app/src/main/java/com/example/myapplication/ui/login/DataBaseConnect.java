package com.example.myapplication.ui.login;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;


public class DataBaseConnect extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "Login1.db";
    public static final String TableName = "LoginInfo";
    public static final int version1 = 1;

    public static final String Column_ID = "id";
    public static final String Column_Email = "Email";
    public static final String Column_Password = "Password";

    public DataBaseConnect(@Nullable Context context) {
        super(context, DATABASE_NAME, null, version1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = String.format("CREATE TABLE %s (%s INTEGER AUTO_INCREMENT , %s TEXT,%s TEXT)", TableName, Column_ID, Column_Email, Column_Password);
        db.execSQL(sql);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public void insertRow(String email, String password) {


        ContentValues con = new ContentValues();
        con.put(Column_Email, email);
        con.put(Column_Password, password);
        SQLiteDatabase db = this.getWritableDatabase();
        db.insert(TableName, null, con);
        db.close();
    }
    public void deleteTable(){
        SQLiteDatabase db = this.getReadableDatabase();
         db.execSQL("DROP TABLE " + TableName);
    }

    public int getdata() {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cs = db.rawQuery("SELECT * FROM " + TableName, null);
        System.out.println("the data points count of the table: "+cs.getCount());
        cs.moveToFirst();
        while (cs.moveToNext()){

            System.out.println(cs.getString(cs.getColumnIndex("Email")));
        }
        return cs.getCount();
    }

    public boolean verifyEmail (String email) {
        SQLiteDatabase db=this.getReadableDatabase();
        String sql = "SELECT EXISTS (SELECT * FROM LoginInfo WHERE Email='" + email + "' LIMIT 1)";
        Cursor cursor = db.rawQuery(sql, null);
        cursor.moveToFirst();

        // cursor.getInt(0) is 1 if column with value exists
        if (cursor.getInt(0) == 1) {
            cursor.close();
            return true;
        } else {
            cursor.close();
            return false;
        }
    }

}
