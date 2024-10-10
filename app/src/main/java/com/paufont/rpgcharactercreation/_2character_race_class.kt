package com.paufont.rpgcharactercreation

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.Spinner
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.paufont.rpgcharactercreation._0main_menu.Companion.REQUEST_CODE
import com.paufont.rpgcharactercreation.entities.Character

class _2character_race_class : AppCompatActivity() {
    private var recivedCharacter: Character? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout._2character_race_class)
        val recivedintent = intent
        recivedCharacter = recivedintent.getSerializableExtra("character") as? Character
        val races = arrayOf("Human", "Elf","Dwarf", "Orc","Gnome","Lizard Man","Drow")

        val racesSpinner = findViewById<Spinner>(R.id.characterRaceSpinner);
        val adapterRaces = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item,races)
        adapterRaces.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        racesSpinner.adapter = adapterRaces

        val classes = arrayOf("Wizard","Rogue","Paladin","Cleric","Barbarian")
        val classesSpinner = findViewById<Spinner>(R.id.characterClassSpinner);
        val adapterClasses = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item,classes)
        adapterClasses.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        classesSpinner.adapter = adapterClasses
    }
    fun goto_3character_attributes(view: View){

        var sendingintent = Intent(_2character_race_class@this,_3character_attributes::class.java)
        var SpinnerRace = findViewById<Spinner>(R.id.characterRaceSpinner)
        var SpinnerClass = findViewById<Spinner>(R.id.characterClassSpinner)

        var race = SpinnerRace.selectedItem.toString()
        var characterClass = SpinnerClass.selectedItem.toString()
        recivedCharacter?.race = race
        recivedCharacter?.characterClass = characterClass
        sendingintent.putExtra("character", recivedCharacter)
        startActivityForResult(sendingintent, REQUEST_CODE)
    }
}