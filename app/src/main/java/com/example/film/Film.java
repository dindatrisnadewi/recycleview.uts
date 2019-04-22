package com.example.film;

import android.os.Parcel;
import android.os.Parcelable;

public class Film implements Parcelable {
    private String name, remarks, photo, deskrip;

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getRemarks() {

        return remarks;
    }

    public void setRemarks(String remarks) {

        this.remarks = remarks;
    }

    public String getPhoto() {

        return photo;
    }

    public void setPhoto(String photo) {

        this.photo = photo;
    }

    public String getDeskrip() {
        return deskrip;
    }

    public void setDeskrip(String deskrip) {
        this.deskrip = deskrip;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeString(this.remarks);
        dest.writeString(this.photo);
        dest.writeString(this.deskrip);
    }

    public Film() {
    }
    protected Film(Parcel in) {
        this.name = in.readString();
        this.remarks = in.readString();
        this.photo = in.readString();
        this.deskrip = in.readString();
    }

    public static final Parcelable.Creator<Film> CREATOR = new Parcelable.Creator<Film>() {
        @Override
        public Film createFromParcel(Parcel source) {
            return new Film(source);
        }
        @Override
        public Film[] newArray(int size) { return new Film[size];
        }
    };
}
