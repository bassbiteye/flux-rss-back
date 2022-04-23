package com.example.rssback.model;

import java.util.Date;

public class Item {
    private Long id;
    private String title;
    private String link;
    private String description;
    private String imageUrl;
    private Date pubDate;




    public Item(String title, String link, String description, String imageUrl, Date pubDate) {
        this.title = title;
        this.link = link;
        this.description = description;
        this.imageUrl = imageUrl;
        this.pubDate = pubDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Date getPubDate() {
        return pubDate;
    }

    public void setPubDate(Date pubDate) {
        this.pubDate = pubDate;
    }

}
