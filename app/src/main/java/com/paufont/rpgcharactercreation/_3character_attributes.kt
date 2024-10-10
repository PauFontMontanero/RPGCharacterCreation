package com.paufont.rpgcharactercreation

import android.content.Intent
import android.os.Bundle
import android.telephony.CellSignalStrength
import android.view.View
import android.widget.EditText
import android.widget.SeekBar
import android.widget.SeekBar.OnSeekBarChangeListener
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.paufont.rpgcharactercreation._0main_menu.Companion.REQUEST_CODE
import com.paufont.rpgcharactercreation.entities.Character

class _3character_attributes : AppCompatActivity(), SeekBar.OnSeekBarChangeListener {

    //Creating global variables of the fields of the view
    private lateinit var strengthSeekBar: SeekBar
    private lateinit var strengthValue: TextView

    private lateinit var dexteritySeekBar: SeekBar
    private lateinit var dexterityValue: TextView

    private lateinit var constitutionSeekBar: SeekBar
    private lateinit var constitutionValue:TextView

    private lateinit var intelligenceSeekBar: SeekBar
    private lateinit var intelligenceValue:TextView

    private lateinit var wisdomSeekBar: SeekBar
    private lateinit var wisdomValue:TextView

    private lateinit var charismaSeekBar: SeekBar
    private lateinit var charismaValue:TextView


    //Recived player with the intent:
    private var recivedCharacter: Character? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout._3character_attributes)
        val recivedintent = intent
        recivedCharacter = recivedintent.getSerializableExtra("character") as? Character
        seekBarListeners()

    }
    fun seekBarListeners(){
        strengthSeekBar = findViewById<SeekBar>(R.id.strengthSeekBar)
        strengthSeekBar.setOnSeekBarChangeListener(this)
        strengthValue = findViewById<TextView>(R.id.StrengthValue)
        strengthValue.text = strengthSeekBar.progress.toString()

        dexteritySeekBar = findViewById<SeekBar>(R.id.dexteritySeekBar)
        dexteritySeekBar.setOnSeekBarChangeListener(this)
        dexterityValue = findViewById<TextView>(R.id.DexterityValue)
        dexterityValue.text = dexteritySeekBar.progress.toString()

        constitutionSeekBar = findViewById<SeekBar>(R.id.constitutionSeekBar)
        constitutionSeekBar.setOnSeekBarChangeListener(this)
        constitutionValue = findViewById<TextView>(R.id.ConstitutionValue)
        constitutionValue.text = constitutionSeekBar.progress.toString()

        intelligenceSeekBar = findViewById<SeekBar>(R.id.intelligenceSeekBar)
        intelligenceSeekBar.setOnSeekBarChangeListener(this)
        intelligenceValue = findViewById<TextView>(R.id.IntelligenceValue)
        intelligenceValue.text = intelligenceSeekBar.progress.toString()

        wisdomSeekBar = findViewById<SeekBar>(R.id.wisdomSeekBar)
        wisdomSeekBar.setOnSeekBarChangeListener(this)
        wisdomValue = findViewById<TextView>(R.id.WisdomValue)
        wisdomValue.text = wisdomSeekBar.progress.toString()

        charismaSeekBar = findViewById<SeekBar>(R.id.charismaSeekBar)
        charismaSeekBar.setOnSeekBarChangeListener(this)
        charismaValue = findViewById<TextView>(R.id.CharismaValue)
        charismaValue.text = charismaSeekBar.progress.toString()
    }
    fun goto_4character_description(view: View){

        var sendingintent = Intent(_3character_attributes@this,_4character_description::class.java)



        var str = strengthSeekBar.progress
        var dex = dexteritySeekBar.progress
        var cons = dexteritySeekBar.progress
        var int = intelligenceSeekBar.progress
        var wis = wisdomSeekBar.progress
        var cha = charismaSeekBar.progress

        recivedCharacter?.strength = str
        recivedCharacter?.dexterity = dex
        recivedCharacter?.constitution = cons
        recivedCharacter?.intelligence = int
        recivedCharacter?.wisdom = wis
        recivedCharacter?.charisma = cha

        sendingintent.putExtra("character", recivedCharacter)
        startActivityForResult(sendingintent, REQUEST_CODE)
    }

    override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
        if (p0 != null) {
            when (p0.id) {
                R.id.strengthSeekBar -> {
                    strengthValue.text = strengthSeekBar.progress.toString()
                }
                R.id.dexteritySeekBar -> {
                    dexterityValue.text = dexteritySeekBar.progress.toString()
                }
                R.id.constitutionSeekBar -> {
                    constitutionValue.text = constitutionSeekBar.progress.toString()
                }
                R.id.intelligenceSeekBar -> {
                    intelligenceValue.text = intelligenceSeekBar.progress.toString()
                }
                R.id.wisdomSeekBar -> {
                    wisdomValue.text = wisdomSeekBar.progress.toString()
                }
                R.id.charismaSeekBar -> {
                    charismaValue.text = charismaSeekBar.progress.toString()
                }
            }
        }
    }

    override fun onStartTrackingTouch(p0: SeekBar?) {

    }

    override fun onStopTrackingTouch(p0: SeekBar?) {

    }
}