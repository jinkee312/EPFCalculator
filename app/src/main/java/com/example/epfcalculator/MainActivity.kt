package com.example.epfcalculator

import android.app.DatePickerDialog
import android.icu.util.Calendar
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//
        txtDOB.setOnClickListener(){
            val c:Calendar = Calendar.getInstance();
            val currentDay =  c.get(Calendar.DAY_OF_MONTH)
            val currentMonth = c.get(Calendar.MONTH)
            val currentYear = c.get(Calendar.YEAR)

            val dpd = DatePickerDialog(this, DatePickerDialog.OnDateSetListener{ view, year, month, day -> txtDate.setText(day.toString() +
                                "/" + (month+1).toString() + "/" + year.toString())
                val age = currentYear - year
                txtage.setText(age.toString())
                var baseSaving =0.0
                var investment =0.0
                when(age){
                    in 16..20 ->{
                        baseSaving = 5000.00
                        investment = baseSaving*0.3
                        investamt.setText(investment.toString())
                        txt_min_sav.setText(baseSaving.toString())
                    }
                    in 21..25 ->{
                         baseSaving = 14000.00
                         investment = baseSaving*0.3
                        investamt.setText(investment.toString())
                        txt_min_sav.setText(baseSaving.toString())
                    }
                    in 26..30 ->{
                        baseSaving = 29000.00
                        investment = baseSaving*0.3
                        investamt.setText(investment.toString())
                        txt_min_sav.setText(baseSaving.toString())
                    }
                    in 31..35 ->{
                        baseSaving = 50000.00
                        investment = baseSaving*0.3
                        investamt.setText(investment.toString())
                        txt_min_sav.setText(baseSaving.toString())
                    }
                    in 36..40 ->{
                        baseSaving = 78000.00
                        investment = baseSaving*0.3
                        investamt.setText(investment.toString())
                        txt_min_sav.setText(baseSaving.toString())
                    }
                    in 41..45 ->{
                        baseSaving = 116000.00
                        investment = baseSaving*0.3
                        investamt.setText(investment.toString())
                        txt_min_sav.setText(baseSaving.toString())
                    }
                    in 46..50 ->{
                        baseSaving = 165000.00
                        investment = baseSaving*0.3
                        investamt.setText(investment.toString())
                        txt_min_sav.setText(baseSaving.toString())
                    }
                    else ->{
                        baseSaving = 228000.00
                        investment = baseSaving*0.3
                        investamt.setText(investment.toString())
                        txt_min_sav.setText(baseSaving.toString())
                    }
                }

            }
                , currentYear, currentMonth, currentDay)


            dpd.show()
        }

    }
}
