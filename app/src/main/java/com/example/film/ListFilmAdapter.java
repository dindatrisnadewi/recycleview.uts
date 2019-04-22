package com.example.film;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListFilmAdapter extends RecyclerView.Adapter<ListFilmAdapter.CategoryViewHolder> {
    private Context context;

    private ArrayList<Film> getListFilm() {
        return listFilm;
    }

    void setListFilm(ArrayList<Film> listFilm) {
        this.listFilm = listFilm;
    }

    private ArrayList<Film> listFilm;

    ListFilmAdapter(Context context) {
        this.context = context;
    }



    @NonNull
    @Override
    public ListFilmAdapter.CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemRow = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_film, viewGroup, false);
        return new CategoryViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull ListFilmAdapter.CategoryViewHolder categoryViewHolder, final int position) {
        categoryViewHolder.tvName.setText(getListFilm().get(position).getName());
        categoryViewHolder.tvRemarks.setText(getListFilm().get(position).getRemarks());
        Glide.with(context)
                .load(getListFilm().get(position).getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(categoryViewHolder.imgPhoto);

        categoryViewHolder.imgPhoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context.getApplicationContext(), DetailListActivity.class);
                i.putExtra("name",getListFilm().get(position).getName());
                i.putExtra("deskrip",getListFilm().get(position).getDeskrip());
                i.putExtra("gambar",getListFilm().get(position).getPhoto());
                context.startActivity(i);

            }
        });

        categoryViewHolder.detail_list.setOnClickListener(new View.OnClickListener() {
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

    public class CategoryViewHolder extends RecyclerView.ViewHolder {
        TextView tvName;
        TextView tvRemarks;
        ImageView imgPhoto;
        LinearLayout detail_list;

        public CategoryViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvRemarks = itemView.findViewById(R.id.tv_item_remarks);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            detail_list = itemView.findViewById(R.id.list_linier);
        }
    }
}
