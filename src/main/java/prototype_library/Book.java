package prototype_library;

import java.time.LocalDate;

public final class Book {
    final String title;
    final String author;
    final LocalDate dateOfRelease;

    public Book(final String title, final String author, final LocalDate dateOfRelease) {
        this.title = title;
        this.author = author;
        this.dateOfRelease = dateOfRelease;
    }
}
