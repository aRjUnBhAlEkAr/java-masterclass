// Approach-7 for connectivity of JDBC Driver to the DB driver
// In this approach we will pass the Complete Package name as the command line argument.
/*
    Compilation:
                javac <File-Name>.java
    Execution:
                java <Class-Name> oracle.jdbc.driver.OracleDriver  // type-4 Driver
                                or
                java <Class-name> sun.jdbc.odbc.JdbcOdbcDriver     // type-1 driver
*/

// Importing necessary packages for the connectivity.
import java.sql.Connection;
import java.sql.DriverManager;
import oracle.jdbc.driver.OracleDriver;

// connectivity code.
public class JDBC_Connect_Approach_7{
    public static void main(String[] args) throws Exception{
        // By using the Class.forName(arument) method for registration of Driver.
        Class.forName(args[0]);

        // Using Connection interface to establish the connection using 'con' object
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");

        System.out.println("Class : " + con.getClass());

        if(con != null){
            System.out.println("Connection Established !");
        }
        else{
            System.out.println("Connection not established.");
        }
    }
}