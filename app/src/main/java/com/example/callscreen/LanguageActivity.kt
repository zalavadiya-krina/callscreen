package com.example.callscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.callscreen.Fragment.Fragment1
import com.example.callscreen.databinding.ActivityLanguageBinding

class LanguageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var Binding = ActivityLanguageBinding.inflate(layoutInflater)

        Binding.languagearrow1.setOnClickListener {
            val intent = Intent(this, OnBordingActivity::class.java)
            startActivity(intent)

        }

        Binding.card1.setOnClickListener {
            Binding.radio1.isChecked = true
            Binding.radio2.isChecked = false
            Binding.radio3.isChecked = false
            Binding.radio4.isChecked = false
            Binding.radio5.isChecked = false
            Binding.radio6.isChecked = false
        }

        Binding.card2.setOnClickListener {
            Binding.radio1.isChecked = false
            Binding.radio2.isChecked = true
            Binding.radio3.isChecked = false
            Binding.radio4.isChecked = false
            Binding.radio5.isChecked = false
            Binding.radio6.isChecked = false
        }

        Binding.card3.setOnClickListener {
            Binding.radio1.isChecked = false
            Binding.radio2.isChecked = false
            Binding.radio3.isChecked = true
            Binding.radio4.isChecked = false
            Binding.radio5.isChecked = false
            Binding.radio6.isChecked = false
        }

        Binding.card4.setOnClickListener {
            Binding.radio1.isChecked = false
            Binding.radio2.isChecked = false
            Binding.radio3.isChecked = false
            Binding.radio4.isChecked = true
            Binding.radio5.isChecked = false
            Binding.radio6.isChecked = false
        }

        Binding.card5.setOnClickListener {
            Binding.radio1.isChecked = false
            Binding.radio2.isChecked = false
            Binding.radio3.isChecked = false
            Binding.radio4.isChecked = false
            Binding.radio5.isChecked = true
            Binding.radio6.isChecked = false
        }

        Binding.card6.setOnClickListener {
            Binding.radio1.isChecked = false
            Binding.radio2.isChecked = false
            Binding.radio3.isChecked = false
            Binding.radio4.isChecked = false
            Binding.radio5.isChecked = false
            Binding.radio6.isChecked = true
        }
        setContentView(Binding.root)

    }
}