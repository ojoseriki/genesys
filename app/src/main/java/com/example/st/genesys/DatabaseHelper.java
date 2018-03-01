package com.example.st.genesys;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by st on 2018/02/23.
 */

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "Genesysdb.db";
    //TABLE COMPANY
    public static final String TABLE_NAME = "Company_table";
    public static final String COL_1 = "ID";
    public static final String COL_2 = "NAME";
    public static final String COL_3 = "ADDRESS";
    public static final String COL_4 = "COMPANY_CODE";
    public static final  String COL_5 = "BUSINESS_TYPE";
    // TABLE EMPLOYEE
    public static  final  String TABLE_EMPLOYEE ="Employee_table";
    public static final String COL_6 = "ID";
    public static final String COL_7 = "FIRSTNAME";
    public static final String COL_8 = "LASTNAME";
    public static final String COL_9 = "ADDRESS";
    public static final  String COL_10 = "JOB_DESCRIBTION ";
    public static final  String COL_11 = "PASSWORD";
    public static final  String COL_12 = "EMPLOYER_CODE";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
        SQLiteDatabase db = this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
    db.execSQL("create table " + TABLE_NAME +"( `ID` INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, `NAME` TEXT NOT NULL, `ADDRESS` TEXT NOT NULL, `REGISTRATION_CODE` TEXT NOT NULL, `NO_OF_EMPLOYEE` TEXT NOT NULL )");
    db.execSQL("create table " + TABLE_EMPLOYEE + "( `ID` INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, `FIRSTNAME` TEXT NOT NULL, `LASTNAME` TEXT NOT NULL, `ADDRESS` TEXT NOT NULL, `JOB_DESCRIBETION` TEXT NOT NULL, `PASSWORD` TEXT NOT NULL, `EMPLOYER_CODE` INTEGER NOT NULL )");
    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_EMPLOYEE);
        onCreate(db);
    }
}
