package com.example.androidapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
//        LoginMolecule(
//            onLoginClicked = { username, password ->
//            },
//            onForgotPasswordClicked = {
//            },
//            modifier = Modifier
//                .fillMaxSize()
//                .padding(16.dp),
//            textFieldModifier = Modifier
//                .fillMaxWidth()
//                .padding(horizontal = 16.dp),
//            buttonModifier = Modifier
//                .width(200.dp)
//                .height(48.dp),
//            textModifier = Modifier
//                .padding(top = 16.dp)
//        )
    }
}