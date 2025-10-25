// Approach-4 for registration of Database driver and establishing connection.

// important packages to be import for connection and driver registration.
import java.sql.Connection;
import java.sql.DriverManager;

// importing to below files are mandatory in Approach-2
import oracle.jdbc.driver.OracleDriver;    // type-4 driver
// import sun.jdbc.odbc.JdbcOdbcDriver;     // type-1 driver


// connection code
public class JDBC_Connect_Approach_4{
    public static void main(String[] args) throws Exception{
        // Type-1 Driver
        // Registring the sun.jdbc.odbc.JdbcOdbcDriver by using DriverManager class.
        // DriverManager.regiterDriver(new sun.jdbc.odbc.JdbcOdbcDriver());     //Type-1 Driver

        // Type-4 Driver
        // Registring the oracle.jdbc.driver.OracleDriver by using DriverManager class.
        DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());     //Type-1 Driver

        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");

        System.out.println("class: " + con.getClass());
        if(con != null){
            System.out.println("Connection Established Successfully!");
        }
        else{
            System.out.println("Connection not established...");
        }
    }
};