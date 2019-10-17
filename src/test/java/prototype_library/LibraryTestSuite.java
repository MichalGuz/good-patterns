package prototype_library;

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

        System.out.println("The size of set 'books' = " + library.getBooks().size());

     }
}
