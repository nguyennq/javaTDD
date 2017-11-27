package vn.nguyen.service.impl;

import org.junit.BeforeClass;
import org.junit.Test;
import vn.nguyen.Model.Book;
import vn.nguyen.service.impl.BookImpl;

import java.util.Arrays;
import java.util.List;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by nals on 11/27/17.
 */
public class BookImplTest {

    private static BookImpl bookImpl;
    private static Book book1;
    private static Book book2;

    @BeforeClass
    public static void setUp(){
        bookImpl = mock(BookImpl.class);
        book1 = preparedBook1();
        book2 = preparedBook2();
        when(bookImpl.getAllBooks()).thenReturn(Arrays.asList(book1,book2));
        when(bookImpl.getBook("123456")).thenReturn(book1);
        when(bookImpl.addBook(book1)).thenReturn(book1);
    }

    private static Book preparedBook2() {
        Book book = new Book();
        book.setIsbn("987654321");
        book.setAuthors(Arrays.asList("Authors11","Authors22"));
        book.setTitle("Title 2");
        book.setImage("Image 2");
        return book;
    }

    private static Book preparedBook1() {
        Book book = new Book();
        book.setIsbn("123456789");
        book.setAuthors(Arrays.asList("Authors1","Authors2"));
        book.setTitle("Title 1");
        book.setImage("Image 1");
        return book;
    }


    @Test
    public void testGetAllBooks() throws Exception {
        List<Book> actualAllBooks = bookImpl.getAllBooks();
        assertEquals(2,actualAllBooks.size());
        Book actualBook1 = actualAllBooks.get(0);
        assertEquals("123456789",actualBook1.getIsbn());
    }

    @Test
    public void testGetBook() throws Exception {
        String isbnNew = "123456";
        Book myBook = bookImpl.getBook(isbnNew);
        assertNotNull(myBook);
        assertEquals("123456789", myBook.getIsbn());
    }

    @Test
    public void addBook() throws Exception {
        Book newbook = bookImpl.addBook(book1);
        assertNotNull(newbook);
        assertEquals("Title 1",newbook.getTitle());
    }

}