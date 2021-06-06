package io.github.susimsek.gof.strategy;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;


@Service
@FieldDefaults(level= AccessLevel.PRIVATE)
@RequiredArgsConstructor
public class SomeService {

  final StrategyFactory strategyFactory;

  public void findSome(){  
 
  // Now get the strategy by passing the name 
  Strategy strategy =
  strategyFactory.findStrategy(StrategyName.StrategyA);
  System.out.println(strategy);
   // you can now call the methods defined in strategy.
   strategy.doStuff();
  }
}