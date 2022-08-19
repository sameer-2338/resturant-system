/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodierestaurant;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author PC
 */
public class MyConnection {

        public static Connection getConnection() {
        Connection con  = null;
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/testsql", "root", "");
        } catch (SQLException | ClassNotFoundException |IllegalAccessException|InstantiationException e)
        {
            System.out.println("exception occured "+e.getMessage());

        }

        return con;
    }

    static Object getconnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
