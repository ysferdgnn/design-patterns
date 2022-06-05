package org.ysferdgnn.strategy.budgetstrategy;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.ysferdgnn.patterns.strategy.concretes.FormulaOneTeam;

import org.ysferdgnn.patterns.strategy.concretes.enums.F1TEAM;
import org.ysferdgnn.patterns.strategy.errors.InsufficentBudgetException;
import org.ysferdgnn.patterns.strategy.errors.ProtectMoneyException;

public class BudgetStrategyTest {


    @Test
    public void testAggressiveBudgetStrategy(){
        FormulaOneTeam formulaOneTeam = new FormulaOneTeam(F1TEAM.MERCEDES);
        Assertions.assertDoesNotThrow(() -> formulaOneTeam.getBudgetStrategyContext().spendMoney(50_000_000));
    }

    @Test
    public void testProtectiveBudgetStrategyOverflow(){
        FormulaOneTeam formulaOneTeam = new FormulaOneTeam(F1TEAM.HAAS);
        Assertions
                .assertThrows(InsufficentBudgetException.class,
                        () -> formulaOneTeam.getBudgetStrategyContext().spendMoney(75_000_000));
    }
    @Test
    public void testAggressiveBudgetStrategyOverflow(){
        FormulaOneTeam formulaOneTeam = new FormulaOneTeam(F1TEAM.FERRARI);
        Assertions
                .assertThrows(InsufficentBudgetException.class,
                        ()-> formulaOneTeam.getBudgetStrategyContext().spendMoney(750_000_000));
    }

    @Test
    public void testProtectiveBudgetStrategyProtectMoney(){
        FormulaOneTeam formulaOneTeam = new FormulaOneTeam(F1TEAM.ALFAROMEO);
        Assertions.assertThrows(ProtectMoneyException.class,
                () -> formulaOneTeam.getBudgetStrategyContext().spendMoney(7_000_000));
    }

}
