package com.paufont.rpgcharactercreation

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class _0main_menu : AppCompatActivity() {
    companion object {
        const val REQUEST_CODE = 100
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout._0main_menu)
    }
    fun goto_1character_name(view: View){

        var i = Intent(_0main_menu@this,_1character_name::class.java)

        startActivityForResult(i, REQUEST_CODE)
    }
}