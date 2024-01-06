package com.petra.guessthenumber

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val newGameButton:Button = findViewById(R.id.newGame)
        newGameButton.setOnClickListener(){
            val firstFragment : Fragment = firstFragment()
            val fragmentTransaction : FragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentLayout,firstFragment).commit()
        }
    }
}