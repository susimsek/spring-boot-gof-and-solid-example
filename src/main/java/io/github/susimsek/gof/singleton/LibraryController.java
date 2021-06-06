package io.github.susimsek.gof.singleton;

import io.github.susimsek.gof.factory.Bar;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@FieldDefaults(level= AccessLevel.PRIVATE)
@RequiredArgsConstructor
public class LibraryController {

    final BookRepository repository;
    final ApplicationContext context;

    @GetMapping("/count")
    public Long findCount() {
        System.out.println(repository);
        Bar bar = context.getBean(Bar.class, "Some name");
        System.out.println("bar: " + bar);
        return repository.count();
    }
}
