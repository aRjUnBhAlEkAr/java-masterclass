// Aggrigate founction 
/* avg funtion: count()
    - avg() function is used find avg of the numerical value available of purticular column in the table.
    - syntax:
        count(<column-name>)
*/

// importing imp packages
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class Query_JDBC_Avg_Function{
    public static void main(String[] args) throws SQLException, ClassNotFoundException
    {
        Class.forName("oracle.jdbc.driver.OracleDriver");

        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");

        Statement statement = connection.createStatement();

        // avg() function query
        String query = "select avg(sal) from emp";

        ResultSet resultset = statement.executeQuery(query);

        System.out.print("Average of Salary from EMP table: ");
        if(resultset.next() != false){
            System.out.println(resultset.getInt("avg(sal)"));
                        // or
            // System.out.println(resultset.getString(1));
        }
        
         // connection close
        resultset.close();
        statement.close();
        connection.close();
    }
};