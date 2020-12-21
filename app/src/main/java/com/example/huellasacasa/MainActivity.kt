package com.example.huellasacasa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var btn = findViewById<Button>(R.id.button_iniciar_sesion)
        btn.setOnClickListener(View.OnClickListener {
            var inicio = Intent(this,InicioSesion::class.java)
            startActivity(inicio)
        })
        var btn4 = findViewById<Button>(R.id.button_Registro)
        btn4.setOnClickListener(View.OnClickListener {
            var inicio = Intent(this,Registrar::class.java)
            startActivity(inicio)
        })
    }
}