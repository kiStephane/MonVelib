package com.stephaneki.monvelib.fragments;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by stephaneki on 10/09/2018 .
 */
class FavoritesListAdapter extends RecyclerView.Adapter<FavoritesListAdapter.FavoriteViewHolder> {


    @NonNull
    @Override
    public FavoriteViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull FavoriteViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class FavoriteViewHolder extends RecyclerView.ViewHolder{

        public FavoriteViewHolder(View itemView) {
            super(itemView);
        }
    }

}
