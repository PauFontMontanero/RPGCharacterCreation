package com.paufont.rpgcharactercreation

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.paufont.rpgcharactercreation.entities.Character
import com.paufont.rpgcharactercreation._0main_menu.Companion.REQUEST_CODE

class _1character_name : AppCompatActivity() {
    private var recivedCharacter: Character? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout._1character_name)
        val recivedintent = intent
        recivedCharacter = recivedintent.getSerializableExtra("character") as? Character
    }
    fun goto_2character_race_class(view: View){

        var sendingintent = Intent(_1character_name@this,_2character_race_class::class.java)
        var editText = findViewById<EditText>(R.id.characterName)
        var name = editText.text
        recivedCharacter?.name = name.toString()
        sendingintent.putExtra("character", recivedCharacter)
        startActivityForResult(sendingintent, REQUEST_CODE)
    }
}