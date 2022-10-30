package singletonSQL;

public class mainSingleton {
    public static void main(String[] args) {
        MySQLDB mySQLClient = MySQLDB.getClient();
        MySQLDB mySQLClient1 = MySQLDB.getClient();
        MySQLDB mySQLClient2 = MySQLDB.getClient();

    }
}