package com.example.localguide;

public class ArticlesModel {
    private int article_image;
    private String article_title;
    private String article_description;

    public int getArticle_image() {
        return article_image;
    }

    public void setArticle_image(int article_image) {
        this.article_image = article_image;
    }

    public String getArticle_title() {
        return article_title;
    }

    public void setArticle_title(String article_title) {
        this.article_title = article_title;
    }

    public String getArticle_description() {
        return article_description;
    }

    public void setArticle_description(String article_description) {
        this.article_description = article_description;
    }

    public ArticlesModel(int article_image, String article_title, String article_description) {
        this.article_image = article_image;
        this.article_title = article_title;
        this.article_description = article_description;
    }
}
