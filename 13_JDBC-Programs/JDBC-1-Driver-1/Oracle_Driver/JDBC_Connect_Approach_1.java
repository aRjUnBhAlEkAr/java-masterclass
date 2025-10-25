// Approach-1 for registration of Database driver and establishing connection.

// important packages which is important for connection.
import java.sql.Connection;
import java.sql.DriverManager;

// importing the below packages are optional in Approach-1
// import oracle.jdbc.driver.OracleDriver;  // type-4 driver
// import sun.jdbc.odbc.JdbcOdbcDriver;     // type-1 driver


// connection code
public class JDBC_Connect_Approach_1{
    public static void main(String[] args) throws Exception{

        // Type-1 Driver
        // creation of jdbc.odbc (Type-1) driver object
        // sun.jdbc.odbc.JdbcOdbcDriver obj = new sun.jdbc.odbc.JdbcOdbcDriver();

        // Type-4 Driver
        // Creation of oracle.jdbc.driver.OracleDriver (Type-4) driver manager.
        oracle.jdbc.driver.OracleDriver obj = new oracle.jdbc.driver.OracleDriver();
        
        // manual registration of the driver is optinal in the code, because static block register the "object" automatically.
        DriverManager.registerDriver(obj);
        
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");

        if(con != null){
            System.out.println("Connection established successfully!");
        }
        else{
            System.out.println("Connection not established.");
        }
    }
};