package com.example.tipcal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

import com.example.tipcal.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.convertCurrency.setOnClickListener {
            binding.tipView.text = "Tip Total: "
        }

        binding.convertCurrency.setOnLongClickListener {
            binding.tipView.text = "Please enter total."
            false
        }
    }
}
