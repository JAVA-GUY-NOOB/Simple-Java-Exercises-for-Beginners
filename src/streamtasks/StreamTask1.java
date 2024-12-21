
package streamtasks;

import java.util.*;
import java.util.stream.Collectors;

class Author {
    private String firstName;
    private String lastName;
    private int age;

    public Author(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }
}

class Book {
    private Author author;

    public Book(Author author) {
        this.author = author;
    }

    public Author getAuthor() {
        return author;
    }
}

public class StreamTask1 {
    public static void main(String[] args) {
        // Sample data: List of books with authors
        List<Book> books = Arrays.asList(
            new Book(new Author("John", "Doe", 55)),
            new Book(new Author("Jane", "Smith", 45)),
            new Book(new Author("Emily", "Johnson", 60)),
            new Book(new Author("Michael", "Brown", 70)),
            new Book(new Author("Chris", "Davis", 50)),
            new Book(new Author("Patricia", "Garcia", 65)),
            new Book(new Author("Robert", "Martinez", 40)),
            new Book(new Author("Linda", "Hernandez", 80)),
            new Book(new Author("James", "Lopez", 55)),
            new Book(new Author("Mary", "Wilson", 75)),
            new Book(new Author("David", "Anderson", 30)),
            new Book(new Author("Susan", "Thomas", 90)),
            new Book(new Author("Daniel", "Taylor", 50)),
            new Book(new Author("Jessica", "Moore", 45)),
            new Book(new Author("William", "Jackson", 65))
        );

        // Get unique surnames in uppercase of the first 15 authors who are 50 or older
        Set<String> uniqueSurnames = books.stream()
            .map(book -> book.getAuthor())
            .filter(author -> author.getAge() >= 50)
            .map(author -> author.getLastName().toUpperCase())
            .distinct()
            .limit(15) // Limit to the first 15 authors
            .collect(Collectors.toSet());

        // Output the result
        System.out.println("Unique surnames in uppercase: " + uniqueSurnames);
    }
}

/*
Get the unique surnames in uppercase of the first 15 book authors that are 50 years old or older.
 */
public class StreamTask1 {

}
