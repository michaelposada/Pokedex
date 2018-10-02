package com.example.michaelposada.pokedex;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.UUID;

public class PokedexActivity extends SinglePokemonFragment {


    public static final String EXTRA_POKEMON_ID = "com.example.michaelposada.pokedex.EXTRA_POKEMON_ID";

    public static Intent newIntent(Context packageContext, UUID ID)
    {


        Intent intent = new Intent(packageContext, PokedexActivity.class);
        intent.putExtra(EXTRA_POKEMON_ID, ID);
        return intent;
    }

    @Override
    protected Fragment createFragment() {
        return new PokemonFragment();
    }
}
