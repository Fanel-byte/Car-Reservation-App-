package com.example.tp3

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        /* binding=ActivityMain2Binding.inflate(layoutInflater)
         val view=binding.root
         setContentView(view)*/
        val v=intent.getSerializableExtra("car") as Voiture
        val message=intent.getStringExtra("message")
        val i=intent.getIntExtra("i",0)
        //val p=intent.getSerializableExtra("person") as Person
        var marque : TextView =  findViewById(R.id.marque)
        var moteur: TextView =  findViewById(R.id.moteur)
        var tarif : TextView=  findViewById(R.id.tarif)
        var capacitee : TextView =  findViewById(R.id.capacite)
        var picture: ImageView = findViewById(R.id.imageVoitureDetail)

          marque.text=v.marque
          picture.setImageResource(v.picture)
          moteur.text=  v.moteur
          tarif.text=   v.tarif.toString()
          capacitee.text=   v.capacite.toString()


    }
}