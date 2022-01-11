package ru.bk.vaskevich;

public class Story {

    public String author;
    public String storyTitle;

    public Story(String author, String storyTitle) {
        this.author = author;
        this.storyTitle = storyTitle;
    }

    public String getInformAboutStory() {
        return "Story is called " + storyTitle +
                " and author " + author;
    }
}
