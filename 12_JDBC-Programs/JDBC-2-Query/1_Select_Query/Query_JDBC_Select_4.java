// Select all the column from table student and print only roll and name of student.

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Query_JDBC_Select_4{
    public static void main(String[] args)throws SQLException, ClassNotFoundException{
        
        Class.forName("oracle.jdbc.driver.OracleDriver");

        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");

        String query = "select * from student";
                    // or
        // String query = "select roll, name, address from student";
        Statement statement = connection.createStatement();
        ResultSet resultset = statement.executeQuery(query);

        System.out.println("Roll No.\t\tName");
        while(resultset.next() != false){
            System.out.println(resultset.getInt("roll") + "\t\t" + resultset.getString("name"));
        }

        // Closing the connectivity with Database
        resultset.close();
        statement.close();
        connection.close();
    }
};