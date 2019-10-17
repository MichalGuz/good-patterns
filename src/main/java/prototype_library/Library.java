package prototype_library;

import java.util.HashSet;
import java.util.Set;

public final class Library extends PrototypeLibrary {
    private String name;
    private final Set<Book> books = new HashSet<>();

    public Library(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<Book> getBooks() {
        return books;
    }
}
