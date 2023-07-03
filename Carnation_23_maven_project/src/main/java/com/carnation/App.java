package com.carnation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException, SQLException
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        String url = "jdbc:mysql://localhost:3306/tsdb";
        String username = "root";
        String password = "root";
        Connection connection = 
        		DriverManager.getConnection(url, username, password);
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM student");
        
        while(rs.next()) {
        	
        	System.out.println( rs.getInt("rollno") + "  " +  
        						rs.getString("name") + "  " + 
        						rs.getString("address"));
        }
        
        connection.close();
        
    }
}


/*
Mobile / Device
number
connection
statement
query
reply
cut

*/