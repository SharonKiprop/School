package com.example.school;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class RegisterStudent extends AppCompatActivity {
    private Button bnStudent;
    long InsertionResult;
    EditText etName,etUName,etPName,etCId;
    Spinner spGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_student);
        InsertionResult = -1;
        etName=findViewById(R.id.s_name);
        etUName =findViewById(R.id.et_username);
        etPName = findViewById(R.id.p_name);
        etCId = findViewById(R.id.cl_id);
        spGender = findViewById(R.id.spinner_gender);
        bnStudent= findViewById(R.id.register_student);
           bnStudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Student student = new Student();
                    student.setName(etName.getText().toString());
                    student.setUserName(etUName.getText().toString());
                    student.setParentName(etPName.getText().toString());
                    student.setCID(Integer.parseInt(etCId.getText().toString()));
                    student.setGender(spGender.getSelectedItem().toString());
                    InsertStudent insertStudent =new InsertStudent();
                    insertStudent.execute(student);
                    if (InsertionResult == -1){
                        Toast.makeText(getApplicationContext(),"Registration Failed",Toast.LENGTH_LONG).show();

                    }else
                        Toast.makeText(getApplicationContext(),"Registered successfully",Toast.LENGTH_LONG).show();


                }


        });
    }
    public class InsertStudent extends AsyncTask<Student,Void,Void>{
        @Override
        protected Void doInBackground(Student... students) {
            InsertionResult =MainActivity.myDao.insertStudent(students[0]);
            return null;
        }
    }
}
