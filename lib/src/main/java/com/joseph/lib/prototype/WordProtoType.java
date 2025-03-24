package com.joseph.lib.prototype;

import java.util.ArrayList;

public class WordProtoType implements Cloneable {

    private String mTexts;
    private ArrayList<String> mImages = new ArrayList<>();

    public WordProtoType() {
        System.out.println("WordProtoType Constructor");
    }

    protected WordProtoType clone() throws CloneNotSupportedException {
        WordProtoType word = (WordProtoType) super.clone();
        word.mTexts = this.mTexts;
        word.mImages = (ArrayList<String>) this.mImages.clone();
        return word;
    }

    public String getmTexts() {
        return mTexts;
    }

    public void setmTexts(String mTexts) {
        this.mTexts = mTexts;
    }

    public ArrayList<String> getmImages() {
        return mImages;
    }

    public void setmImages(ArrayList<String> mImages) {
        this.mImages = mImages;
    }

    @Override
    public String toString() {
        return "WordProtoType{" +
                "mTexts='" + mTexts + '\'' +
                ", mImages=" + mImages +
                '}';
    }
}
