package com.xishuipang.xishuipang01.Model;

public class CurrentArticleModal {

    public static final boolean simplified=true;
    public static final boolean traditional=false;

    private int volume;
    private String author;
    private String category;
    boolean character;
    private String content;
    private String image;


    public CurrentArticleModal(int volume, String author, String category, boolean character, String content, String image) {
        this.volume = volume;
        this.author = author;
        this.category = category;
        this.character = character;
        this.content = content;
        this.image = image;
    }


    public int getVolume() {
        return volume;
    }

    public String getAuthor() {
        return author;
    }

    public String getCategory() {
        return category;
    }

    public boolean isCharacter() {
        return character;
    }

    public String getContent() {
        return content;
    }

    public String getImage() {
        return image;
    }







}
