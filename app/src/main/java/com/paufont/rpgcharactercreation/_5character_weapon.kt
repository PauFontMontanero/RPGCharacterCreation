package com.paufont.rpgcharactercreation

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.paufont.rpgcharactercreation._0main_menu.Companion.REQUEST_CODE
import com.paufont.rpgcharactercreation.entities.Character

class _5character_weapon : AppCompatActivity() {
    private var recivedCharacter: Character? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout._5character_weapon)
        val recivedintent = intent
        recivedCharacter = recivedintent.getSerializableExtra("character") as? Character
    }
    fun goto_6character_sheet(view: View){

        var sendingintent = Intent(_5character_weapon@this,_6character_sheet::class.java)

        var editTextWeapon = findViewById<EditText>(R.id.strength)
        var weapon = editTextWeapon.text.toString()
        recivedCharacter?.weapon = weapon

        sendingintent.putExtra("character", recivedCharacter)
        startActivityForResult(sendingintent, REQUEST_CODE)
    }
}