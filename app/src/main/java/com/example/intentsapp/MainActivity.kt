package com.example.intentsapp

import android.content.Intent
import android.nfc.Tag
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.View.OnClickListener
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.intentsapp.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayout.TabGravity



class MainActivity : AppCompatActivity(), OnClickListener {
    val Tag = "MainActivity"
    private  lateinit var binding: ActivityMainBinding
    lateinit var nombre: String
    lateinit var apellidos: String


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("MainActivity","onCreate Called")
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.submitButton.setOnClickListener(this)
        binding.browserButton.setOnClickListener(this)
    }

    override fun onStart() {
        super.onStart()
        Log.d("TAG", "onStart Called")
    }

    override fun onResume() {
        super.onResume()
        Log.d("TAG", "OnResume Called")
    }


    override fun onPause() {
        super.onPause()
        Log.d("TAG", "onPause Called")
    }

    override fun onStop() {
        super.onStop()
        Log.d("TAG", "onStop Called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("TAG", "onDestroy Called")
    }



    override fun onClick(v: View?) {
        when(v){
            binding.submitButton->{
               nombre = binding.firstNameText.text.toString()
               apellidos = binding.lastNameText.text.toString()
               intent = Intent(this,
                   ShowActivity::class.java).apply {
                   putExtra("Nombres", nombre)
                   putExtra("Apellidos", apellidos)
               }
                startActivity(intent)
            }
        }
    }
}