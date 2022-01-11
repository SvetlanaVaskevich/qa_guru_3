package ru.bk.vaskevich;

public class InformAboutBook {
    public static void main(String[] args) {

        Book book1 = new Book();
        book1.title = "Novel";
        book1.pages = 470;
        System.out.println("The book is called " + book1.getTitle() + " and have " + book1.getPages() + " pages");

        Story story1 = new Story("Tolstoy","Anna Karenina");
        System.out.println(story1.getInformAboutStory());

        Story story2 = new Story("Chehov","Three sisters");
        System.out.println(story2.getInformAboutStory());

        book1.addStory(story1);
        book1.addStory(story2);
        book1.printStoriesFromBook();
    }
}
