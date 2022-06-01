package com.example.filmstop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun buttonPlanPobeg(view: View) {

        val intent = Intent(this@MainActivity, MainActivity2::class.java)
        startActivity(intent)

    }

    fun buttonRokki7(view: View) {

        val intent1 = Intent(this@MainActivity, MainActivity3::class.java)
        startActivity(intent1)

    }

    fun buttonMcDonld2(view: View) {

        val intent2 = Intent(this@MainActivity, MainActivity4::class.java)
        startActivity(intent2)

    }

    fun buttonReshit(view: View) {

        val intent3 = Intent(this@MainActivity, MainActivity5::class.java)
        startActivity(intent3)

    }

    fun buttonOrationSpas(view: View) {

        val intent4 = Intent(this@MainActivity, MainActivity6::class.java)
        startActivity(intent4)

    }

    fun buttonLegenda(view: View) {

        val intent5 = Intent(this@MainActivity, MainActivity7::class.java)
        startActivity(intent5)

    }

}
























