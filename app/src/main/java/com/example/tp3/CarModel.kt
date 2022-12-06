package com.example.tp3

import androidx.lifecycle.ViewModel

class CarModel: ViewModel(){


    val cars = loadData()


    private fun loadData():List<Voiture> {
        val car1=Voiture("marque1","moteur1",1250,"available",R.drawable.a, 12.0,100.0,2)
        val car2=Voiture("marque1","moteur1",1250,"available",R.drawable.a, 12.0,100.0,2)
        val car3=Voiture("marque1","moteur1",1250,"available",R.drawable.a, 12.0,100.0,2)
        val car4=Voiture("marque1","moteur1",1250,"available",R.drawable.a, 12.0,100.0,2)

        val car5=Voiture("marque1","moteur1",1250,"available",R.drawable.a, 12.0,100.0,2)

        val car6=Voiture("marque1","moteur1",1250,"available",R.drawable.a, 12.0,100.0,2)



        val list = mutableListOf(car1,car2,car3,car4,car5,car6)
        return  list
    }
}