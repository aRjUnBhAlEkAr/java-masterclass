// Approach-6 for registration of Database driver and establishing connection.

// importing essential packages for connectivity.
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import oracle.jdbc.driver.OracleDriver;

// connection code.
public class JDBC_Connect_Approach_6{
    public static void main(String[] args) throws SQLException, ClassNotFoundException{
        // Type-1
        // creation of sun.jdbc.odbc (Type-1) driver object.
        // Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

        // Type-4
        // creation of oracle:jdbc:driver.OracleDriver (Type-4) Driver object.
        Class.forName("oracle.jdbc.driver.OracleDriver");

        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");

        if(con != null){
            System.out.println("Connection Established Successfully!");
        }
        else{
            System.out.println("Connection not established...");
        }
    }
};