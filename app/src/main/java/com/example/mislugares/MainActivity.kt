package com.example.mislugares

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val res = resources

        Toast.makeText( this, res.getString( R.string.app_name ), Toast.LENGTH_SHORT ).show()
    }
}