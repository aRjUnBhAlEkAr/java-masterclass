import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.Scanner;

public class Query_JDBC_Drop{
    public static void main(String[] args) throws SQLException, ClassNotFoundException
    {
        Scanner in = new Scanner(System.in);
        Class.forName("oracle.jdbc.driver.OracleDriver");

        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");

        Statement statement = connection.createStatement();

        System.out.print("Enter Table name: ");
        String tablename = in.next();

        String query = "drop table " + tablename;

        statement.executeUpdate(query);
    }
};