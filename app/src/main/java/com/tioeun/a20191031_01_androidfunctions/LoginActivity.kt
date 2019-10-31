package com.tioeun.a20191031_01_androidfunctions

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

//    이름과 회원번호를 입력하고 로그인 버튼을 누르면
//    ex) 10번 또니 회원님 환영합니다. 라는 Toast를 띄우자.


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        loginBtn.setOnClickListener {
            var userNm = userNm.text.toString()
            var userNo = userNo.text.toString()
            var userId = userId.text.toString()

//            var str = "원하는 내용 ${변수이름.메소드()} 마무리"

            var str = "${userNo}번 ${userNm}(${userId})님 환영합니다."

            Toast.makeText(this, str, Toast.LENGTH_LONG).show()

            var myIntent = Intent(this, MainActivity::class.java)

            myIntent.putExtra("name", userNm)
            myIntent.putExtra("number", userNo)
            myIntent.putExtra("id", userId)

            startActivity(myIntent)

        }

        signUpBtn.setOnClickListener {
            startActivity(Intent(this, SignUpActivity::class.java))
        }
    }
}

// 연습문제.
// 회원가입 (SingUp) 화면을 만들고, 배경을 초록색(#00FF00)으로만 설정하자.
// 회원가입 버튼을 누르면 해당 액티비티로 이동하도록.