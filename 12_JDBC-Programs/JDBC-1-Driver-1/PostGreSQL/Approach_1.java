import java.sql.Connection;
import java.sql.DriverManager;
// import org.postgresql.Driver;

import java.sql.SQLException;

public class Approach_1{
    public static void main(String[] args)throws SQLException{
        org.postgresql.Driver obj = new org.postgresql.Driver();

        DriverManager.registerDriver(obj);

        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/csmss", "postgres", "Arjun@5556");

        if(connection != null){
            System.out.println("Connection established successfully!");
        }
        else{
            System.out.println("Connection not established!");
        }

        connection.close();
    }
};