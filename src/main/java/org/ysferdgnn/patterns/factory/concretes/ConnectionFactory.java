package org.ysferdgnn.patterns.factory.concretes;

import org.ysferdgnn.patterns.factory.abstracts.Connection;
import org.ysferdgnn.patterns.factory.enums.Connections;
import org.ysferdgnn.patterns.factory.errors.UnSupportedConnectionTypeError;

public class ConnectionFactory {

    private final Connections connections;

    public ConnectionFactory(Connections connections) {
        this.connections = connections;
    }

    public Connection getConnection(){
        switch (connections){
            case MSSQL: return new MssqlConnection();
            case MYSQL: return  new MysqlConnection();
            case PLSQL: return  new PlsqlConnection();
            case MONGODB: return  new MongodbConnection();
            case FIREBASE: return  new FirebaseConnection();
            default: throw new UnSupportedConnectionTypeError();
        }
    }
}
