package org.ysferdgnn.patterns.strategy.concretes;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.ysferdgnn.patterns.strategy.abstracts.BudgetStrategy;
import org.ysferdgnn.patterns.strategy.concretes.budgetstrategies.BudgetStrategyContext;
import org.ysferdgnn.patterns.strategy.concretes.enums.F1TEAM;


public class FormulaOneTeam {

    @Getter
    @Setter
    private F1TEAM team;
    @Getter
    private final BudgetStrategyContext budgetStrategyContext;

    public FormulaOneTeam(F1TEAM team) {
        this.team = team;
        this.budgetStrategyContext = new BudgetStrategyContext(team);
    }
}
