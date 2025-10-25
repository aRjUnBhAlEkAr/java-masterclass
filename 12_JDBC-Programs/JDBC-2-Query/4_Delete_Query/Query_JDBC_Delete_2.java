// Delete record from the table to purticular range.

import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Query_JDBC_Delete_2{
    public static void main(String[] args) throws SQLException, ClassNotFoundException
    {
        Scanner in = new Scanner(System.in);
        Class.forName("oracle.jdbc.driver.OracleDriver");

        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");

        Statement statement = connection.createStatement();

        System.out.print("Starting Index: ");
        int start = in.nextInt();

        System.out.print("Ending Index: ");
        int end = in.nextInt();

        String query = "delete from student where roll>="+start+" and roll<="+end;

        int result = statement.executeUpdate(query);

        System.out.println("Number of rows affected: " + result);

        // connection close
        statement.close();
        connection.close();
    }
};