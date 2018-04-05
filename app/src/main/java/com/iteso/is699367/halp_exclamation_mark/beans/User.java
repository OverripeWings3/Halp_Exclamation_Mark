package com.iteso.is699367.halp_exclamation_mark.beans;


import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by sjacobus on 5/04/18.
 */

public class User implements Parcelable {
    private String name;
    private String password;
    private boolean isLogged;

    public void setName(String name){
        this.name = name;
    }

    public void setPwd(String password){
        this.password = password;
    }

    public void setLogged(boolean isLogged){
        this.isLogged = isLogged;
    }

    public boolean isLogged() {
        return isLogged;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
    }

    public User() {
    }

    protected User(Parcel in) {
    }

    public static final Parcelable.Creator<User> CREATOR = new Parcelable.Creator<User>() {
        @Override
        public User createFromParcel(Parcel source) {
            return new User(source);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };
}
