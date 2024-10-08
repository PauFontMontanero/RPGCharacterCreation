package com.paufont.rpgcharactercreation

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.paufont.rpgcharactercreation._0main_menu.Companion.REQUEST_CODE

class _4character_description : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout._4character_description)
    }
    fun goto_5character_weapon(view: View){

        var i = Intent(_4character_description@this,_5character_weapon::class.java)

        startActivityForResult(i, REQUEST_CODE)
    }
}