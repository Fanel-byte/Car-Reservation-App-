package com.example.tp3

import java.io.Serializable

data class Voiture(var marque:String,
                   var moteur:String,
                   var tarif:Int,
                   var availability:String,
                   var picture:Int,
                    var longtitude:Double,
                    var capacite:Int): Serializable