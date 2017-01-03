package com.example.anandkumar.sampleinterface;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements IDataInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyBackgroundThread.getInstance().setDataInteractionListener(this);
        MyBackgroundThread.getInstance().startThreadProcess();
    }

    @Override
    public void setData(String data) {
        //TODO: you can use this data to change UI
    }
}
