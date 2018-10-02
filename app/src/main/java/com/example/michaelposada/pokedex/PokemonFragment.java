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

         mName = v.findViewById(R.id.pokemon_title);
         //I can set text after intents work
         mName.setText(mPokemon.getMpokemonName());

         mID = v.findViewById(R.id.pokemon_id);

         mHeight = v.findViewById(R.id.pokemon_height);

         mWeight = v.findViewById(R.id.pokemon_weight);

         mCatergory = v.findViewById(R.id.pokemon_catergory);

         mHp = v.findViewById(R.id.pokemon_hp);

         mAttack = v.findViewById(R.id.pokemon_attack);

         mDefense = v.findViewById(R.id.pokemon_defense);

         mSpa = v.findViewById(R.id.pokemon_spa);

         mSpd = v.findViewById(R.id.pokemon_spd);
         mSpeed = v.findViewById(R.id.pokemon_speed);

        return v;
    }


}
