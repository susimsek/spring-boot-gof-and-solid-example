package io.github.susimsek.gof.singleton;

import io.github.susimsek.gof.proxy.BookManager;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.*;

@RestController
@FieldDefaults(level= AccessLevel.PRIVATE)
@RequiredArgsConstructor
public class BookController {

    final BookRepository repository;
    final BookManager manager;

    @PostMapping("/book")
    public Book create(@RequestParam String author) {
        return manager.create(author);
    }

    @GetMapping("/book/{id}")
    public Book findById(@PathVariable long id) {
        System.out.println(repository);
        return repository.findById(id).get();
    }

}