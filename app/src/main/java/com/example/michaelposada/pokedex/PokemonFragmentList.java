package com.example.michaelposada.pokedex;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;


public class PokemonFragmentList extends Fragment {

    private RecyclerView mCrimeRecyclerView;
    private PokemonAdapter mAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view =
                inflater.inflate(R.layout.pokemon_list, container, false);
        mCrimeRecyclerView = (RecyclerView) view.findViewById(R.id.pokemon_recycler_view);
        mCrimeRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        updateUI();
        return view;
    }

    private void updateUI()
    {
        PokemonLab pokemonLab = PokemonLab.get(getActivity());
        List<Pokemon> pokemons = pokemonLab.getPokemons();
        mAdapter = new PokemonAdapter(pokemons);
        mCrimeRecyclerView.setAdapter(mAdapter);
    }


    private class PokemonHolder extends RecyclerView.ViewHolder implements View.OnClickListener
    {
        private TextView mNameTextView;
        private TextView mIDTextView;
        private Pokemon mPokemon;


        public PokemonHolder(LayoutInflater inflater, ViewGroup parent)
        {


            super(inflater.inflate(R.layout.pokemon_list,parent,false));
            itemView.setOnClickListener(this);
            mNameTextView = (TextView) itemView.findViewById(R.id.pokemon_title);
            mIDTextView = (TextView)  itemView.findViewById(R.id.pokemon_id);

        }

        public void onClick(View view)
        {
           Intent intent =  PokedexActivity.newIntent(getActivity(), mPokemon.getUniqueID());
           startActivity(intent);
        }
        public void bind(Pokemon pokemon)
        {
            mPokemon = pokemon;
            mNameTextView.setText(mPokemon.getMpokemonName());
            mIDTextView.setText(mPokemon.getMpokemonID());
        }

    }

    private class PokemonAdapter extends RecyclerView.Adapter<PokemonHolder> {
        private List<Pokemon> mPokemons;
        public PokemonAdapter(List<Pokemon> pokemons) {
            mPokemons = pokemons;
        }

        @Override
        public PokemonHolder
        onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater =
                    LayoutInflater.from(getActivity());
            return new PokemonHolder(layoutInflater,
                    parent);
        }
        @Override
        public void onBindViewHolder(PokemonHolder holder, int position) {

            Pokemon pokemon = mPokemons.get(position);
            holder.bind(pokemon);
        }
        @Override
        public int getItemCount() {
            return mPokemons.size();
        }

    }



}
