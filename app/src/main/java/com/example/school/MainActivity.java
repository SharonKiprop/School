package com.example.school;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public static MyDao myDao;
    private Button sButton;
    private Button cButton;
    private Button tButton;
    public static MyDatabaseApp myDatabaseApp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myDao = MyDatabaseApp.CreateDbInstance(this).getDao();
        //List<Student> list = myDao.readAllStudents();
        //Toast.makeText(this,"Students fetched fro db"+list.size(),Toast.LENGTH_SHORT).show();
        sButton = findViewById(R.id.register_student);


    }
    public void OpenRegisterStudent(View view){
        Intent intent = new Intent(this,RegisterStudent.class);
        startActivity(intent);
    }
}
