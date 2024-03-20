/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.student_db;

import java.sql.SQLException;
import java.util.Scanner;
import student_db.Addaction;

/**
 *
 * @author Dell
 */
public class Student_DB {
    
    private int id;
    private String name;
    private String domain;
    private String address;
    
    public Student_DB()
    {
        
    }
    public Student_DB(int id,String name,String domain,String address)
    {
        this.id=id;
        this.name=name;
        this.domain=domain;
        this.address=address;
        
    }
     public Student_DB(String name,String domain,String address)
    {
        this.name=name;
        this.domain=domain;
        this.address=address; 
    }
   
    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id=id;
    }
     public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
     public String getDomain()
    {
        return domain;
    }
    public void setDomain(String domain)
    {
        this.domain=domain;
    }
     public String getAddress()
    {
        return address;
    }
    public void setAddress(String address)
    {
        this.address=address;
    }
    
    @Override
    public String toString()
    {
        return "Student id -> "+id+"\n"+
                "Student name -> " +name+"\n"+
                "Student domain -> "+domain+"\n"+
                "Student address -> "+address+"\n";
    }

    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
          Addaction a =new Addaction();
        
         
        
         while(true)
         {
              System.out.println("press 1 for add");
         System.out.println("press 2 for show");
         System.out.println("press 3 for display");
         System.out.println("press 4 for delete");
         System.out.println("press 5 for update");
         System.out.println("press 6 for exit");
         System.out.println("press any one option");
              int i=sc.nextInt();
             switch(i)
             {
                 case 1:
                     System.out.println("enter name");
                     String name=sc.next();
                     System.out.println("enter domain");
                     String domain=sc.next();
                     System.out.println("enter address");
                     String address=sc.next();
                     Student_DB s=new Student_DB(name, domain, address);
                    
                     if(a.add(s))
                     {
                         System.out.println("## Added ##");
                         
                     }
                     else
                     {
                         System.out.println("## occured ##");
                     }
                     
                     break;
                     
                  case 2:
                      try{
                          a.display();
                      }
                      catch(SQLException e)
                      {
                           System.out.println(e);
                      }
                     break;
                  case 3:
                      System.out.println("enter the id");
                      int id=sc.nextInt();
                       if(a.displayById(id))
                       {
                           
                       }
                       else
                       {
                           System.out.println("check ur id");

                       }
                       break;
                  case 4:
                     System.out.println("enter the id");
                      int d=sc.nextInt();
                      if(a.deleteById(d))
                      {
                          System.out.println("Delete successfully");

                      }
                      else
                      {
                          System.out.println("check ur id");
                      }
                     break;
                  case 5:
                      System.out.println("enter id");
                     int id1=sc.nextInt();
                     System.out.println("enter name");
                     String name1=sc.next();
                     System.out.println("enter domain");
                     String domain1=sc.next();
                     System.out.println("enter address");
                     String address1=sc.next();
                     Student_DB s1=new Student_DB(id1,name1, domain1, address1);
                    if(a.update(s1))
                    {
                         System.out.println("updated");
                    }
                    else
                         System.out.println("check the inputs");
                     break;
                  case 6:
                       System.out.println("thank  you");
                       System.exit(0);
                      
                  default:
                      System.out.println("invalid");
             }
              System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
         }
    }
}
