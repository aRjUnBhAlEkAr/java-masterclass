// Approach-3 for registration of Database driver and establishing connection.

// important packages to be import for connection and driver registration.
import java.sql.Connection;
import java.sql.DriverManager;

// importing to below files are mandatory in Approach-3
import oracle.jdbc.driver.OracleDriver;     // type-4
// import sun.jdbc.odbc.JdbcOdbcDriver;     // type-1


// connection code
public class JDBC_Connect_Approach_3{
    public static void main(String[] args) throws Exception{
        // Type-1 Driver
        // creation of anonymous(nameless) object by using 'new' keyword for JdbcOdbcDriver.
        // new JdbcOdbcDriver();

        // Type-4 Driver
        // creation of anonymous(nameless) object by using 'new' keyword for OracleDriver.
        new OracleDriver();
                // or 
        // new oracle.jdbc.driver.OracleDriver();

        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");

        System.out.println("Class: " + con.getClass());
        if(con != null){
            System.out.println("Connection established successfully!");
        }
        else{
            System.out.println("Connection not established...");
        }
    }
};