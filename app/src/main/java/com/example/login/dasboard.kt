package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.dasboard.*

class dasboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dasboard)

        btn_out.setOnClickListener {
            FirebaseAuth.getInstance().signOut()
            Toast.makeText(this, "Succesfully sign out", Toast.LENGTH_SHORT).show()
            val intent = Intent (this, MainActivity::class.java)
            startActivity(intent)
        }
    }

}