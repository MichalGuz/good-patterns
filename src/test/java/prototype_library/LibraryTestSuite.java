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

        Library clonedLibrary = null;

        System.out.println("List of books in library: ");
        library.getBooks().stream()
                .forEach(System.out::println);

        // when
        int numberOfBooks = library.getBooks().size();

        // then
        Assert.assertEquals(20, numberOfBooks);
     }
}
