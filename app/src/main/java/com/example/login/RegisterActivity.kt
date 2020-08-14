package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        btn_registerregis.setOnClickListener {
            val email = edt_usernameregis.text.toString()
            val password = edt_passwordregis.text.toString()
            if (edt_usernameregis.text.toString().isEmpty() || edt_passwordregis.text.toString().isEmpty()){
                Toast.makeText(this, "Mohon diisi Semua", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            FirebaseAuth.getInstance().createUserWithEmailAndPassword(email,password)
                .addOnCompleteListener{

                    if (!it.isSuccessful){ return@addOnCompleteListener
                        val intent = Intent (this, MainActivity::class.java)
                        startActivity(intent)
                    }
                    else
                        Toast.makeText(this, "Succesfully sign up", Toast.LENGTH_SHORT).show()
                    val intent = Intent (this, dasboard::class.java)
                    startActivity(intent)
                }
                .addOnFailureListener{
                    Log.d("Main", "Failed Login: ${it.message}")
                    Toast.makeText(this, "Email/Password incorrect", Toast.LENGTH_SHORT).show()

                }


        }
        btn_loginregis.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}