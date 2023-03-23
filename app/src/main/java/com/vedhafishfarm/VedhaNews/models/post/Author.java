package com.vedhafishfarm.VedhaNews.models.post;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

public class Author implements Parcelable {
    @SerializedName("name")
    private String mName;
    @SerializedName("link")
    private String mLink;

    public Author() {

    }

    public String getName() {
        return mName;
    }

    public String getLink() {
        return mLink;
    }

    public static Creator<Author> getCREATOR() {
        return CREATOR;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(mName);
        parcel.writeString(mLink);
    }

    protected Author(Parcel in) {
        mName = in.readString();
        mLink = in.readString();
    }

    public static final Creator<Author> CREATOR = new Creator<Author>() {
        @Override
        public Author createFromParcel(Parcel source) {
            return new Author(source);
        }

        @Override
        public Author[] newArray(int size) {
            return new Author[size];
        }
    };


}