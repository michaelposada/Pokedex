package com.example.michaelposada.pokedex;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.UUID;

public class PokemonFragment extends Fragment {


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

    private ImageView mImage;

    private Integer[] imageName = {
            R.drawable.bulbasaur,R.drawable.ivysaur,R.drawable.venusaur,
            R.drawable.charmander,R.drawable.charmeleon,R.drawable.charizard,
            R.drawable.squirtle,R.drawable.wartortle,R.drawable.blastoise,
            R.drawable.caterpie };



    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ID =  (UUID) getActivity().getIntent().getSerializableExtra(PokedexActivity.EXTRA_POKEMON_ID);

        mPokemon = mPokemonLab.get(getActivity()).getPokemon(ID);

    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
         View v = inflater.inflate(R.layout.fragment_pokemon, container, false);

         mImage = v.findViewById(R.id.pokemon_pics1);
         Integer i = Integer.valueOf(mPokemon.getMpokemonID()) -1;
         Drawable draw = getResources().getDrawable(imageName[i]);
         mImage.setImageDrawable(draw);
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
