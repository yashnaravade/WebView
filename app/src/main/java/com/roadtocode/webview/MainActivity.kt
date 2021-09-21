package com.roadtocode.webview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.widget.EditText
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myWebView: WebView = findViewById(R.id.myWebView)

        val etURL: EditText = findViewById(R.id.etURL)

        val btnSearch: ImageView = findViewById(R.id.btnSearch)

        btnSearch.setOnClickListener {
            myWebView.loadUrl(etURL.text.toString())
        }

        //enabling JavaScript
        myWebView.settings.javaScriptEnabled = true


    }

}