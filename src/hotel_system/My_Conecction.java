
package hotel_system;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Leslie
 */
public class My_Conecction {
    public  Connection createConecction(){
    Connection conecction = null;
            
    MysqlDataSource datasouece = new MysqlDataSource();
    datasouece.setServerName("localhost");
    datasouece.setPort(3306);
    datasouece.setUser("root");
    datasouece.setPassword("");
    datasouece.setDatabaseName("java_hotel_db");
        try {
            conecction = datasouece.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(My_Conecction.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conecction;
    }
}
