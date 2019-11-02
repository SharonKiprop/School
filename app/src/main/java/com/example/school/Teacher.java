package com.example.school;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

import com.example.school.Class;

@Entity(tableName = "Teachers",foreignKeys = @ForeignKey(entity = Class.class,
        parentColumns = "Class_ID",
        childColumns = "class_id"))
public class Teacher {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "Teacher_ID")
    public   int TID;
    public String TeacherName;
    public String gender;
    public String MobileNumber;
    @ColumnInfo(name = "class_id")
    public int cID;

    public int getTID() {
        return TID;
    }

    public String getTeacherName() {
        return TeacherName;
    }

    public void setTeacherName(String teacherName) {
        TeacherName = teacherName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMobileNumber() {
        return MobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        MobileNumber = mobileNumber;
    }

    public int getcID() {
        return cID;
    }

    public void setcID(int cID) {
        this.cID = cID;
    }
}
