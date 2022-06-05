package org.ysferdgnn.patterns.strategy.concretes.budgetstrategies;

import org.ysferdgnn.patterns.strategy.abstracts.BudgetStrategy;
import org.ysferdgnn.patterns.strategy.errors.InsufficentBudgetException;

class AggressiveBudgetStrategy implements BudgetStrategy {

    private  int totalBudget = 500_000_000;


    @Override
    public void spendMoney(int money) {

        if (money > totalBudget)
            throw new InsufficentBudgetException();

        totalBudget-=money;
        System.out.println(String.format(" %s spent. New budget : %s",money,totalBudget));
    }
}
