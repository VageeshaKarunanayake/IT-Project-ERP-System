
package inventory;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
    
    public static Connection connect(){
        
        Connection conn = null;
        
        try{
            
       //conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gold_database", "root" , "1234");
       conn = DriverManager.getConnection("jdbc:sqlite:database.sql");
       //conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gold_database", "root" , "1234");
        }catch(Exception e){
            System.out.println(e);
        }
       return conn; 
    }
}
