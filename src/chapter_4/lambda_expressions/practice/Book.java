package chapter_4.lambda_expressions.practice;

import java.util.List;

public class Book {

    private String title;

    private String description;

    private int publicationDate;

    List<String> authors;

    public Book(String title, String description, int publicationDate, List<String> authors) {
        this.title = title;
        this.description = description;
        this.publicationDate = publicationDate;
        this.authors = authors;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getPublicationDate() {
        return publicationDate;
    }

    public List<String> getAuthors() {
        return authors;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", publicationDate=" + publicationDate +
                ", authors=" + authors +
                '}';
    }
}
