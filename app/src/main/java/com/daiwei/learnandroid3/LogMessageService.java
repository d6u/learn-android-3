package com.daiwei.learnandroid3;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

public class LogMessageService extends IntentService {

  private static String TAG = LogMessageService.class.getSimpleName();

  public LogMessageService() {
    super("LogMessageService");
  }

  @Override
  protected void onHandleIntent(Intent intent) {
    try {
      Thread.sleep(5000);
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
    }

    String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

    Log.d(TAG, "onHandleIntent " + message);
  }
}
