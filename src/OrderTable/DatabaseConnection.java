/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OrderTable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;
import org.sqlite.SQLiteConfig;
import org.sqlite.SQLiteConfig.Pragma;

/**
 *
 * @author Vageesha
 */
public class DatabaseConnection {
    
    public static Connection connect(){
        
        Connection conn = null;
        
        try{         
            SQLiteConfig sqLiteConfig = new SQLiteConfig();
            Properties properties = sqLiteConfig.toProperties();
            properties.setProperty(Pragma.DATE_STRING_FORMAT.pragmaName, "yyyy-MM-dd");
       //conn = DriverManager.getConnection("jdbc:mysql://den1.mysql3.gear.host:3306/projectdata", "projectdata" , "project12#");
       //conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gold_database", "root" , "1234");
       conn = DriverManager.getConnection("jdbc:sqlite:database.sql",properties);
        }catch(Exception e){
            System.out.println(e);
        }
       return conn; 
    }
}
