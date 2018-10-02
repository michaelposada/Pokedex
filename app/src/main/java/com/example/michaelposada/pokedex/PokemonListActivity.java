package com.example.michaelposada.pokedex;

import android.support.v4.app.Fragment;

public class PokemonListActivity extends SinglePokemonFragment {

    @Override
    protected Fragment createFragment() {
        return new PokemonFragmentList();
    }
}
