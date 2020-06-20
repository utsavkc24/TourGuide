package com.example.tourguide;

public class Custom {

        private int mTitle;
        private int mDetail;
        private int mAddress;
        private int mTime;
        private int mImageId;

        public Custom(int mTitle, int mDetail, int mAddress, int mTime, int mImageId) {
            this.mTitle = mTitle;
            this.mDetail = mDetail;
            this.mAddress = mAddress;
            this.mTime = mTime;
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

        public int getmTime() {
            return mTime;
        }

        public int getmImageId() {
            return mImageId;
        }
    }
