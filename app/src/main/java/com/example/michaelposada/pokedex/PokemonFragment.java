package com.example.michaelposada.pokedex;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.UUID;

public class PokemonFragment extends Fragment {

    private static final String ARG_Pokemon_ID = "pokemon_id";

    private Pokemon mPokemon;
    private PokemonLab mPokemonLab;
    private UUID ID;

    private TextView mName;
    private TextView mID;
    private TextView mHeight;
    private TextView mWeight;
    private TextView mCatergory;
    private TextView mHp;
    private TextView mAttack;
    private TextView mDefense;
    private TextView mSpa;
    private TextView mSpd;
    private TextView mSpeed;



    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ID =  (UUID) getActivity().getIntent().getSerializableExtra(PokedexActivity.EXTRA_POKEMON_ID);

        mPokemon = mPokemonLab.get(getActivity()).getPokemon(ID);

    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
         View v = inflater.inflate(R.layout.fragment_pokemon, container, false);

         mName = v.findViewById(R.id.pokemon_name);
         mName.setText("Name: " + mPokemon.getMpokemonName());
         //I can set text after intents work
         mID = v.findViewById(R.id.pokemon_id);
         mID.setText("#" + mPokemon.getMpokemonID());
         mHeight = v.findViewById(R.id.pokemon_height);
         mHeight.setText("Height: " + mPokemon.getMheight());
         mWeight = v.findViewById(R.id.pokemon_weight);
         mWeight.setText("Weight: " + mPokemon.getMweight());
         mCatergory = v.findViewById(R.id.pokemon_catergory);
         mCatergory.setText("Catergory: " + mPokemon.getmCatergory());
         mHp = v.findViewById(R.id.pokemon_hp);
         mHp.setText("HP: " + mPokemon.getmHp());
         mAttack = v.findViewById(R.id.pokemon_attack);
         mAttack.setText("Attack: " + mPokemon.getmAttack());
         mDefense = v.findViewById(R.id.pokemon_defense);
         mDefense.setText("Defense: " + mPokemon.getmDefense());
         mSpa = v.findViewById(R.id.pokemon_spa);
         mSpa.setText("Special Attack: " + mPokemon.getmSpa());
         mSpd = v.findViewById(R.id.pokemon_spd);
         mSpd.setText("Speical Defense: " + mPokemon.getmSpd());
         mSpeed = v.findViewById(R.id.pokemon_speed);
         mSpeed.setText("Speed: " + mPokemon.getmSpeed());
        return v;
    }


}
