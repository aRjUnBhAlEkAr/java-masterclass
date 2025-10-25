// select studegetConnectionnt roll and name from table student whose is not from satara.

import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class Query_JDBC_Select_5{
    public static void main(String[] args)throws SQLException, ClassNotFoundException {
        Scanner in = new Scanner(System.in);

        Class.forName("oracle.jdbc.driver.OracleDriver");

        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");

        Statement statement = connection.createStatement();

        System.out.print("Enter Query: ");
        String query = in.nextLine();

        ResultSet resultset = statement.executeQuery(query);

        System.out.println("Roll No.\tName");
        while(resultset.next() != false){
            System.out.println(resultset.getString(1) + "\t" + resultset.getString(2) + "\t" + resultset.getString(3));
        }
    }
};