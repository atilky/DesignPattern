package com.tuing.abstractfactory;

public class AbstractFactoryTest {

    public static void main(String[] args) {

        //只要更換new出來的對象,就可以完整替換掉
        IDataBaseUtils iDataBaseUtils = new MyOracleDateBaseUtils();
        IConnection connection = iDataBaseUtils.getConnection();
        connection.connection();

        ICommand command = iDataBaseUtils.getCommand();
        command.command();


    }

}

interface IConnection{
    void connection();
}

interface ICommand{
    void command();
}

interface IDataBaseUtils{
    IConnection getConnection();
    ICommand getCommand();
}

class MysqlConnection implements IConnection {
    @Override
    public void connection() {
        System.out.println("mysql connection");
    }
}

class MysqlCommand implements ICommand{

    @Override
    public void command() {
        System.out.println("mysql command");
    }
}

class MysqlDateBaseUtils implements IDataBaseUtils{

    @Override
    public IConnection getConnection() {
        return new MysqlConnection();
    }

    @Override
    public ICommand getCommand() {
        return new MysqlCommand();
    }
}


class MyOracleConnection implements IConnection {
    @Override
    public void connection() {
        System.out.println("MyOracle connection");
    }
}

class MyOracleCommand implements ICommand{

    @Override
    public void command() {
        System.out.println("MyOracle command");
    }
}

class MyOracleDateBaseUtils implements IDataBaseUtils{

    @Override
    public IConnection getConnection() {
        return new MyOracleConnection();
    }

    @Override
    public ICommand getCommand() {
        return new MyOracleCommand();
    }
}