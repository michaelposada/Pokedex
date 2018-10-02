package com.example.michaelposada.pokedex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.UUID;

public class Pokemon {

    private UUID uniqueID;



    public UUID getUniqueID() {
        return uniqueID;
    }

    public void setUniqueID(UUID uniqueID) {
        this.uniqueID = uniqueID;
    }

    private String mpokemonName;
    private int mpokemonID;
    private String mheight;
    private String mweight;
    private String mCatergory;
    private int mHp;
    private int mAttack;
    private int mDefense;
    private int mSpa;
    private int mSpd;
    private int mSpeed;


    public Pokemon(String pokemonName, int pokemonID, String height, String weight, String Catergory, int hp, int attack, int defense,
                   int spa, int spd, int speed)
    {

        uniqueID = UUID.randomUUID();
        mpokemonName = pokemonName;
        mpokemonID = pokemonID;
        mheight =height;
        mweight =weight;
        mCatergory = Catergory;
        mHp= hp;
        mAttack = attack;
        mDefense = defense;
        mSpa = spa;
        mSpd = spd;
        mSpeed = speed;
    }

    public String getMpokemonName() {
        return mpokemonName;
    }

    public int getMpokemonID()
    {
        return mpokemonID;
    }

    public String getMheight() {
        return mheight;
    }

    public String getMweight() {
        return mweight;
    }

    public String getmCatergory() {
        return mCatergory;
    }

    public int getmHp() {
        return mHp;
    }

    public int getmAttack() {
        return mAttack;
    }

    public int getmDefense() {
        return mDefense;
    }

    public int getmSpa() {
        return mSpa;
    }

    public int getmSpd() {
        return mSpd;
    }

    public int getmSpeed() {
        return mSpeed;
    }

    public void setMpokemonName(String mpokemonName) {
        this.mpokemonName = mpokemonName;
    }

    public void setMpokemonID(int mpokemonID) {
        this.mpokemonID = mpokemonID;
    }

    public void setMheight(String mheight) {
        this.mheight = mheight;
    }

    public void setMweight(String mweight) {
        this.mweight = mweight;
    }

    public void setmCatergory(String mCatergory) {
        this.mCatergory = mCatergory;
    }

    public void setmHp(int mHp) {
        this.mHp = mHp;
    }

    public void setmAttack(int mAttack) {
        this.mAttack = mAttack;
    }

    public void setmDefense(int mDefense) {
        this.mDefense = mDefense;
    }

    public void setmSpa(int mSpa) {
        this.mSpa = mSpa;
    }

    public void setmSpd(int mSpd) {
        this.mSpd = mSpd;
    }

    public void setmSpeed(int mSpeed) {
        this.mSpeed = mSpeed;
    }
}
