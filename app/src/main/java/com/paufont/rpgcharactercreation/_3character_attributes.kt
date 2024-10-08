package com.paufont.rpgcharactercreation

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.paufont.rpgcharactercreation._0main_menu.Companion.REQUEST_CODE

class _3character_attributes : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout._3character_attributes)
    }
    fun goto_4character_description(view: View){

        var i = Intent(_3character_attributes@this,_4character_description::class.java)

        startActivityForResult(i, REQUEST_CODE)
    }
}