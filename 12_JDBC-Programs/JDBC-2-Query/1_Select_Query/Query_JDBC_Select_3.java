// select roll and address from student 

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class Query_JDBC_Select_3{
    public static void main(String[] args) throws Exception{
        Class.forName("oracle.jdbc.driver.OracleDriver");

        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");

        String query = "select roll, name from student";

        Statement statement = connection.createStatement();
        ResultSet resultset = statement.executeQuery(query);

        System.out.println("Roll No.\tName");
        while(resultset.next() != false){
            System.out.println(resultset.getString("roll") + "\t\t" + resultset.getString("name"));
        }

        // closing the connection with database.
        resultset.close();
        statement.close();
        connection.close();
    }
};