// Approach-5 for registration of Database driver and establishing connection.

// In this approach we extends the Driver class of the DB driver where we don't have to create an object of the Driver Class.

// importing packages which is important for connection
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import oracle.jdbc.driver.OracleDriver; // type-4 driver
//import sun.jdbc.odbc.JdbcOdbcDriver;  // type-1 driver

public class JDBC_Connect_Approach_5 extends OracleDriver // type-4 driver
{
    public static void main(String[] args) throws SQLException, ClassNotFoundException{
        
        // Type-1 Driver
        // Connectio con = DriverManager.getConnection("jdbc:odbc:orcldsn", "scott", "tiger");

        // Type-4 Driver
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");

        if(con != null){
            System.out.println("Connection Established successfully!");
        }
        else{
            System.out.println("Connection not established.");
        }
    }
};