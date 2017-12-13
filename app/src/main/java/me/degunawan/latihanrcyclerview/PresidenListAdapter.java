package me.degunawan.latihanrcyclerview;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by tik on 12/13/17.
 */

public class PresidenListAdapter extends RecyclerView.Adapter<PresidenListAdapter.PresidenViewHolder> {

    ArrayList<Presiden> data;
    Context context;

    public PresidenListAdapter(ArrayList<Presiden> data, Context context) {
        this.data = data;
        this.context = context;
    }

    @Override
    public PresidenViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.presiden, parent, false);
        return new PresidenViewHolder(v);
    }

    @Override
    public void onBindViewHolder(final PresidenViewHolder holder, int position) {
        final Presiden presiden = data.get(position);

        holder.namaPresiden.setText(presiden.getNama());
        holder.presidenKeBerapa.setText(presiden.getKe_berapa());
        holder.masaJabatan.setText(presiden.getMasa_jabatan());

        holder.moreInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = presiden.getMore_info();

                // Parse the URI and create the intent.
                Uri webpage = Uri.parse(url);
                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);

                // Find an activity to hand the intent and start that activity.
                if (intent.resolveActivity(context.getPackageManager()) != null) {
                    context.startActivity(intent);
                } else {
                    Log.d("ImplicitIntents", "Can't handle this intent!");
                }
            }

        });

        holder.buttonGallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Baru mau buka gallery", Toast.LENGTH_SHORT)
                        .show();
            }
        });

        Picasso.with(context).load(presiden.getGambar_presiden()).into(holder.gambarPresiden);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class PresidenViewHolder extends RecyclerView.ViewHolder{
        ImageView gambarPresiden;
        TextView namaPresiden, presidenKeBerapa, masaJabatan;
        Button moreInfo, buttonGallery;

        public PresidenViewHolder(View itemView) {
            super(itemView);

            gambarPresiden = itemView.findViewById(R.id.gambarPresiden);
            namaPresiden = itemView.findViewById(R.id.namaPresiden);
            presidenKeBerapa = itemView.findViewById(R.id.presidenKeBerapa);
            moreInfo = itemView.findViewById(R.id.moreInfo);
            masaJabatan = itemView.findViewById(R.id.masaJabatan);
            buttonGallery = itemView.findViewById(R.id.buttonGallery);
        }
    }
}
