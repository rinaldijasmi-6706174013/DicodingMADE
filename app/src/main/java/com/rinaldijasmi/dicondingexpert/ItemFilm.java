package com.rinaldijasmi.dicondingexpert;

import android.os.Parcel;
import android.os.Parcelable;

public class ItemFilm implements Parcelable {
    String judulFilm;
    String tanggalFilm;
    String descFilm;
    int posterFilm;

    public ItemFilm() {
        this.judulFilm = judulFilm;
        this.tanggalFilm = tanggalFilm;
        this.descFilm = descFilm;
        this.posterFilm = posterFilm;
    }

    public String getJudulFilm() {
        return judulFilm;
    }

    public void setJudulFilm(String judulFilm) {
        this.judulFilm = judulFilm;
    }

    public String getTanggalFilm() {
        return tanggalFilm;
    }

    public void setTanggalFilm(String tanggalFilm) {
        this.tanggalFilm = tanggalFilm;
    }

    public String getDescFilm() {
        return descFilm;
    }

    public void setDescFilm(String descFilm) {
        this.descFilm = descFilm;
    }

    public int getPosterFilm() {
        return posterFilm;
    }

    public void setPosterFilm(int posterFilm) {
        this.posterFilm = posterFilm;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.judulFilm);
        parcel.writeString(this.tanggalFilm);
        parcel.writeString(this.descFilm);
        parcel.writeInt(this.posterFilm);
    }

    protected ItemFilm(Parcel par) {
        this.judulFilm = par.readString();
        this.tanggalFilm = par.readString();
        this.descFilm = par.readString();
        this.posterFilm = par.readInt();
    }

    public static final Parcelable.Creator<ItemFilm> CREATOR = new Parcelable.Creator<ItemFilm>() {
        @Override
        public ItemFilm createFromParcel(Parcel source) {
            return new ItemFilm(source);
        }

        @Override
        public ItemFilm[] newArray(int size) {
            return new ItemFilm[size];
        }
    };

}
