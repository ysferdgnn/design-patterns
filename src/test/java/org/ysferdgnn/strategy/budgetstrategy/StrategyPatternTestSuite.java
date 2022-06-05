package org.ysferdgnn.strategy.budgetstrategy;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;
import org.ysferdgnn.patterns.strategy.abstracts.BudgetStrategy;

@Suite
@SelectClasses({BudgetStrategy.class})
public class StrategyPatternTestSuite {
}
