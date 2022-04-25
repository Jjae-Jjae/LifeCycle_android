package com.example.act_test;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    private static String TAG = "TestTag_Verbose";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_d = (Button)findViewById(R.id.btn_v_Debug);
        Button btn_e = (Button)findViewById(R.id.btn_v_Error);
        Button btn_i = (Button)findViewById(R.id.btn_v_Info);
        Button btn_w = (Button)findViewById(R.id.btn_v_Warning);
        Button btn_p = (Button)findViewById(R.id.btn_v_Pause);

        btn_e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Lv_Error_Actovoty.class);
                startActivity(intent);
            }
        });

        btn_i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Lv_Info_Actovoty.class);
                startActivity(intent);
            }
        });

        btn_w.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Lv_Warning_Actovoty.class);
                startActivity(intent);
            }
        });

        btn_d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Lv_Debug_Actovoty.class);
                startActivity(intent);
            }
        });

        btn_p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveTaskToBack(true);
            }
        });

        Log.v(TAG, "onCreate()");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.v(TAG, "onStart()");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.v(TAG, "onResume()");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.v(TAG, "onPause()");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.v(TAG, "onStop()");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.v(TAG, "onDestroy()");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.v(TAG, "onRestart()");
    }
}
