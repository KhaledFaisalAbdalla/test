package com.example.lab_exer3_abdalla;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    EditText sch1, sch2, sch3, sch4, sch5, sch6, sch7, sch8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sch1 = findViewById(R.id.sch_01);
        sch2 = findViewById(R.id.sch_02);
        sch3 = findViewById(R.id.sch_03);
        sch4 = findViewById(R.id.sch_04);
        sch5 = findViewById(R.id.sch_05);
        sch6 = findViewById(R.id.sch_06);
        sch7 = findViewById(R.id.sch_07);
        sch8 = findViewById(R.id.sch_08);

    }

    public void saveData(View V){
        String data1 = sch1.getText().toString()+ ",";
        String data2 = sch2.getText().toString()+ ",";
        String data3 = sch3.getText().toString()+ ",";
        String data4 = sch4.getText().toString()+ ",";
        String data5 = sch5.getText().toString()+ ",";
        String data6 = sch6.getText().toString()+ ",";
        String data7 = sch7.getText().toString()+ ",";
        String data8 = sch8.getText().toString()+ ",";
        FileOutputStream writer = null;
        try {
            writer = openFileOutput("data1.txt", MODE_PRIVATE);
            writer.write(data1.getBytes());
            writer.write(data2.getBytes());
            writer.write(data3.getBytes());
            writer.write(data4.getBytes());
            writer.write(data5.getBytes());
            writer.write(data6.getBytes());
            writer.write(data7.getBytes());
            writer.write(data8.getBytes());
        } catch (FileNotFoundException e) {
            Log.d("error", "File not found");
        } catch (IOException e) {
            Log.d("error", "File not found");
        } finally {
            try{
                writer.close();
            } catch (IOException e) {
                Log.d("error", "File not found");
            }
            Toast.makeText(this, "data saved in internal storage", Toast.LENGTH_LONG).show();
        }


    }
    public void verify(View v) {
        Intent i = new Intent(this, Main2Activity.class);
        startActivity(i);
    }
}
