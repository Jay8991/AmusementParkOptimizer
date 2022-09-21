package com.example.myapplication.data;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;
import java.util.ArrayList;

public class PlanSummary implements Parcelable, Serializable {
    private String ParkName;
    private String Date;
    private Integer numKids;
    private Integer numAdults;
    private Boolean locker;
    private Boolean speedpass;
    private Boolean foodpass;
    private ArrayList<String> Ridelist;

    public PlanSummary() {
        ParkName = "not selected";
        Date = "not selected";
        this.numKids = 0;
        this.numAdults = 0;
        this.locker = false;
        this.speedpass = false;
        this.foodpass = false;
        Ridelist = new ArrayList<>();
    }


    protected PlanSummary(Parcel in) {
        ParkName = in.readString();
        Date = in.readString();
        numKids = in.readInt();
        numAdults = in.readInt();
        byte tmpLocker = in.readByte();
        locker = tmpLocker == 1 ? true : false;
        byte tmpSpeedpass = in.readByte();
        speedpass = tmpSpeedpass == 1 ? true : false;
        byte tmpFoodpass = in.readByte();
        foodpass = tmpFoodpass==1?true:false;
        Ridelist = in.createStringArrayList();
    }

    public static final Creator<PlanSummary> CREATOR = new Creator<PlanSummary>() {
        @Override
        public PlanSummary createFromParcel(Parcel in) {
            return new PlanSummary(in);
        }

        @Override
        public PlanSummary[] newArray(int size) {
            return new PlanSummary[size];
        }
    };

    public String getParkName() {
        return ParkName;
    }

    public void setParkName(String parkName) {
        ParkName = parkName;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public Integer getNumKids() {
        return numKids;
    }

    public void setNumKids(Integer numKids) {
        this.numKids = numKids;
    }

    public Integer getNumAdults() {
        return numAdults;
    }

    public void setNumAdults(Integer numAdults) {
        this.numAdults = numAdults;
    }

    public Boolean getLocker() {
        return locker;
    }

    public void setLocker(Boolean locker) {
        this.locker = locker;
    }

    public Boolean getSpeedpass() {
        return speedpass;
    }

    public void setSpeedpass(Boolean speedpass) {
        this.speedpass = speedpass;
    }

    public Boolean getFoodpass() {
        return foodpass;
    }

    public void setFoodpass(Boolean foodpass) {
        this.foodpass = foodpass;
    }

    public ArrayList<String> getRidelist() {
        return Ridelist;
    }

    public void setRidelist(ArrayList<String> ridelist) {
        Ridelist = ridelist;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(ParkName);
        dest.writeString(Date);
        dest.writeInt(numKids);
        dest.writeInt(numAdults);

        dest.writeByte((byte) (locker == true ? 1 :0));
        dest.writeByte((byte) (speedpass == true ? 1 :0));
        dest.writeByte((byte) (foodpass == true ? 1 :0));
        dest.writeStringList(Ridelist);
    }
}
