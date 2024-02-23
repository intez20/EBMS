
package ebms;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class connDb {
    public static Connection conLink() throws SQLException, ClassNotFoundException{
        //Class.forName("oracle.jdbc.driver.OracleDriver");
        DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ebms","psc"); 
        return(con);
    }   
}

