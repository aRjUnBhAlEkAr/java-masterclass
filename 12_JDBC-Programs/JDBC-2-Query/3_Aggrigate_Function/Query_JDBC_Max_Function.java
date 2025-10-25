// Aggrigate founction 
/* max funtion: max()
    - max() function is used to find the max number available in the table.
    - syntax:
        max(<column-name>)
*/

// importing imp packages
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class Query_JDBC_Max_Function{
    public static void main(String[] args) throws SQLException, ClassNotFoundException
    {
        Class.forName("oracle.jdbc.driver.OracleDriver");

        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");

        Statement statement = connection.createStatement();

        // max() funtion query
        String query = "select max(sal) from emp";

        ResultSet resultset = statement.executeQuery(query);

        System.out.print("Maximum Salary from table: ");
        if(resultset.next() != false){
            System.out.println(resultset.getString(1));
        }

        // connection close
        resultset.close();
        statement.close();
        connection.close();
    }
};