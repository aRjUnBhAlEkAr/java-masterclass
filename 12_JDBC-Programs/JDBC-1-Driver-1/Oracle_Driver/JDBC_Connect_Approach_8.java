// Approach-8 establishing the connectivity to Database Software.
// In this approach we are using the system properties like getProperty method to take the argument at the runtime just like a Approach-7
/*
    Compilation:
                javac <File-Name>.java
    Execution:
                java -D<Variable-name>=<Driver-name> <class-name>
    example:
                java -Dvar= oracle.jdbc.driver.OracleDriver class-name // type-4
                                or
                java -Dvar= sun.jdbc.odbc.JdbcOdbcDriver class-name    // type-1
*/

// Important packages to be imported.
import java.sql.Connection;
import java.sql.DriverManager;

// connection code.
public class JDBC_Connect_Approach_8{
    public static void main(String[] args)throws Exception{
        String driver = System.getProperty("var");
        Class.forName(driver);
                        // or
        // Class.forName(System.getProperty("var"));

        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");

        if(con != null){
            System.out.println("Connection established successfully!");
        }
        else{
            System.out.println("Connection not established...");
        }
    }
};