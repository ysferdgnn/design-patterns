package org.ysferdgnn.patterns.strategy.concretes.budgetstrategies;

import org.ysferdgnn.patterns.strategy.abstracts.BudgetStrategy;
import org.ysferdgnn.patterns.strategy.errors.InsufficentBudgetException;
import org.ysferdgnn.patterns.strategy.errors.ProtectMoneyException;

class ProtectiveBudgetStrategy implements BudgetStrategy {

    private  int totalBudget = 50_000_000;

    @Override
    public void spendMoney(int money) {
        if (money > totalBudget)
            throw new InsufficentBudgetException();

        if (money > 5_000_000)
            throw new ProtectMoneyException("Can not spend more than 5 million ");

        totalBudget-=money;
        System.out.println(String.format("%s spent. New budget : %s",money,totalBudget));
    }
}
