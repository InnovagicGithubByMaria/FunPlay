package com.example.funplay

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.funplay.databinding.ActivityMainBinding
import com.example.mylibrary.TestClass

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.button.setOnClickListener {
            TestClass.showMsg(this, "Hello World")
        }
    }
}