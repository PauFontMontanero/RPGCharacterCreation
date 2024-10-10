package com.paufont.rpgcharactercreation

import android.content.Intent
import android.media.audiofx.AudioEffect.Descriptor
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.paufont.rpgcharactercreation._0main_menu.Companion.REQUEST_CODE
import com.paufont.rpgcharactercreation.entities.Character
import org.w3c.dom.Text

class _6character_sheet : AppCompatActivity() {
    private var recivedCharacter: Character? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout._6character_sheet)
        val recivedintent = intent
        recivedCharacter = recivedintent.getSerializableExtra("character") as? Character
        fillFields(recivedCharacter)
    }
    fun goto_0main_menu(view: View){
        var i = Intent(_6character_sheet@this,_0main_menu::class.java)

        startActivityForResult(i, REQUEST_CODE)
    }
    fun fillFields(character: Character?){
        var nameTV = findViewById<TextView>(R.id.Name)
        nameTV.text = nameTV.text.toString() + character?.name

        var raceTV = findViewById<TextView>(R.id.race)
        raceTV.text = raceTV.text.toString() + character?.race

        var classTV = findViewById<TextView>(R.id.characterClass)
        classTV.text = classTV.text.toString()  + character?.characterClass

        var HPTV = findViewById<TextView>(R.id.HP)
        HPTV.text = HPTV.text.toString() + character?.hitPoints

        var StrengthTV = findViewById<TextView>(R.id.strength)
        StrengthTV.text = StrengthTV.text.toString() + character?.strength

        var DexterityTV = findViewById<TextView>(R.id.dexterity)
        DexterityTV.text = DexterityTV.text.toString() + character?.dexterity

        var ConstitutionTV = findViewById<TextView>(R.id.constitution)
        ConstitutionTV.text = ConstitutionTV.text.toString() + character?.constitution

        var IntellengenceTV = findViewById<TextView>(R.id.intelligence)
        IntellengenceTV.text = IntellengenceTV.text.toString() + character?.intelligence

        var WisdomTV = findViewById<TextView>(R.id.wisdom)
        WisdomTV.text = WisdomTV.text.toString() + character?.wisdom

        var CharismaTV = findViewById<TextView>(R.id.charisma)
        CharismaTV.text = CharismaTV.text.toString() + character?.charisma

        var DescriptionTV = findViewById<TextView>(R.id.description)
        DescriptionTV.text = DescriptionTV.text.toString() + character?.description

        var LevelTV = findViewById<TextView>(R.id.level)
        LevelTV.text = LevelTV.text.toString() + 0

        var ExperienceTV = findViewById<TextView>(R.id.experience)
        ExperienceTV.text = ExperienceTV.text.toString() + 0

        var GoldTV = findViewById<TextView>(R.id.gold)
        GoldTV.text = GoldTV.text.toString() + character?.gold

        var WeaponTV = findViewById<TextView>(R.id.weapon)
        WeaponTV.text = WeaponTV.text.toString() + character?.weapon
    }
}