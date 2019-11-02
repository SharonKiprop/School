package com.example.school;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface MyDao {

    @Query("select * from Students")
    List<Student> readAllStudents();

    @Query("select *from Students where Student_UName like :UName")
    List<Student> searchStudentByUserName(String UName);

    @Insert (onConflict = OnConflictStrategy.REPLACE)
    long insertStudent(Student student);

    @Update
    int updateStudent(Student student);

    @Delete
    int deleteStudent(Student student);

    @Query("select * from Classes")
    List<Class> readAllClasses();

    @Insert (onConflict = OnConflictStrategy.REPLACE)
    long insertClass(Class classroom);

    @Update
    int updateClass(Class classroom);

    @Delete
    int deleteClass(Class classroom);

    @Query("select * from Teachers")
    List<Teacher> readAllTeachers();

    @Query("select *from Teachers where TeacherName like :TName")
    List<Teacher> searchTeacherByTeacherName(String TName);

    @Insert (onConflict = OnConflictStrategy.REPLACE)
    long insertTeacher(Teacher teacher);

    @Update
    int updateTeacher(Teacher teacher);

    @Delete
    int deleteTeacher(Teacher teacher);

}
