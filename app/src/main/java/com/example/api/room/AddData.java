package com.example.api.room;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.api.MainActivity;
import com.example.api.R;

public class AddData extends AppCompatActivity
{
    public static final String TAG="fail";
    EditText name,prn,dept;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_data);
        name=findViewById(R.id.editTextTextPersonName);
        prn=findViewById(R.id.editTextTextPersonName2);
        dept=findViewById(R.id.editTextTextPersonName3);

    }

    public void addData(View view)
    {
        String prn2=prn.getText().toString();
        String name2= name.getText().toString();
        String dept1=dept.getText().toString();
/*
        Entity_class list =new Entity_class();
        list.setName(name2);
        list.setPrn(prn2);
        list.setDept(dept1);

        try {
            RoomDatabaseActivity.mydatabase.todoDao().insert(list);
           }catch (Exception e)
        {
            Log.e(TAG,"fail"+e.getMessage());
            Toast.makeText(this, "fail"+e.getMessage(), Toast.LENGTH_SHORT).show();
        }
        Toast.makeText(this, "Data Saved!", Toast.LENGTH_SHORT).show();

 */
    }
}