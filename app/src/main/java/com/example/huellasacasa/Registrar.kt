package com.example.huellasacasa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Registrar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registrar)
        var btn = findViewById<Button>(R.id.button_Registrar)
        btn.setOnClickListener(View.OnClickListener {
            var inicio = Intent(this,Home::class.java)
            startActivity(inicio)
        })
        var btn3 = findViewById<Button>(R.id.button_Regresar)
        btn3.setOnClickListener(View.OnClickListener {
            var inicio = Intent(this,MainActivity::class.java)
            startActivity(inicio)
        })
    }
}