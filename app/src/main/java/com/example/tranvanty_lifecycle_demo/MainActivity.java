package com.example.tranvanty_lifecycle_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("LifeCycle","Create called");
        Toast.makeText(getApplicationContext(),"OnCreate ", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("LifeCycle","onStart called");
        Toast.makeText(getApplicationContext(),"OnStart ", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("LifeCycle","onRestart called");
        Toast.makeText(getApplicationContext(),"ReStart ", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("LifeCycle","On Resume called");
        Toast.makeText(getApplicationContext(),"Resume ", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("LifeCycle","onPause called");
        Toast.makeText(getApplicationContext(),"Pause ", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("LifeCycle","onStop called");
        Toast.makeText(getApplicationContext(),"Stop ", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("LifeCycle","onDestroy called");
        Toast.makeText(getApplicationContext(),"Destroy ", Toast.LENGTH_SHORT).show();
    }
 SimpleDateFormat gio = new SimpleDateFormat("HHmmss");
    String currenttime = gio.format(new Date());

}
