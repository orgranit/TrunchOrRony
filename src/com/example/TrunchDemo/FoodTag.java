package com.example.TrunchDemo;

import android.os.Parcel;
import android.os.Parcelable;


/**
 * Simple container object for contact data
 *
 * Created by mgod on 9/12/13.
 * @author mgod
 */
public class FoodTag implements Parcelable {
    private String tag;
    private String type;

    public FoodTag(String n, String t) {
        tag = n;
        type = t;
    }

    public FoodTag(){
    }

    public FoodTag(Parcel in) {
        this.tag = in.readString();
        this.type = in.readString();
    }


    public String getTag() { return tag; }
    public String getType() { return type; }
    public boolean isRest() {
        return type.equals("Restaurant");
    }

    @Override
    public String toString() { return tag; }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(tag);
        dest.writeString(type);
    }



    public static final Creator<FoodTag> CREATOR = new Creator<FoodTag>() {

        public FoodTag createFromParcel(Parcel in) {
            return new FoodTag(in);
        }

        public FoodTag[] newArray(int size) {
            return new FoodTag[size];
        }
    };
}

