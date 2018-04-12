package com.example.alejandro.findmyplace.Database;

import android.content.Context;
import android.provider.BaseColumns;

/**
 * Created by hector on 11/04/18.
 */

public class FeedEntry implements BaseColumns {
    public static final String TABLE_NAME = "places";
    public static final String COLUMN_CATEGORY = "category";
    public static final String COLUMN_LATITUDE = "latitud";
    public static final String COLUMN_LONGITUDE = "longitud";
    public static final String COLUMN_TITLE = "title";
    public static final String COLUMN_DESCRIPTION = "description";
    public static final String COLUMN_IMAGEURL = "image_url";
    public static final String COLUMN_ADDRESS = "address";

    public FeedEntry(Context context) {
    }
}
