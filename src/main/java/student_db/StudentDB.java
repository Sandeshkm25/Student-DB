/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student_db;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Dell
 */

public class StudentDB {
    public static Connection data()
    {
       try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
        return con;
}
       catch(Exception e)
       {
           System.out.println(e);
           return null;
       }
       }
}
