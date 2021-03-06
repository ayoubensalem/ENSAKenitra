package com.badr.hourimeche.ensakenitra.models;


import com.google.gson.annotations.SerializedName;

public class Article {
    @SerializedName("image")
    private String image;
    @SerializedName("link")
    private String link;
    @SerializedName("title")
    private String title;
    @SerializedName("description")
    private String description ;

    public Article(String title, String description, String image, String link ) {
        this.image = image;
        this.link = link;
        this.title = title;
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
