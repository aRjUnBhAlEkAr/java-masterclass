// Aggrigate founction 
/* sum funtion: count()
    - sum() function is used to addtion of available numeric data of particular column in the table.
    - syntax:
        sum(<column-name>)
*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class Query_JDBC_Sum_Function{
    public static void main(String[] args) throws SQLException, ClassNotFoundException
    {
        Class.forName("oracle.jdbc.driver.OracleDriver");

        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");

        Statement statement = connection.createStatement();

        // sum() function query
        String query = "select sum(sal) from emp";

        ResultSet resultset = statement.executeQuery(query);

        System.out.print("Sum of sal column of emp: ");
        if(resultset.next() != false){
            // System.out.println(resultset.getString(1));
                // or
            System.out.println(resultset.getInt("sum(sal)"));
        }
    }
};