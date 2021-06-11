package com.nyt.apiendpoint.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.nyt.apiendpoint.R;
import com.nyt.apiendpoint.models.News;

import java.util.ArrayList;

public class NewsAdapter  extends RecyclerView.Adapter<NewsAdapter.ViewHolder> {


    int myPos = 0;


    Context context;
    ArrayList<News> models;


    public NewsAdapter(Context context, ArrayList<News> models) {
        this.context = context;
        this.models = models;
    }


    @NonNull
    @Override
    public NewsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate( R.layout.activity_news_details, parent,false);
        return new NewsAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NewsAdapter.ViewHolder holder, int position) {










    }

    @Override
    public int getItemCount() {
        return models.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView txt_title;

        TextView byline;

        public ViewHolder(View itemView) {
            super(itemView);

            txt_title = itemView.findViewById(R.id.storytitle);

            byline = itemView.findViewById(R.id.byliner);
        }
    }
}

