package com.example.sanaebadi.pusheandonesignal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.onesignal.OneSignal;

import co.ronash.pushe.Pushe;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    //The One Signal

    OneSignal.startInit(this)
      .inFocusDisplaying(OneSignal.OSInFocusDisplayOption.Notification)
      .unsubscribeWhenNotificationsAreDisabled(true)
      .init();


    setContentView(R.layout.activity_main);

    //The Pushe

    Pushe.initialize(this,true);
  }
}
