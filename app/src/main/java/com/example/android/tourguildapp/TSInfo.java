package com.example.android.tourguildapp;

public class TSInfo {
    private int mImgRes;
    private String mTitle;
    private String mInfo;

    public TSInfo(int imgRes, String title, String info) {
        mImgRes = imgRes;
        mTitle = title;
        mInfo = info;
    }

    public int getmImgRes() {
        return mImgRes;
    }

    public String getmTitle() {
        return mTitle;
    }

    public String getmInfo() {
        return mInfo;
    }

    @Override
    public String toString() {
        return "TSInfo:\n"+"mImgRes="+mImgRes+"\nmTitle="+mTitle+"\nmInfo="+mInfo;
    }
}

