package com.example.myapplication.ui.login;

import android.content.Intent;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import com.example.myapplication.R;
import com.example.myapplication.ui.login.LoginActivity;

public class SignUpActivity extends AppCompatActivity {
    private DataBaseConnect db= new DataBaseConnect(SignUpActivity.this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        final EditText newPassword = findViewById(R.id.pass2);  //new user password
        final EditText newEmail=findViewById(R.id.newEmail);
        final Button signupButton = findViewById(R.id.login2);

        signupButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    db.insertRow(newEmail.getText().toString(), newPassword.getText().toString());
                    System.out.println("getting db data\n"+db.getdata());
//                    Context context = getApplicationContext();
//                    Toast toast = Toast.makeText(SignUpActivity.this,db.getdata(),Toast.LENGTH_SHORT);
//                    toast.show();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                startActivity(new Intent(SignUpActivity.this,LoginActivity.class));
            }
        });
    }
}
