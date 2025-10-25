// DELETE Query

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.util.Scanner;
import java.sql.SQLException;

public class Query_JDBC_Delete_1{
    public static void main(String[] args) throws SQLException, ClassNotFoundException
    {
        Scanner in = new Scanner(System.in);
        Class.forName("oracle.jdbc.driver.OracleDriver");

        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");

        Statement statement = connection.createStatement();

        System.out.print("Enter roll no. : ");
        int roll = in.nextInt();

        // Delete Query
        String query = "delete from student where roll="+roll;
        int result = statement.executeUpdate(query);

        System.out.println("No. of rows affected: " + result);

        
        // connection close
        statement.close();
        connection.close();
    }
};