package com.example.notebookma

import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.util.Log

class DatabaseManager : SQLiteOpenHelper() {

    private val DBName = "myinfo.db"
    private val DBversion = 1
    private val TABLE_NAME = "notebook"
    private val COLUMN_ID = "id"
    private val SUBJECT = "subject"
    private val CONTEXT = "context"


    override fun onCreate(db: SQLiteDatabase?) {

        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.

        val cQuery = ("CREATE TABLE " +
                TABLE_NAME + "("
                + COLUMN_ID + " INTEGER PRIMARY KEY," +
                +SUBJECT + " TEXT," +
                CONTEXT + " TEXT" + ")")

        
        db.execSQL(cQuery)

        Log.i("OnCreate SQLite", "DB Created!")


    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {


        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}