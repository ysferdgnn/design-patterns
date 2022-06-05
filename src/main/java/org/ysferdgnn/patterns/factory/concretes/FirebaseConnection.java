package org.ysferdgnn.patterns.factory.concretes;

import org.ysferdgnn.patterns.factory.abstracts.Connection;

public class FirebaseConnection implements Connection {
    @Override
    public void connect() {
        System.out.println("Connecting Firebase");
    }
}
