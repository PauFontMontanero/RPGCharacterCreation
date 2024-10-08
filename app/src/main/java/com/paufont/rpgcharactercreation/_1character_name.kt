package com.paufont.rpgcharactercreation

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.paufont.rpgcharactercreation._0main_menu.Companion.REQUEST_CODE

class _1character_name : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout._1character_name)
    }
    fun goto_2character_race_class(view: View){

        var i = Intent(_1character_name@this,_2character_race_class::class.java)

        startActivityForResult(i, REQUEST_CODE)
    }
}