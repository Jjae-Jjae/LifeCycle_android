package com.example.act_test;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Lv_Info_Actovoty extends AppCompatActivity {

    private static String TAG = "TestTag_Info";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lv__info__actovoty);

        Button btn_d = (Button)findViewById(R.id.btn_i_Debug);
        Button btn_e = (Button)findViewById(R.id.btn_i_Error);
        Button btn_w = (Button)findViewById(R.id.btn_i_Warning);
        Button btn_v = (Button)findViewById(R.id.btn_i_Verbose);
        Button btn_p = (Button)findViewById(R.id.btn_i_Pause);


        btn_e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Lv_Error_Actovoty.class);
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
                AlertDialog.Builder builder = new AlertDialog.Builder(Lv_Info_Actovoty.this);

                builder.setTitle("인사말").setMessage("반갑습니다");

                AlertDialog alertDialog = builder.create();

                alertDialog.show();

            }
        });

        Log.i(TAG, "onCreate()");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.i(TAG, "onStart()");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.i(TAG, "onResume()");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.i(TAG, "onPause()");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.i(TAG, "onStop()");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i(TAG, "onDestroy()");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.i(TAG, "onRestart()");
    }
}
