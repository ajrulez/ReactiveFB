package com.beltaief.reactivefbexample.util;

import com.google.gson.annotations.SerializedName;

/**
 * Created by sromku on 6/9/15.
 */
public class Cover {

    private static final String ID = "id";
    private static final String SOURCE = "source";
    private static final String CREATED_TIME = "created_time";
    private static final String OFFSET_X = "offset_x";
    private static final String OFFSET_Y = "offset_y";
    private static final String COVER_ID = "cover_id";

    @SerializedName(ID)
    private String mId = null;

    @SerializedName(SOURCE)
    private String mSource = null;

    @SerializedName(CREATED_TIME)
    private String mCreatedTime = null;

    @SerializedName(OFFSET_X)
    private String mOffsetX = null;

    @SerializedName(OFFSET_Y)
    private String mOffsetY = null;

    @SerializedName(COVER_ID)
    private String mCoverId = null;

    public String getId() {
        return mId;
    }

    public String getSource() {
        return mSource;
    }

    public String getCreatedTime() {
        return mCreatedTime;
    }

    public String getOffsetX() {
        return mOffsetX;
    }

    public String getOffsetY() {
        return mOffsetY;
    }

    public String getCoverId() {
        return mCoverId;
    }
}
