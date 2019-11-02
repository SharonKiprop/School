package com.example.school;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(tableName = "Classes",
        foreignKeys = @ForeignKey(entity = Teacher.class,
                parentColumns = "Teacher_ID",
                childColumns = "Teacher_id"))
public class Class {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "Class_ID")
    public int CID;
    @ColumnInfo(name ="Class_Name")
    public String CName;
    @ColumnInfo(name = "Teacher_id")
    public int tID;

    public int getCID() {
        return CID;
    }


    public String getCName() {
        return CName;
    }

    public void setCName(String CName) {
        this.CName = CName;
    }

    public int getTID() {
        return tID;
    }

    public void setTID(int TID) {
        this.tID = TID;
    }
}
