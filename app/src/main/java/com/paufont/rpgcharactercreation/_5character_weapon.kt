package com.paufont.rpgcharactercreation

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.paufont.rpgcharactercreation._0main_menu.Companion.REQUEST_CODE

class _5character_weapon : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout._5character_weapon)
    }
    fun goto_6character_sheet(view: View){

        var i = Intent(_5character_weapon@this,_6character_sheet::class.java)

        startActivityForResult(i, REQUEST_CODE)
    }
}