package prototype_library;

import java.util.HashSet;
import java.util.Set;

public final class Library extends PrototypeLibrary {
    private String name;
    private Set<Book> books = new HashSet<>();

    public Library(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Library shallowCopy() throws CloneNotSupportedException {
        return (Library)super.clone();
    }

    public Library deepCopy() throws CloneNotSupportedException {
        Library deepClonedLibrary = (Library)super.clone();
        deepClonedLibrary.books = new HashSet<>();
        deepClonedLibrary.getName();
        for(Book book: books) {
            deepClonedLibrary.getBooks().add(book);
        }
        return deepClonedLibrary;
    }
}
