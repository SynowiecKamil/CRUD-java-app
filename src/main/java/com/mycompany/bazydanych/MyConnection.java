
package com.mycompany.bazydanych;

import java.sql.Connection;
import java.sql.DriverManager;


public class MyConnection {
    public static Connection getConnection() 
    {
        Connection con = null;
        try{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        con = DriverManager.getConnection("jdbc:oracle:thin:@155.158.112.45:1521:oltpstud","ziibd36","haslo1");
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        return con;
    }
    
}
