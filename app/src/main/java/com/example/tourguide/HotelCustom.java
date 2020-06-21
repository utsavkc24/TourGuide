package com.example.tourguide;

public class HotelCustom {
    private int mTitle;
    private int mDetail;
    private int mAddress;
    private int mRatingImageId;
    private int mImageId;

    public HotelCustom(int mTitle, int mDetail, int mAddress, int mRatingImageId, int mImageId) {
        this.mTitle = mTitle;
        this.mDetail = mDetail;
        this.mAddress = mAddress;
        this.mRatingImageId = mRatingImageId;
        this.mImageId = mImageId;
    }

    public int getmTitle() {
        return mTitle;
    }

    public int getmDetail() {
        return mDetail;
    }

    public int getmAddress() {
        return mAddress;
    }

    public int getmRatingImageId() {
        return mRatingImageId;
    }

    public int getmImageId() {
        return mImageId;
    }
}
