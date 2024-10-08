package com.paufont.rpgcharactercreation

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.paufont.rpgcharactercreation._0main_menu.Companion.REQUEST_CODE

class _2character_race_class : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout._2character_race_class)
    }
    fun goto_3character_attributes(view: View){

        var i = Intent(_2character_race_class@this,_3character_attributes::class.java)

        startActivityForResult(i, REQUEST_CODE)
    }
}