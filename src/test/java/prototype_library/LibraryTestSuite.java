package prototype_library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        // given
        Library library = new Library("library #1");
        for (int i = 0; i < 20; i++) {
            String title = "title" + i;
            String author = "author" + i;
            LocalDate localDate = new RandomDate().getRandomDate();
            library.getBooks().add(new Book(title, author, localDate));
        }

        // making a shallow clone of object library
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("library #2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        // making a deep clone of object library
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("library #3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        System.out.println("List of books in library: ");
        library.getBooks().stream()
                .forEach(System.out::println);

        System.out.println("List of books in (shallow) cloned library: ");
        clonedLibrary.getBooks().stream()
                .forEach(System.out::println);

        System.out.println("List of books in (deep) cloned library: ");
        deepClonedLibrary.getBooks().stream()
                .forEach(System.out::println);

        // when
        int numberOfBooks = library.getBooks().size();
        int numberOfBooksInClonedLibrary = clonedLibrary.getBooks().size();
        int numberOfBooksInDeepClonedLibrary = deepClonedLibrary.getBooks().size();

        // then
        Assert.assertEquals(20, numberOfBooks);
        Assert.assertEquals(20, numberOfBooksInClonedLibrary);
      }
}
