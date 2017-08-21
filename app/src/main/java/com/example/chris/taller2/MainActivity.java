package com.example.chris.taller2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;

public class MainActivity extends AppCompatActivity {
 private Toolbar toolbar    ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    toolbar=(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }
    public boolean  onCreateOptionsMenu ( Menu menu){
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;

    }
}
