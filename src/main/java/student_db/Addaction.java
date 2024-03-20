/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student_db;


import com.mycompany.student_db.Student_DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Dell
 */
public class Addaction {
    
    public boolean add(Student_DB s)
    {
        try{
            Connection con =StudentDB.data();
            String query= "insert into profile(name,domain,address) values(?,?,?)";
            PreparedStatement st= con.prepareCall(query);
            st.setString(1, s.getName());
            st.setString(2, s.getDomain());
            st.setString(3, s.getAddress());
            st.executeUpdate();
              
              return true;
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return false;
    }
    
     public void display() throws SQLException
    {
        try{
            Connection con =StudentDB.data();
            String query= "select * from profile";
            Statement st= con.createStatement();
            
            ResultSet rs= st.executeQuery(query);
              while(rs.next())
              {
                  System.out.println("ID ->"+rs.getString(1));
                  System.out.println("NAME ->"+rs.getString(2));
                  System.out.println("DOMAIN ->"+rs.getString(3));
                  System.out.println("ADDRESS ->"+rs.getString(4));
              }
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
       
    }
          public boolean deleteById(int id) 
    {
        try{
            Connection con =StudentDB.data();
            String query= "delete from profile where id="+id;
            Statement st= con.createStatement();
            
            st.executeUpdate(query);
             
            return true;
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
       return false;
    }
                public boolean displayById(int id) 
    {
        try{
            Connection con =StudentDB.data();
            String query= "select * from profile where id="+id;
            Statement st= con.createStatement();
            
            ResultSet rs= st.executeQuery(query);
              while(rs.next())
              {
                  System.out.println("ID ->"+rs.getString(1));
                  System.out.println("NAME ->"+rs.getString(2));
                  System.out.println("DOMAIN ->"+rs.getString(3));
                  System.out.println("ADDRESS ->"+rs.getString(4));
              }
            return true;
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
       return false;
    }
                 public boolean update(Student_DB s)
    {
        try{
            
            Connection con =StudentDB.data();
            String query= "update profile set name=?,domain=?,address=? where id=?";
            PreparedStatement st= con.prepareCall(query);
            st.setString(1, s.getName());
            st.setString(2, s.getDomain());
            st.setString(3, s.getAddress());
            st.setInt(4, s.getId());
            st.executeUpdate();
              
              return true;
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return false;
    }
                
}
