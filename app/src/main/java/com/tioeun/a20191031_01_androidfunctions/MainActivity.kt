package com.tioeun.a20191031_01_androidfunctions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        intent에 첨부된 데이터를 찾아주는 코드.
        var receivedName = intent.getStringExtra("name")
        var receivedNumber = intent.getStringExtra("number")
        var receivedId = intent.getStringExtra("id")

        userNmTxt.text = "${receivedName}(${receivedId})"
        userNoTxt.text = "${receivedNumber}번 회원"
    }
}
