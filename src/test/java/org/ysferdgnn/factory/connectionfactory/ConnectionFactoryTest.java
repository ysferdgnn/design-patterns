package org.ysferdgnn.factory.connectionfactory;

import org.junit.jupiter.api.Test;
import org.ysferdgnn.patterns.factory.concretes.ConnectionFactory;
import org.ysferdgnn.patterns.factory.enums.Connections;

public class ConnectionFactoryTest {

    @Test
    public  void  testConnectionFactory(){
        ConnectionFactory connectionFactoryMssql = new ConnectionFactory(Connections.MSSQL);
        connectionFactoryMssql.getConnection().connect();

        ConnectionFactory connectionFactoryFirebase = new ConnectionFactory(Connections.FIREBASE);
        connectionFactoryFirebase.getConnection().connect();
    }

}
