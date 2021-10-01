package com.SingletonDesign.Pattern;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SingletonConnection {
  private  static Connection connection;
   static {
       try {
               Class.forName("com.mysql.jdbc.Driver");
               connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
               System.out.println("Connected");
       }
       catch (ClassNotFoundException | SQLException exception){
           System.out.println(exception.getMessage());
       }

   }
    public static Connection getConnection()
    {
        return connection;
    }
}
