package com.paufont.rpgcharactercreation

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.paufont.rpgcharactercreation._0main_menu.Companion.REQUEST_CODE

class _6character_sheet : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout._6character_sheet)
    }
    fun goto_0main_menu(view: View){
        var i = Intent(_6character_sheet@this,_0main_menu::class.java)

        startActivityForResult(i, REQUEST_CODE)
    }
}