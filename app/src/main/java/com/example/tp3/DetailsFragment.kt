package com.example.tp3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.example.tp3.databinding.FragmentDetailsBinding


class DetailsFragment : Fragment() {
    lateinit var binding:FragmentDetailsBinding
    lateinit var carModel:CarModel


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = FragmentDetailsBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        carModel = ViewModelProvider(requireActivity()).get(CarModel::class.java)
        val position = arguments?.getInt("position")
        if (position != null) {
            val cars = carModel.cars.get(position)
            binding.marque.text=cars.marque
            binding.capacite.text=cars.capacite.toString()
            binding.moteur.text=cars.moteur
            binding.tarif.text=cars.tarif.toString()
            binding.imageVoitureDetail.setImageResource(cars.picture)







        }



    }
}





