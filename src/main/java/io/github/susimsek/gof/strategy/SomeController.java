package io.github.susimsek.gof.strategy;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@FieldDefaults(level= AccessLevel.PRIVATE)
@RequiredArgsConstructor
public class SomeController {

  final SomeService someService;

    @GetMapping("/some")
  public void findSome(){  
 
  // Now get the strategy by passing the name 
  someService.findSome();

  }
}