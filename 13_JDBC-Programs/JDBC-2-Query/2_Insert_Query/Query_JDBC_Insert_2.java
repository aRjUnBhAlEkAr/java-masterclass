// write a java program to insert multiple records in the table.

// importing important packages.
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

public class Query_JDBC_Insert_2{
    public static void main(String[] args) throws SQLException, ClassNotFoundException
    {
        Scanner in = new Scanner(System.in);
        Class.forName("oracle.jdbc.driver.OracleDriver");

        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");

        Statement statement = connection.createStatement();

        System.out.print("How many records you want to insert: ");
        int numberOfRecords = in.nextInt();
        String query = "";
        int numberofrecordinserted = 0;
        for(int i = 0; i < numberOfRecords; i++)
        {
            System.out.print("Enter student roll: ");
            int roll = in.nextInt();

            System.out.print("Enter student name: ");
            String name = in.nextLine();
            name = in.nextLine();

            System.out.print("Enter student city: ");
            String city = in.nextLine();

            query = "insert into student values ("+roll+","+"'"+name+"'"+","+"'"+city+"'"+")";
            statement.executeUpdate(query);
        }
        System.out.println("number of row inserted: "+ numberOfRecords);
        // closing connection.
        statement.close();
        connection.close();
    }
};