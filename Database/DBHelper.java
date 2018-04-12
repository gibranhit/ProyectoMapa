package com.example.alejandro.findmyplace.Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by hector on 10/04/18.
 */

public class DBHelper extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "myplaces.db";
    private static final String CREATE_WORKER_ENTRIES = "CREATE TABLE " + FeedEntry.TABLE_NAME;
    public static final String COLUMNS = " (" + FeedEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + FeedEntry.COLUMN_CATEGORY + " TEXT NOT NULL,"
            + FeedEntry.COLUMN_LONGITUDE + " TEXT NOT NULL,"
            + FeedEntry.COLUMN_LATITUDE + " TEXT NOT NULL,"
            + FeedEntry.COLUMN_TITLE + " TEXT NOT NULL,"
            + FeedEntry.COLUMN_DESCRIPTION + " TEXT NOT NULL,"
            + FeedEntry.COLUMN_IMAGEURL + " TEXT NOT NULL,"
            + FeedEntry.COLUMN_ADDRESS + " TEXT NOT NULL,";

    private static final String DELETE_PENDING_ENTRIES = "DROP TABLE IF EXISTS " + FeedEntry.TABLE_NAME;

    public DBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_WORKER_ENTRIES + COLUMNS);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
