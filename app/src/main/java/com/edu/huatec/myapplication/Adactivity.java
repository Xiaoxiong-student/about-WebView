package com.edu.huatec.myapplication;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

public class Adactivity extends AppCompatActivity{

    private WebView webView;
    private TextView textView;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        webView=findViewById(R.id.webview1);
        textView=findViewById(R.id.tv1);


        initView();

    }

    private void initView() {


        webView.loadUrl(" webView.loadUrl(\"https://www.baidu.com\");");

        webView.getSettings().setSupportZoom(true);
        webView.getSettings().setJavaScriptEnabled(true);

        webView.setWebViewClient(new WebViewClient(){


            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {

                view.loadUrl(url);

                return true;
            }
        }); webView.loadUrl(" webView.loadUrl(\"https://www.baidu.com\");");
    }
}
