// Transaction control language is used to control the exection of a transaction in DB.

// importing imp packages
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.Scanner;

public class Query_JDBC_Transaction_Control{
    public static void main(String[] args) throws SQLException, ClassNotFoundException{
        Scanner in = new Scanner(System.in);
        Class.forName("oracle.jdbc.driver.OracleDriver");

        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");

        Statement statement = connection.createStatement();

        System.out.print("Enter roll number: ");
        int roll = in.nextInt();
        String query = "delete from student where roll="+roll;

        // connection.setAutoCommit(boolean value) for disabling the auto commit. By default it is "true".
        connection.setAutoCommit(false);

        int rowaffected = statement.executeUpdate(query);

        connection.rollback();
        statement.close();
        connection.close();
    }
};