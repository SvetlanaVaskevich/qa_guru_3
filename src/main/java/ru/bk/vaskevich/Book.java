package ru.bk.vaskevich;

import java.util.ArrayList;
import java.util.Iterator;

public class Book {

    String title;
    private ArrayList<Story> stories = new ArrayList<>();
    int pages;

    public String getTitle(){
        return this.title;
    }

    public int getPages(){
        return this.pages;
    }

    public void addStory(Story story){
        stories.add(story);
    }

    public void printStoriesFromBook(){
        System.out.print("This book " + this.title + " contains");
        for (Story st:stories){
            System.out.print(" " + st.storyTitle);
        }
        System.out.println();
    }
}
