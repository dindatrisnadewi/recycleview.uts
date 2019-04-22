package com.example.film;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class GridFilmAdapter extends RecyclerView.Adapter<GridFilmAdapter.GridViewHolder> {
    private Context context;
    private ArrayList<Film> listFilm;
    private ArrayList<Film> getListFilm() {
        return listFilm;
    }
    public void setListFilm(ArrayList<Film> listFilm) {
        this.listFilm = listFilm;
    }
    public GridFilmAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public GridViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_grid_film, parent, false);
        return new GridViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GridViewHolder holder, final int position) {
        Glide.with(context)
                .load(getListFilm().get(position).getPhoto())
                .apply(new RequestOptions().override(350, 550))
                .into(holder.imgPhoto);

        holder.imgPhoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context.getApplicationContext(), DetailListActivity.class);
                i.putExtra("name",getListFilm().get(position).getName());
                i.putExtra("deskrip",getListFilm().get(position).getDeskrip());
                i.putExtra("gambar",getListFilm().get(position).getPhoto());
                context.startActivity(i);

            }
        });
    }

    @Override
    public int getItemCount() {
        return getListFilm().size();
    }

    public class GridViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;

        public GridViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
        }
    }
}
