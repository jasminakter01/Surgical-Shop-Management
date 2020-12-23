 
package sergical_shop6;
  
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
 
public class Connection_Class {
     Connection ct=null;
    PreparedStatement ps=null;
    ResultSet rs=null;
    Statement st=null;
    Connection ctt=null;
    PreparedStatement pss=null;
    ResultSet rss=null;
    Statement stt=null;
    public void contest() {
        try {
            ct = DriverManager.getConnection("jdbc:mysql://localhost:3306/sergical_shop", "root", "");
            st=ct.createStatement();
            
        } catch (SQLException ex) {
            Logger.getLogger(Connection_Class.class.getName()).log(Level.SEVERE, null, ex);
        } }
} 