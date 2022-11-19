package com.example.tp3

import android.annotation.SuppressLint
import android.app.DatePickerDialog
import android.app.TimePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputType
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import java.text.SimpleDateFormat
import java.util.*
import android.view.ViewGroup
import android.widget.*

class MainActivity2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        /* binding=ActivityMain2Binding.inflate(layoutInflater)
         val view=binding.root
         setContentView(view)*/
        val v = intent.getSerializableExtra("car") as Voiture
        val message = intent.getStringExtra("message")
        val i = intent.getIntExtra("i", 0)
        //val p=intent.getSerializableExtra("person") as Person
        var marque: TextView = findViewById(R.id.marque)
        var moteur: TextView = findViewById(R.id.moteur)
        var tarif: TextView = findViewById(R.id.tarif)
        var capacitee: TextView = findViewById(R.id.capacite)
        var picture: ImageView = findViewById(R.id.imageVoitureDetail)

        marque.text = v.marque
        picture.setImageResource(v.picture)
        moteur.text = v.moteur
        tarif.text = v.tarif.toString()
        capacitee.text = v.capacite.toString()
        val editTextDate = findViewById(R.id.editTextDate) as EditText
        val editTextTime = findViewById(R.id.editTextTime) as EditText
        val reserve = findViewById(R.id.Valider) as Button
        // read only
        editTextDate.inputType = InputType.TYPE_NULL
        editTextTime.inputType = InputType.TYPE_NULL

        // Date
        editTextDate.setOnClickListener {
            val cal = Calendar.getInstance()
            val picker = DatePickerDialog.OnDateSetListener { datePicker, year, month, day ->
                cal.set(Calendar.YEAR, year)
                cal.set(Calendar.MONTH, month)
                cal.set(Calendar.DAY_OF_MONTH, day)
                editTextDate.setText(SimpleDateFormat("dd/MM/yyyy").format(cal.time))
            }

            DatePickerDialog(
                this, picker, cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(
                    Calendar.DAY_OF_MONTH
                )
            ).show()

        }

        editTextTime.setOnClickListener {
            // Time
            val cal = Calendar.getInstance()
            val picker = TimePickerDialog.OnTimeSetListener { timePicker, hour, time ->
                cal.set(Calendar.HOUR_OF_DAY, hour)
                cal.set(Calendar.MINUTE, time)
                editTextTime.setText(SimpleDateFormat("HH:mm").format(cal.time))
            }

            TimePickerDialog(
                this,
                picker,
                cal.get(Calendar.HOUR_OF_DAY),
                cal.get(Calendar.MINUTE),
                true
            ).show()

        }

        reserve.setOnClickListener() {
            Toast.makeText(this, "Votre réservation est validée", Toast.LENGTH_SHORT).show()
        }
    }
}