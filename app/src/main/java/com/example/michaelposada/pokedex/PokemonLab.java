package com.example.michaelposada.pokedex;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class PokemonLab {

    private static PokemonLab sPokemonLab;
    private List<Pokemon> mPokemons = new ArrayList<>();

    Pokemon[] pokemonBank = new Pokemon[]
            {
                    new Pokemon("Bulbasaur", 01, "2'04", "15.2", "Seed", 45, 49, 49, 65, 65, 45),
                    new Pokemon("Ivysaur", 02, "3'03", "28.7", "Seed", 60, 62, 63, 80, 80, 60)
            };


    public static PokemonLab get(Context context) {
        if (sPokemonLab == null) {
            sPokemonLab = new PokemonLab(context);
        }
        return sPokemonLab;
    }

    private  PokemonLab(Context context)
    {
        for(int i = 0; i < pokemonBank.length; i++) {
            mPokemons.add(pokemonBank[i]);
        }
    }

    public List<Pokemon> getPokemons()
    {
        return mPokemons;
    }

    public Pokemon getPokemon(UUID id)
    {
        for(Pokemon pokemon : mPokemons)
        {
            if(pokemon.getUniqueID() == id)
            {
                return pokemon;
            }
        }
        return null;
    }










}
