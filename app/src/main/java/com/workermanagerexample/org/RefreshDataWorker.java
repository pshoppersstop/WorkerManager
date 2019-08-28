package com.workermanagerexample.org;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.util.Log;

import androidx.work.Worker;

import static android.support.v4.content.ContextCompat.startForegroundService;

public class RefreshDataWorker extends Worker {
/*    @NonNull
    @Override
    public WorkerResult doWork() {
        Log.e("startWorkerManager","***********");
        startService();
        return WorkerResult.SUCCESS;
    }*/

   public void startService(){
       Log.e("start your service here","+++++++++++");
    }

    @NonNull
    @Override
    public Result doWork() {
        Log.e("startWorkerManager","***********");
        startService();
        return Result.SUCCESS;
    }
}
