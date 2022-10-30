package singletonSQL;

import java.sql.*;
public class MySQLDB {

    public static MySQLDB client = null;

    public static MySQLDB mySQLDB;

    private MySQLDB() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/sonoo", "root", "root");
//here sonoo is database name, root is username and password
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from emp");
            while (rs.next())
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }



    public static MySQLDB getClient(){
        if (client == null){
            System.out.println("Primera vez");
            client = new MySQLDB();
        }

        return client;
    }
}