package com.paufont.rpgcharactercreation

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.paufont.rpgcharactercreation._0main_menu.Companion.REQUEST_CODE
import com.paufont.rpgcharactercreation.entities.Character
import java.util.Date

class _4character_description : AppCompatActivity() {
    private var recivedCharacter: Character? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout._4character_description)
        val recivedintent = intent
        recivedCharacter = recivedintent.getSerializableExtra("character") as? Character
    }
    fun goto_5character_weapon(view: View){

        var sendingintent = Intent(_4character_description@this,_5character_weapon::class.java)
        var editTextDescription = findViewById<EditText>(R.id.Description)
        //var editTextDate = findViewById<EditText>(R.id.date)

        var description = editTextDescription.text.toString()
        //var date = editTextDate.text.toString()

        recivedCharacter?.description = description
        //recivedCharacter?.creationDate = "2014-01-12"

        sendingintent.putExtra("character", recivedCharacter)
        startActivityForResult(sendingintent, REQUEST_CODE)
    }
}