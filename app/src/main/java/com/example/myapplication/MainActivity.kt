package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun ajouter(view:View){
        var notreIdAchanger = compteurClick.text.toString().toInt()
        notreIdAchanger++
        compteurClick.text = notreIdAchanger.toString()
    }

    fun diminuer(view: View) {
        var idAdiminuer:Int = compteurClick.text.toString().toInt()
        if(idAdiminuer > 0) idAdiminuer--
        compteurClick.text = idAdiminuer.toString()
    }
}
