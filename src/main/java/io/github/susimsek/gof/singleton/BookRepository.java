package io.github.susimsek.gof.singleton;

import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
// @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BookRepository {

    public Book create(String author) {
        return new Book(author);
    }

    public long count() {
        return 1;
    }
    
    public Optional<Book> findById(long id) {
        return Optional.of(new Book());
    }
}