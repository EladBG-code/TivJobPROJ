package com.example.tivjob;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    private WebView WebsiteJ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebsiteJ = (WebView) findViewById(R.id.websiteID);
        WebsiteJ.setWebViewClient(new WebViewClient());
        WebsiteJ.loadUrl("https://bit.ly/2Y0xEuG");
    }
    //TEST TO SEE IF UPDATED

    @Override
    public void onBackPressed(){
        if(WebsiteJ.canGoBack()){
            WebsiteJ.goBack();
        }
        else {
            super.onBackPressed();
        }
    }
}