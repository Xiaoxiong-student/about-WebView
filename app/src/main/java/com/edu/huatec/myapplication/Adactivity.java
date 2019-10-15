package com.edu.huatec.myapplication;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
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

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Adactivity.this,MainActivity.class);
                startActivity(intent);

                finish();
            }
        });


        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=10;i>=0;i--){

                    SystemClock.sleep(1000);

                    final int count=i;
                    textView.setText("点击跳转"+count);

                }
            }
        });




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
