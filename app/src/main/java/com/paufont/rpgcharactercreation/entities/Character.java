package com.paufont.rpgcharactercreation.entities;

import java.io.Serializable;
import java.util.Date;

public class Character implements Serializable {
    String Name;
    String Race;
    String characterClass;
    int Strength; //measuring physical power
    int Dexterity; //measuring agility
    int Constitution; //measuring endurance
    int Intelligence; //measuring reasoning and memory
    int Wisdom; //measuring perception and insight
    int Charisma; //measuring force of personality
    String Description; //Character background
    int Experience;
    int Level;
    int HitPoints;
    double Gold; // 1 is gold, 0,1 is silver, 0,01 its bronze
    String Weapon;
    Date CreationDate;

    public Character(String name, String race, String characterClass, int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma, String description, int experience, int level, int hitPoints, double gold, String weapon, Date creationDate) {
        Name = name;
        Race = race;
        this.characterClass = characterClass;
        Strength = strength;
        Dexterity = dexterity;
        Constitution = constitution;
        Intelligence = intelligence;
        Wisdom = wisdom;
        Charisma = charisma;
        Description = description;
        Experience = experience;
        Level = level;
        HitPoints = hitPoints;
        Gold = gold;
        Weapon = weapon;
        CreationDate = creationDate;
    }

    public Character() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getRace() {
        return Race;
    }

    public void setRace(String race) {
        Race = race;
    }

    public String getCharacterClass() {
        return characterClass;
    }

    public void setCharacterClass(String characterClass) {
        this.characterClass = characterClass;
    }

    public int getStrength() {
        return Strength;
    }

    public void setStrength(int strength) {
        Strength = strength;
    }

    public int getDexterity() {
        return Dexterity;
    }

    public void setDexterity(int dexterity) {
        Dexterity = dexterity;
    }

    public int getConstitution() {
        return Constitution;
    }

    public void setConstitution(int constitution) {
        Constitution = constitution;
    }

    public int getIntelligence() {
        return Intelligence;
    }

    public void setIntelligence(int intelligence) {
        Intelligence = intelligence;
    }

    public int getWisdom() {
        return Wisdom;
    }

    public void setWisdom(int wisdom) {
        Wisdom = wisdom;
    }

    public int getCharisma() {
        return Charisma;
    }

    public void setCharisma(int charisma) {
        Charisma = charisma;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getExperience() {
        return Experience;
    }

    public void setExperience(int experience) {
        Experience = experience;
    }

    public int getLevel() {
        return Level;
    }

    public void setLevel(int level) {
        Level = level;
    }

    public int getHitPoints() {
        return HitPoints;
    }

    public void setHitPoints(int hitPoints) {
        HitPoints = hitPoints;
    }

    public double getGold() {
        return Gold;
    }

    public void setGold(double gold) {
        Gold = gold;
    }

    public String getWeapon() {
        return Weapon;
    }

    public void setWeapon(String weapon) {
        Weapon = weapon;
    }

    public Date getCreationDate() {
        return CreationDate;
    }

    public void setCreationDate(Date creationDate) {
        CreationDate = creationDate;
    }

    @Override
    public String toString() {
        return "Character{" +
                "Name='" + Name + '\'' +
                ", Race='" + Race + '\'' +
                ", characterClass='" + characterClass + '\'' +
                ", Strength=" + Strength +
                ", Dexterity=" + Dexterity +
                ", Constitution=" + Constitution +
                ", Intelligence=" + Intelligence +
                ", Wisdom=" + Wisdom +
                ", Charisma=" + Charisma +
                ", Description='" + Description + '\'' +
                ", Experience=" + Experience +
                ", Level=" + Level +
                ", HitPoints=" + HitPoints +
                ", Gold=" + Gold +
                ", Weapon='" + Weapon + '\'' +
                ", CreationDate=" + CreationDate +
                '}';
    }
}
