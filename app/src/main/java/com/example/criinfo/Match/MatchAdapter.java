package com.example.criinfo.Match;

import android.content.Context;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.criinfo.Home.Matchpojo;
import com.example.criinfo.Info.Player;
import com.example.criinfo.R;
import com.mikhaellopez.circularimageview.CircularImageView;

import java.util.ArrayList;

import javax.annotation.MatchesPattern;

public class MatchAdapter extends RecyclerView.Adapter<MatchAdapter.ViewHolder> {
    private Context context;
    private ArrayList<Matchpojo> playerArrayList;

    public MatchAdapter(Context context, ArrayList<Matchpojo> playerArrayList) {
        this.context = context;
        this.playerArrayList = playerArrayList;
    }

    @NonNull
    @Override
    public MatchAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.match_list,parent,false);
        return new MatchAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MatchAdapter.ViewHolder holder, int position) {
        Matchpojo matches = playerArrayList.get(position);
        holder.team1.setText(matches.getTeam1());
        holder.team2.setText(matches.getTeam2());
        holder.matchdescription.setText(matches.getMatchdescription());
        holder.typeofmatch.setText(matches.getTypeofmatch());
       // holder.toss.setText(matches.getToss());

    }

    @Override
    public int getItemCount() {
        return playerArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView  typeofmatch, matchdescription, team1, team2;


        public ViewHolder(View view) {
            super(view);
            team1 = view.findViewById(R.id.team1);
            team2 = view.findViewById(R.id.team2);
            typeofmatch = view.findViewById(R.id.typeofmatch);
            matchdescription = view.findViewById(R.id.matchdescription);

        }
    }
}

