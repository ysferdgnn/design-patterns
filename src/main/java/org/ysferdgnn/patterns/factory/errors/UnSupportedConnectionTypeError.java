package org.ysferdgnn.patterns.factory.errors;

public class UnSupportedConnectionTypeError extends  UnsupportedOperationException{

    public UnSupportedConnectionTypeError() {
    }

    public UnSupportedConnectionTypeError(String message) {
        super(message);
    }
}
