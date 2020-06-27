package com.example.hoclaptrinh;

public class lesson {
    String chapter;
    String description;

    public lesson(String chapter, String description) {
        this.chapter = chapter;
        this.description = description;
    }

    public String getChapter() {
        return chapter;
    }

    public void setChapter(String chapter) {
        this.chapter = chapter;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
