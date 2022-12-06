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
    lateinit var latitude:Array<Double>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }


}