package vn.nguyen.service;

import vn.nguyen.Model.Book;

import java.util.Collections;
import java.util.List;

/**
 * Created by nals on 11/27/17.
 */
public interface BookDAO {
    public List<Book> getAllBooks();

    public Book getBook(String isbn);

    public Book addBook(Book book);
}
