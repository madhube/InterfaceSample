package com.example.anandkumar.sampleinterface;

/**
 * Created by anand.kumar on 1/3/2017.
 */

public class MyBackgroundThread {

    private static MyBackgroundThread sInstance;

    public static MyBackgroundThread getInstance() {
        if (sInstance == null) {
            sInstance = new MyBackgroundThread();
        }
        return sInstance;
    }

    private MyBackgroundThread() {

    }

    private IDataInteractionListener mDataInteractionListener;

    public void setDataInteractionListener(IDataInteractionListener listener) {
        mDataInteractionListener = listener;
    }

    public void startThreadProcess() {
        new Thread(new Runnable() {
            public void run(){
                if (mDataInteractionListener != null) {
                    mDataInteractionListener.setData("This is the data to send UI update");
                }
            }
        }).start();
    }
}
