package com.example.tp3

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.AppCompatDrawableManager.get
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView
import java.lang.reflect.Array.get
import java.nio.file.Files.size


class RecyclerViewAdapter(val context: Context,var content:ArrayList<Voiture>):RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {


    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // Create a new view, which defines the UI of the list item
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_view, parent, false)

        return ViewHolder(view)
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val currentITem=content[position]
        holder.marque.text=currentITem.marque
        holder.picture.setImageResource(currentITem.picture)
        holder.moteur.text=currentITem.moteur
        holder.tarif.text= currentITem.tarif.toString()
        holder.avaliability.text= currentITem.availability.toString()
        holder.itemView.setOnClickListener {

            val intent = Intent(context, MainActivity2::class.java)
            //envoyer donnée
            intent.putExtra("car", currentITem)

            //intent.putExtra("person", person1)
            context.startActivity(intent)
            Toast.makeText(context,currentITem.marque,Toast.LENGTH_SHORT).show()
            //pour supprimer ancienne fenetre

        }



    }



    // Return the size of your dataset (invoked by the layout manager)
    //override fun getItemCount() = Voiture.size

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var marque : TextView = view.findViewById(R.id.NomVoiture_Marque_Modèle)
        var moteur: TextView = view.findViewById(R.id.TypeMoteur)
        var tarif : TextView= view.findViewById(R.id.TarifKmHeure)
        var avaliability : TextView = view.findViewById(R.id.Availability)
        var picture: ImageView=view.findViewById(R.id.imageVoiture)




    }

    override fun getItemCount(): Int {
        return content.size
    }
}