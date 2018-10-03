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
                    new Pokemon("Bulbasaur", "01", "2'04", "15.2 lbs", "Seed Pokemon", "45", "49", "49", "65", "65", "45"),
                    new Pokemon("Ivysaur", "02", "3'03", "28.7lbs", "Seed Pokemon", "60", "62", "63", "80", "80", "60"),
                    new Pokemon("Venusaur", "03", "6'07", "220.5 lbs", "Seed Pokemon", "80", "82", "83","100", "100", "80"),
                    new Pokemon("Charmander", "04", "2'00", "18.7 lbs", "Lizard Pokemon", "39", "52", "43","60", "50", "65"),
                    new Pokemon("Charmeleon", "05", "3'07", "41.9 lbs", "Flame Pokemon", "58", "64", "58","80", "65", "80"),
                    new Pokemon("Charizard", "06", "5'07", "199.5 lbs", "Flame Pokemon", "78", "84", "78","109", "85", "100"),
                    new Pokemon("Squirtle", "07", "1'08", "19.8 lbs", "Tiny Turtle Pokemon", "44", "48", "65","50", "64", "43"),
                    new Pokemon("Wartortle", "08", "3'03", "49.6 lbs", "Turtle Pokemon", "59", "63", "80","65", "80", "58"),
                    new Pokemon("Blastoise", "09", "5'03", "18.5 lbs", "Shellfish Pokemon", "79", "83", "100","85", "105", "78"),
                    new Pokemon("Caterpie", "10", "1'00", "6.4 lbs", "Worm Pokemon", "45", "30", "35","20", "20", "45")};



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
