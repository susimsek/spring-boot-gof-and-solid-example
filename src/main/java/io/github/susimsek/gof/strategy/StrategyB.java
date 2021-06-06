package io.github.susimsek.gof.strategy;

import org.springframework.stereotype.Component;

@Component
public class StrategyB  implements Strategy{

  @Override
  public void doStuff() {
      System.out.println("StrategyB doStuff!");
   }

   @Override
   public StrategyName getStrategyName() {
         return StrategyName.StrategyB;
      }
}