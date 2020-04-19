package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.*;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.example.myapplication.R;

public class web extends Activity {
WebView b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.web);
        b=findViewById(R.id.b);
        b.setWebViewClient(new WebViewClient());
        String s=getIntent().getStringExtra("s");
        b.loadUrl(s);

    }
    public void onBackPressed()
    {
      if(b.canGoBack())
      {
        b.goBack();
      }
      else
      {
        super.onBackPressed();
      }
      
    }
    }