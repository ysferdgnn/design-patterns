package org.ysferdgnn.patterns.factory.concretes;

import org.ysferdgnn.patterns.factory.abstracts.Connection;

public class PlsqlConnection implements Connection {
    @Override
    public void connect() {
        System.out.println("Connecting PlSql");
    }
}
