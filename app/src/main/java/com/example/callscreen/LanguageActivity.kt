package com.example.callscreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.callscreen.databinding.ActivityLanguageBinding

class LanguageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var Binding = ActivityLanguageBinding.inflate(layoutInflater)

        setContentView(Binding.root)

    }
}