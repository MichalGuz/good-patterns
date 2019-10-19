package prototype_library;

import java.time.LocalDate;

public final class Book {
    final String title;
    final String author;
    final LocalDate dateOfRelease;

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public LocalDate getDateOfRelease() {
        return dateOfRelease;
    }

    public Book(final String title, final String author, final LocalDate dateOfRelease) {
        this.title = title;
        this.author = author;
        this.dateOfRelease = dateOfRelease;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", dateOfRelease=" + dateOfRelease +
                '}';
    }
}
