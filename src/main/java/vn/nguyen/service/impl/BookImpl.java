package vn.nguyen.service.impl;

import vn.nguyen.Model.Book;
import vn.nguyen.service.BookDAO;

import java.util.Collections;
import java.util.List;

/**
 * Created by nals on 11/27/17.
 */
public class BookImpl implements BookDAO {

    private static BookImpl bookImpl = new BookImpl();

    public List<Book> getAllBooks(){
        return Collections.EMPTY_LIST;
    }

    public Book getBook(String isbn){
        return null;
    }

    public Book addBook(Book book){
        return book;
    }

}
