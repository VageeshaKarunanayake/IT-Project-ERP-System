package Customer;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Rukshan
 */
public class sql_connect {
    Connection con=null;
    public static Connection connectDB(){
        try{
            Connection con=DriverManager.getConnection("jdbc:sqlite:database.sql");
                  JOptionPane.showMessageDialog(null, "Connection established");
            return con; 
        }catch(Exception e){
                        JOptionPane.showMessageDialog(null, e);
                        return null;
        }
    }
            
}
