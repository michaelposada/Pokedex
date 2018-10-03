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
    private String mpokemonID;
    private String mheight;
    private String mweight;
    private String mCatergory;
    private String mHp;
    private String mAttack;
    private String mDefense;
    private String mSpa;
    private String mSpd;
    private String mSpeed;


    public Pokemon(String pokemonName, String pokemonID, String height, String weight, String Catergory, String hp, String attack, String defense,
                   String spa, String spd, String speed)
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

    public String getMpokemonID()
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

    public String getmHp() {
        return mHp;
    }

    public String getmAttack() {
        return mAttack;
    }

    public String getmDefense() {
        return mDefense;
    }

    public String getmSpa() {
        return mSpa;
    }

    public String getmSpd() {
        return mSpd;
    }

    public String getmSpeed() {
        return mSpeed;
    }

    public void setMpokemonName(String mpokemonName) {
        this.mpokemonName = mpokemonName;
    }

    public void setMpokemonID(String mpokemonID) {
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

    public void setmHp(String mHp) {
        this.mHp = mHp;
    }

    public void setmAttack(String mAttack) {
        this.mAttack = mAttack;
    }

    public void setmDefense(String mDefense) {
        this.mDefense = mDefense;
    }

    public void setmSpa(String mSpa) {
        this.mSpa = mSpa;
    }

    public void setmSpd(String mSpd) {
        this.mSpd = mSpd;
    }

    public void setmSpeed(String mSpeed) {
        this.mSpeed = mSpeed;
    }
}
