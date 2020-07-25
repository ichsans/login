package com.example.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_login.setOnClickListener {
            if (edt_username.text.toString().isEmpty() || edt_password.text.toString().isEmpty()){
                Toast.makeText(this, "Mohon diisi Semua",Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(this, "Login masuk",Toast.LENGTH_SHORT).show()
            }
        }
    }
}