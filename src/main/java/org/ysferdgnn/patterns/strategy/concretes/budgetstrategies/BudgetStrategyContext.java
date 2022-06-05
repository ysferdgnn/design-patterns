package org.ysferdgnn.patterns.strategy.concretes.budgetstrategies;

import org.ysferdgnn.patterns.strategy.concretes.enums.F1TEAM;

public class BudgetStrategyContext {
    private F1TEAM team;
    private final ProtectiveBudgetStrategy protectiveBudgetStrategy = new ProtectiveBudgetStrategy();
    private final AggressiveBudgetStrategy aggressiveBudgetStrategy = new AggressiveBudgetStrategy();


    public BudgetStrategyContext(F1TEAM team) {
        this.team = team;
    }

    public void spendMoney(int money){
        switch (team){
            case MERCEDES   :
            case FERRARI    :
            case REDBULL    :
            case MCLAREN    :
            case ALPHATAURI :
                aggressiveBudgetStrategy.spendMoney(money); break;
            case ALPINE     :
            case HAAS       :
            case ALFAROMEO  :
            case WILLIAMS   :
            case ASTONMARTIN:
                protectiveBudgetStrategy.spendMoney(money); break;
        }
    }
}
