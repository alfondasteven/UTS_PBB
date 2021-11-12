package com.fonda.daftarmenu;

import android.os.Parcel;
import android.os.Parcelable;

public class Food implements Parcelable {
    protected Food(Parcel in) {
        nameFood = in.readString();
        hargaFood = in.readString();
        infoFood = in.readString();
        photoFood = in.readInt();
    }

    public static final Creator<Food> CREATOR = new Creator<Food>() {
        @Override
        public Food createFromParcel(Parcel in) {
            return new Food(in);
        }

        @Override
        public Food[] newArray(int size) {
            return new Food[size];
        }
    };

    public Food() {

    }

    public String getNameFood() {
        return nameFood;
    }

    public void setNameFood(String nameFood) {
        this.nameFood = nameFood;
    }

    public String getHargaFood() {
        return hargaFood;
    }

    public void setHargaFood(String hargaFood) {
        this.hargaFood = hargaFood;
    }

    public String getInfoFood() {
        return infoFood;
    }

    public void setInfoFood(String infoFood) {
        this.infoFood = infoFood;
    }

    public int getPhotoFood() {
        return photoFood;
    }

    public void setPhotoFood(int photoFood) {
        this.photoFood = photoFood;
    }

    private String nameFood , hargaFood , infoFood;
    private int photoFood;

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(nameFood);
        parcel.writeString(hargaFood);
        parcel.writeString(infoFood);
        parcel.writeInt(photoFood);
    }
}
