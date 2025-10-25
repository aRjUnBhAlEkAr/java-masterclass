// Aggrigate founction 
/* min funtion: max()
    - min() function is used to find the min number available in the table.
    - syntax:
        min(<column-name>)
*/

// importing important packages
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

public class Query_JDBC_Min_Function{
    public static void main(String[] args) throws SQLException, ClassNotFoundException{
        Class.forName("oracle.jdbc.driver.OracleDriver");

        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");

        Statement statement = connection.createStatement();

        // min() function query.
        String query = "select min(sal) from emp";

        ResultSet resultset = statement.executeQuery(query);
    
        System.out.print("Minimum salary from table: ");
        if(resultset.next() != false){
            System.out.println(resultset.getString(1));
        }

        // connection close
        resultset.close();
        statement.close();
        connection.close();
    }
};