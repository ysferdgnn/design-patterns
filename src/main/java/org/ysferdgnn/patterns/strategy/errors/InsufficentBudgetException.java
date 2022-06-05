package org.ysferdgnn.patterns.strategy.errors;

public class InsufficentBudgetException extends RuntimeException{
    public InsufficentBudgetException(String message) {
        super(message);
    }

    public InsufficentBudgetException() {
    }
}
