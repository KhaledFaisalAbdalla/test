package com.example.lab_exer3_abdalla;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        FileInputStream reader = null;
        String msg="";
        try{
            int token;
            StringBuffer buffer = new StringBuffer();
            reader = openFileInput("data1.txt");
            while((token=reader.read())!=-1){
                buffer.append((char)token);
                msg=msg+(char)token;
            }
            reader.close();
            String list[]=msg.split(",");
            ((Button)(findViewById(R.id.button3))).setText(list[0]);
            ((Button)(findViewById(R.id.button4))).setText(list[1]);
            ((Button)(findViewById(R.id.button5))).setText(list[2]);
            ((Button)(findViewById(R.id.button6))).setText(list[3]);
            ((Button)(findViewById(R.id.button7))).setText(list[4]);
            ((Button)(findViewById(R.id.button8))).setText(list[5]);
            ((Button)(findViewById(R.id.button9))).setText(list[6]);
            ((Button)(findViewById(R.id.button10))).setText(list[7]);

        }catch (FileNotFoundException e){
            Log.d("error", "File not found error");
        }
        catch (IOException e){
            Log.d("error", "file not found");
        }
    }

    public void back(View v){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}
