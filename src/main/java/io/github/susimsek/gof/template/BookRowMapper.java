package io.github.susimsek.gof.template;

import io.github.susimsek.gof.singleton.Book;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BookRowMapper implements RowMapper<Book> {

    @Override
    public Book mapRow(ResultSet rs, int rowNum) throws SQLException {

        Book book = new Book();

        book.setAuthor(rs.getString("author"));
        
        return book;
    }
}