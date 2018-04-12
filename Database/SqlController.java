package com.example.alejandro.findmyplace.Database;

import android.content.Context;
import android.database.Cursor;

import com.example.alejandro.findmyplace.Place;

/**
 * Created by hector on 11/04/18.
 */

public class SqlController {

    private DBHelper mDbHelper;

    public SqlController(Context context){
        this.mDbHelper = new DBHelper(context);
    }
    public long saveData(String tableName,Place place){
        return mDbHelper.getWritableDatabase().insert(tableName,null,place.toContentValues());
    }
    public int editData(String tableName,Place object, String whereClause, String[] whereArgs){
        return mDbHelper.getWritableDatabase().update(tableName,object.toContentValues(),whereClause,whereArgs);
    }
    public Cursor readData(String tableName, String[] columns, String whereClause, String[] whereArgs, String groupBy, String having, String orderBy, String
            limit){
        Cursor cursor =
                mDbHelper.getWritableDatabase().query(tableName,columns,whereClause,whereArgs,groupBy,having,orderBy,limit);
        if(cursor!=null)
            cursor.moveToFirst();
        return cursor;
    }
    public Cursor selectColumnsFromDb(String tableName,String[] columns){
        return readData(tableName,columns,null,null,null,null,null,null);
    }
}
