package io.github.susimsek.gof.proxy;

import io.github.susimsek.gof.singleton.Book;
import io.github.susimsek.gof.singleton.BookRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@FieldDefaults(level= AccessLevel.PRIVATE)
@RequiredArgsConstructor
public class BookManager {

    final BookRepository repository;

    @Transactional
    public Book create(String author) {
        System.out.println(repository.getClass().getName());
        return repository.create(author);
    }
}