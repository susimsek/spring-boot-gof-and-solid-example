package io.github.susimsek.gof.strategy;

import org.springframework.stereotype.Component;

@Component
public class StrategyC  implements Strategy{

  @Override
  public void doStuff() {
    System.out.println("StrategyC doStuff!");
  }

  @Override
  public StrategyName getStrategyName() {
    return StrategyName.StrategyC;
  }
}