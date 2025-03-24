package com.joseph.lib.prototype;

public class ProtoTypeTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        WordProtoType word = new WordProtoType();
        word.setmTexts("Hello");
        word.getmImages().add("image1");
        word.getmImages().add("image2");
        word.getmImages().add("image3");
        System.out.println("word:" + word);
        WordProtoType word2 = word.clone();
        System.out.println("word2:" + word2);
        word2.setmTexts("World");
        word2.getmImages().add("image4");
        System.out.println("word2:" + word2);
        System.out.println("word:" + word);
    }
}
