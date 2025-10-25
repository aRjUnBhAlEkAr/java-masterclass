// Approach-2 for registration of Database driver and establishing connection.

// important packages to be import for connection.
import java.sql.Connection;
import java.sql.DriverManager;

// importing to below files are mandatory in Approach-2
import oracle.jdbc.driver.OracleDriver;     // type-4
// import sun.jdbc.odbc.JdbcOdbcDriver;     // type-1


// connection code
public class JDBC_Connect_Approach_2{
    public static void main(String[] args) throws Exception{
        // Type-1 Driver
        // creation of JdbcOdbcDriver (Type-1) driver object
        // JdbcOdbcDriver obj = new JdbcOdbcDriver();

        // Type-4 Driver
        // Creation of OracleDriver (Type-4) driver manager.
        OracleDriver obj = new OracleDriver();
            // or
        // oracle.jdbc.driver.OracleDriver obj = new oracle.jdbc.driver.OracleDriver(); 


        // manual registration of the driver is optinal in the code, because static block register the "object" automatically.
        DriverManager.registerDriver(obj);

        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");

        System.out.println("Class: " + con.getClass());

        if(con != null){
            System.out.println("Connection established !");
        }
        else{
            System.out.println("Connection not established.");
        }
    }
}