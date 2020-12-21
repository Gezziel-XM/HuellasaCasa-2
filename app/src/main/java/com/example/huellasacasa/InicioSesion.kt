package com.example.huellasacasa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class InicioSesion : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio_sesion)
        var btn = findViewById<Button>(R.id.button_Entrar)
        btn.setOnClickListener(View.OnClickListener {
            var inicio = Intent(this,Home::class.java)
            startActivity(inicio)
        })
        var btn2 = findViewById<Button>(R.id.button_Flecha_regresar)
        btn2.setOnClickListener(View.OnClickListener {
            var inicio = Intent(this,MainActivity::class.java)
            startActivity(inicio)
        })
    }
}