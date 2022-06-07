package org.ysferdgnn.patterns.proxy.errors;

public class BannedDomainError extends RuntimeException{

    public BannedDomainError() {
    }

    public BannedDomainError(String message) {
        super(message);
    }
}
