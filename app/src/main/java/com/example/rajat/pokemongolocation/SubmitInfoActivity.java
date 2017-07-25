package com.example.rajat.pokemongolocation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class SubmitInfoActivity extends InfoActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WebView mobWebView=new WebView(SubmitInfoActivity.this);
        mobWebView.getSettings().setJavaScriptEnabled(true);
        mobWebView.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLScGd5K7HHulcgW2sobzgCDWNgmU_MT-TgpAPQ1Re_FE9DFVCw/viewform");

        setContentView(mobWebView);
        getSupportActionBar().show();

    }
}
