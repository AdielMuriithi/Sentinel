/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package house.rentals.system;

 import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
        
public class HouseRentalsSystem {
    
    public static void main (String[] args) throws  Exception {
        getConnection();
        
        
    }
    public static Connection getConnection throws;

    private static void getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    try 
    {
            String driver="com.mysql.jdbc.Driver";
            String url= "jdbc:mysql://10.55.17.3:3306/testdb";
            String username = "root";
            String password="blissmemphis";
            Class.forName(driver);
            try {
                Connection.conn = DriverManager.getConnection(url,username,password);
            } catch (SQLException ex) {
                Logger.getLogger(HouseRentalsSystem.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            
            
        }
        }
         
        
        
        
    

    

            


