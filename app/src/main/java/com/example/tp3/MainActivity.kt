package com.example.tp3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var newRecyclerView: RecyclerView
    private  lateinit var newArrayList: ArrayList<Voiture>
    lateinit var imageid: Array<Int>
    lateinit var marque: Array<String>
    lateinit var moteur: Array<String>
    lateinit var tarif: Array<Int>
    lateinit var availability: Array<String>
    lateinit var longtitude: Array<Double>
    lateinit var capacite: Array<Int>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageid= arrayOf(
            R.drawable.e,
            R.drawable.b,
            R.drawable.d,
            R.drawable.e,
            R.drawable.a,
            R.drawable.f

        )
        marque= arrayOf(
            "marque1", "marque2", "marque3", "marque4", "marque5", "marque6"

        )
        moteur= arrayOf(
            "moteur1", "moteur2", "moteur3", "moteur4", "moteur5", "moteur6"

        )
        tarif= arrayOf(
            5000,6000,2000,4500,2000,8000

        )
        availability= arrayOf(
            "available", " Not available","available", " Not available","available", " Not available"

        )
        longtitude= arrayOf(12.0,10.0,10.0,1.0,10.0,1.0)
        capacite= arrayOf(
            2,3,4,2,1,2
        )

        newRecyclerView=findViewById(R.id.recyclerView)
        newRecyclerView.layoutManager=LinearLayoutManager(this)
        newRecyclerView.setHasFixedSize(true)
        newArrayList= arrayListOf<Voiture>()
        getUserdata()
       /* binding.button.setOnClickListener{
            val intent = Intent(this,MainActivity2::class.java)
            //envoyer donnée
            intent.putExtra("message","test")
            intent.putExtra("i",5)
            val person1=Person("test","test")
            intent.putExtra("person",person1)
            startActivity(intent)
            //pour supprimer ancienne fenetre
            finish()
        }*/
    }

    private fun getUserdata() {
        for(i in imageid.indices ){
            val Voiture=Voiture(marque[i],moteur[i],tarif[i],availability[i],imageid[i], longtitude[i],capacite[i])
            newArrayList.add(Voiture)
        }
        newRecyclerView.adapter=RecyclerViewAdapter(this,newArrayList)
    }
}