package com.example.localguide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class ArticlesActivity extends AppCompatActivity {

    RecyclerView articles_recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_articles);

        articles_recyclerView = findViewById(R.id.articles_recyclerView);

        List<ArticlesModel> data = new ArrayList<>();

        ArticlesModel articlesModel0 = new ArticlesModel(R.drawable.picture1,"article 1", "this is the description of article 1");
        ArticlesModel articlesModel1 = new ArticlesModel(R.drawable.picture2,"article 2", "this is the description of article 2");
        ArticlesModel articlesModel2 = new ArticlesModel(R.drawable.picture3,"article 3", "this is the description of article 3");

        data.add(articlesModel0);
        data.add(articlesModel1);
        data.add(articlesModel2);

        ArticlesAdapter articlesAdapter = new ArticlesAdapter(ArticlesActivity.this, data);

        articles_recyclerView.setLayoutManager(new LinearLayoutManager(ArticlesActivity.this, RecyclerView.VERTICAL,false));
        articles_recyclerView.setAdapter(articlesAdapter);


    }


}