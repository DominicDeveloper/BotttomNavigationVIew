package com.dominic.bottomnavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import com.google.android.material.navigation.NavigationBarView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


       bottom_nav.setOnItemSelectedListener { 
           when(it.itemId){
               // 5 tadan ortib ketsa sigmaydi bottom navigationda
               R.id.my_like -> Toast.makeText(this, "Home", Toast.LENGTH_SHORT).show()
               R.id.my_home -> Toast.makeText(this, "Like", Toast.LENGTH_SHORT).show()
               R.id.mode -> Toast.makeText(this, "Mode", Toast.LENGTH_SHORT).show()
           }
           
           true
       }

    }
}