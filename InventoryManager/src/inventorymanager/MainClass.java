/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventorymanager;

/**
 *
 * @author Sreeram Raghammudi
 */
import java.sql.*;
public class MainClass 
{
    public static void main(String args[]){  
try{  
    Class.forName("com.mysql.cj.jdbc.Driver");  
    Connection con=DriverManager.getConnection(  
    "jdbc:mysql://localhost:3306/mystoreDBMS","root","Boeing777X");  
    // here local host is database name, root is username and password is **
    String query = "INSERT INTO customers (cust_id,name,number,p_id,purchase_quantity) VALUES (?, ?,?,?,?)";
                PreparedStatement statement = con.prepareStatement(query);
                
                String id = "12345";
                String name = "rushil mohammad";
                // Set the parameter values
                statement.setString(1, id);
                statement.setString(2, name);
                statement.setString(3, "555");
                statement.setString(2, "333");
                statement.setString(2, "1");
                
                int rowsAffected = statement.executeUpdate();
                System.out.println(rowsAffected + " row(s) affected");
                statement.close();
                con.close(); 
}
catch(Exception e)
{ 
    System.out.println(e);
}  
} 
    
}
