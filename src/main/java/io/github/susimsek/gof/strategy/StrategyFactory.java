package io.github.susimsek.gof.strategy;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Component
@FieldDefaults(level= AccessLevel.PRIVATE)
public class StrategyFactory {

   Map<StrategyName, Strategy> strategies;

  public StrategyFactory(Set<Strategy> strategySet) {
     createStrategy(strategySet);
  }
  
  public Strategy findStrategy(StrategyName strategyName) {
     return strategies.get(strategyName);
  }

  private void createStrategy(Set<Strategy> strategySet) {
      strategies = new HashMap<StrategyName, Strategy>();
      strategySet.forEach(
   strategy ->strategies.put(strategy.getStrategyName(), strategy));
  }

}