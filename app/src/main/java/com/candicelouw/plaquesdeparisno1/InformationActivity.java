package com.candicelouw.plaquesdeparisno1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

/**
 * Originally created and designed by CLouw on 16/03/2018.
 */
public class InformationActivity extends AppCompatActivity {

    WebView myWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);
        myWebView = (WebView) findViewById(R.id.myWebView);
        myWebView.loadUrl("file:///android_asset/plaquesdeparisno1.html");
    }

}