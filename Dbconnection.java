/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author user
 */
class Dbconnection {
    Connection con=null;
    PreparedStatement st=null;
    public Dbconnection() throws ClassNotFoundException, SQLException
    {
      Class.forName("com.mysql.cj.jdbc.Driver");
      String url="jdbc:mysql://localhost:3306/logindb";
      String user="root";
      String psw="";
      
      con=DriverManager.getConnection(url, user, psw);
      System.out.println("Connection Established");
    }
    public boolean registerUser(Client_details client) throws SQLException
    {
      String qry="insert into register values('"+client.getName()+"','"+client.getPassword()+"','"+client.getRepassword()+"','"+client.getAddress()+"','"+client.getContact()+"','"+client.getEmail()+"')";
      st= con.prepareStatement(qry);
     int row= st.executeUpdate();
     if(row>0)
     {
         return true;
     }
     else
     {
         return false;
     }
     }
    
    }
}
