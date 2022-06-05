package org.ysferdgnn.patterns.factory.concretes;

import org.ysferdgnn.patterns.factory.abstracts.Connection;

public class MysqlConnection implements Connection {
    @Override
    public void connect() {
        System.out.println("Connectiong MySql");
    }
}
