package io.github.susimsek.gof.strategy;

import org.springframework.stereotype.Component;

@Component
public class StrategyA  implements Strategy{

  @Override
  public void doStuff() {
    System.out.println("StrategyA doStuff!");
  }

  @Override 
  public StrategyName getStrategyName() {
    return StrategyName.StrategyA;
  }
}