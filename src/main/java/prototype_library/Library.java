package prototype_library;

import java.util.HashSet;
import java.util.Set;

public final class Library {
    final String name;
    final Set<Book> books = new HashSet<>();

    public Library(final String name) {
        this.name = name;
    }
}
