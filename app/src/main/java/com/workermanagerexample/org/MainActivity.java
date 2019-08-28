package com.workermanagerexample.org;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;


import androidx.work.Data;
import androidx.work.ExistingPeriodicWorkPolicy;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkManager;

import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {
    public static final String TAG_MY_WORK = "mywork";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scheduleWork(TAG_MY_WORK);
    }
/*
    private void startWorkerManager(){
        Data data = new Data.Builder()
                .putString("data","hello")
                .build();

        PeriodicWorkRequest refreshWork = new PeriodicWorkRequest.Builder(RefreshDataWorker.class, 16, TimeUnit.MINUTES).setInputData(data).build();

        WorkManager.getInstance().enqueueUniquePeriodicWork();

    }*/




    public static void scheduleWork(String tag) {
        PeriodicWorkRequest.Builder photoCheckBuilder =
                new PeriodicWorkRequest.Builder(RefreshDataWorker.class, 5, TimeUnit.MINUTES);
        PeriodicWorkRequest request = photoCheckBuilder.build();
        WorkManager.getInstance().enqueueUniquePeriodicWork(tag, ExistingPeriodicWorkPolicy.KEEP , request);
    }
}
