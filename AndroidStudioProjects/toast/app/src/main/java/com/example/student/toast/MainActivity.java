package com.example.student.toast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(),"welcome",Toast.LENGTH_LONG).show();
    }
protected void onStart()
    {
        super.onStart();
        Toast.makeText(getApplicationContext(),"onstart",Toast.LENGTH_LONG).show();
    }
    protected void onPause()
    {
        super.onPause();
        Toast.makeText(getApplicationContext(),"onpause",Toast.LENGTH_LONG).show();
    }
    protected void onResume()
    {
        super.onResume();
        Toast.makeText(getApplicationContext(),"onresume",Toast.LENGTH_LONG).show();
    }
        protected void onStop()
        {
            super.onStop();
            Toast.makeText(getApplicationContext(),"onstop",Toast.LENGTH_LONG).show();

        }

}
