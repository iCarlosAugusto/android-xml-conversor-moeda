package com.example.myapplication

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnDolar.setOnClickListener {
            val inputValue = binding.coinInput.text.toString();
            if(inputValue.isNotEmpty()){
                writeValue(5.0);
            }

        }

        binding.btnReais.setOnClickListener {
            val inputValue = binding.coinInput.text.toString();
            if(inputValue.isNotEmpty()){
                writeValue(2.0)
            }
        }
    }


    private fun writeValue(tax: Double) {
        val inputValue = binding.coinInput.text.toString();
        binding.textResult.text = "Valor: ${inputValue.toInt() * tax}"
        binding.textResult.visibility = TextView.VISIBLE;
    }
}