package com.pavel.responsecode;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.pavel.response.code.HttpResponseCode;

public class MainActivity extends AppCompatActivity {


    public HttpResponseCode httpResponseCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        httpResponseCode = new HttpResponseCode(getApplicationContext() , true);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);


        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (!httpResponseCode.checkResponse(530)){
                    /**
                     *
                     * do what ever you want if status code is not 200 then automaticaly status will show through a toast
                     *
                     */
                }
            }
        });
    }

}
