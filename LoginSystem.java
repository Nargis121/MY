/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login.system;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class LoginSystem {

    /**
     * @param args the command line arguments
     * @throws java.lang.ClassNotFoundException
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // TODO code application logic here
       Manager manager= new Manager(); 
    }
    
}
class Manager
{
    Scanner sc=new Scanner(System.in);
    Manager() throws ClassNotFoundException, SQLException
    {
        System.out.println("Welcome to Login System");
         System.out.println("Press");
          System.out.println("1:Register User\n2:Login\n3:Forget Password");
           System.out.println("4:Edit Details\n5 Delete Account\n6:Exit\n");
           int choice=sc.nextInt();
           switch(choice)
           {
               case 1:
                   System.out.println("Welcome to Register Block");
                   System.out.println("Enter Username");
                   String name=sc.next();
                     System.out.println("Enter Password");
                   String password=sc.next();
                     System.out.println("ReEnter Password");
                   String repassword=sc.next();
                     System.out.println("Enter address");
                   String address=sc.next();
                     System.out.println("Enter Contact");
                   String contact=sc.next();
                     System.out.println("Enter Email");
                   String email=sc.next();
                   
                   Client_details client=new Client_details(name,password,repassword,address,contact,email);
                   Dbconnection dbcon=new Dbconnection();
                  boolean newuser_status= dbcon.registerUser(client);
                   if(newuser_status)
                   {
                      System.out.println("User Created Successfull"); 
                   } 
                   else
                   {
                       System.out.println("Registration Failed"); 
                   }
                   
                   break;
                   
                    case 2:
                   break;
                   
                    case 3:
                        
                   break;
                    case 4:
                        
                   break;
                    case 5:
                        
                   break;
                    case 6:
                        
                   break;
                    default:
                        
                   break;
           }
    }
    
}