package com.example.act_test;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Lv_Debug_Actovoty extends AppCompatActivity {

    private static String TAG = "TestTag_Debug";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lv__debug__actovoty);

        Button btn_e = (Button) findViewById(R.id.btn_d_Error);
        Button btn_i = (Button)findViewById(R.id.btn_d_Info);
        Button btn_w = (Button)findViewById(R.id.btn_d_Warning);
        Button btn_v = (Button)findViewById(R.id.btn_d_Verbose);
        Button btn_p = (Button)findViewById(R.id.btn_d_Pause);

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

        btn_v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        btn_p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Lv_Debug_Actovoty.this);

                builder.setTitle("?????????").setMessage("???????????????");

                AlertDialog alertDialog = builder.create();

                alertDialog.show();
            }
        });

        Log.d(TAG, "onCreate()");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d(TAG, "onStart()");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d(TAG, "onResume()");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d(TAG, "onPause()");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d(TAG, "onStop()");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d(TAG, "onDestroy()");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d(TAG, "onRestart()");
    }
}
