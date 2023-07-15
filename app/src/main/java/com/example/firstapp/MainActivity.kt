package com.example.firstapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.text.Editable
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //inisiasi id
        val etTebak = findViewById<EditText>(R.id.etTebakGambar)
        val btnTebak = findViewById<Button>(R.id.btnTebak)
        val ivBenar = findViewById<ImageView>(R.id.ivBenar)
        val ivSalah = findViewById<ImageView>(R.id.ivSalah)

        //masukkan jawaban
        val jawaban: Editable? = etTebak.text

        //ketika mengklik tombol tebak
        btnTebak.setOnClickListener {
            if (jawaban.toString().lowercase() == "mobil") {
                Toast.makeText(this, jawaban, Toast.LENGTH_SHORT).show()
                ivBenar.visibility = View.VISIBLE
                ivSalah.visibility = View.GONE
            } else {
                Toast.makeText(this, jawaban, Toast.LENGTH_SHORT).show()
                ivBenar.visibility = View.GONE
                ivSalah.visibility = View.VISIBLE
            }
        }
    }
}