// Approach-1 for registring the driver and establishing the connection.

// import the essential packages which is needed for the connection.
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

// importing below packages are optional in the Approach-1
import com.mysql.cj.jdbc.Driver;

// actual connection code.
public class JDBC_Connect_Approach_1{
    public static void main(String[] args)throws ClassNotFoundException, SQLException{
        //creating a object of the com.mysql.cj.jdbc.Driver() package.
        com.mysql.cj.jdbc.Driver obj = new com.mysql.cj.jdbc.Driver();
        DriverManager.registerDriver(obj);

        // getConnection( -, -, -) method container connection String, username, password
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/csmss", "root", "Arjun@5556");

        if(connection != null){
            System.out.println("Connection established successfully!");
        }
        else{
            System.out.println("Connection not established!");
        }
        
        connection.close();
    }
};