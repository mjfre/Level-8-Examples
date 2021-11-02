package chapter_4.lambda_expressions.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Library_Solution {

    public void print(List<Book> books, Predicate<Book> checker) {
        for (Book book : books) {
            if (checker.test(book)) {
                System.out.println(book);
            }
        }
    }

    public static void main(String[] args) {

        Book b1 = new Book(
                "A Guide to Water",
                "This book is about water and things that go into water." +
                        "  It will teach you how to catch fish, and you may even learn how to swim",
                1874,
                Arrays.asList("George G.", "Bob B")
        );

        Book b2 = new Book(
                "Trees and Things that Grow from the Earth",
                "Dirt: you shouldn't eat it, but you should things that come out of it.",
                1976,
                Arrays.asList("Martin M.", "Josh J.")
        );

        Book b3 = new Book(
                "Words that are Within This Book",
                "None",
                1925,
                Arrays.asList("Harrison H.")
        );

        Book b4 = new Book(
                "Water, It's Not Just for Fish",
                "If we're over 70% water, does that mean we're only 30% human?",
                1976,
                Arrays.asList("Issac I.")
        );

        List<Book> books = new ArrayList<>();
        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);

        Library library = new Library();

        //print out all book which contain the word "the" in the title
        library.print(books, book -> book.getTitle().contains("the"));

        //print out all books that have a descriptions longer that 10 characters
        library.print(books, book -> book.getDescription().length() > 10);

        //print out all books that were published before the year 1900
        library.print(books, book -> book.getPublicationDate() < 1900);

        //print out all books that have more than one author
        library.print(books, book -> book.getAuthors().size() > 1);

        //print out all the books that were published between 1950-2000, and that have only author
        library.print(books, book -> book.authors.size() == 1 && (book.getPublicationDate() > 1950 && book.getPublicationDate() < 2000));
        library.print(books, book -> {
            if (book.authors.size() == 1 && (book.getPublicationDate() > 1950 && book.getPublicationDate() < 2000)) {
                return true;
            } else {
                return false;
            }
        });

        //print out all of the books that contain the word "water" in the title were published before 1900, and contain the
        //phrase "learn how to swim" in the description.
        library.print(books, book -> book.getTitle().contains("water") && book.getPublicationDate() < 1900 && book.getDescription().contains("learn how to swim"));
        library.print(books, book -> {
            if(book.getTitle().contains("water"))
                if(book.getPublicationDate() < 1900)
                    if(book.getDescription().contains("learn how to swim"))
                        return true;
            return false;
        });

    }
}
