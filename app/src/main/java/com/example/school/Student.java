package com.example.school;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

import com.example.school.Class;

@Entity(tableName = "Students",foreignKeys = @ForeignKey(entity = Class.class,
        parentColumns = "Class_ID",
        childColumns = "C_id"))
public class Student {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "Student_ID")
    public   int SID;
    @ColumnInfo(name = "Student_Name")
    public String Name;
    @ColumnInfo(name = "Student_UName")
    public String UserName;
    @ColumnInfo(name = "Gender")
    public String gender;
    @ColumnInfo(name = "P_Name")
    public String ParentName;
    @ColumnInfo(name = "C_id")
    public int CID;

    public int getSID() {
        return SID;
    }


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getParentName() {
        return ParentName;
    }

    public void setParentName(String parentName) {
        ParentName = parentName;
    }

    public int getCID() {
        return CID;
    }

    public void setCID(int CID) {
        this.CID = CID;
    }
}
