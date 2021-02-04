package com.example.localguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ArticlesAdapter extends RecyclerView.Adapter<ArticlesAdapter.ArticleHolder> {

    Context context;
    List<ArticlesModel> data;

    public ArticlesAdapter(Context context, List<ArticlesModel> data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public ArticleHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.single_article,parent, false);
        return new ArticleHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ArticleHolder holder, int position) {
        holder.article_image.setImageResource(data.get(position).getArticle_image());
        holder.article_title.setText(data.get(position).getArticle_title());
        holder.article_description.setText(data.get(position).getArticle_description());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }


    class ArticleHolder extends RecyclerView.ViewHolder{

        ImageView article_image;
        TextView article_title, article_description;

        public ArticleHolder(@NonNull View itemView) {
            super(itemView);
            article_image = itemView.findViewById(R.id.article_image);
            article_title = itemView.findViewById(R.id.article_title);
            article_description = itemView.findViewById(R.id.article_description);

        }
    }
}
