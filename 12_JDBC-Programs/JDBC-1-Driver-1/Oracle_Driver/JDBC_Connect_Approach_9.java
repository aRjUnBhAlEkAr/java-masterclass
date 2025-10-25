// Approach-9 for establishing the connection for Database.

// In this approach we have to pass the driver name at the runtime.
/*
    Compilation:
            javac <File-name>.java
    Runtime:
            java -Djdbc.drivers=oracle.jdbc.driver.OracleDriver
                            // or
            java -Djdbc.drivers=sun.jdbc.odbc.JdbcOdbcDriver
*/

// importing the essential packages
import java.sql.Connection;
import java.sql.DriverManager;

// Connection code
public class JDBC_Connect_Approach_9{
    public static void main(String[] args)throws Exception{

        // In this method we don't have to create an object by using any previous approach to register the driver.
        // We just have to make a connectivity for the specific driver by using java.sql.Connection interface.
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");    // Type-4 Driver Connection

        if(con != null){
            System.out.println("Connection Established Successfully!");
        }
        else{
            System.out.println("Connection not established...");
        }
    }
};