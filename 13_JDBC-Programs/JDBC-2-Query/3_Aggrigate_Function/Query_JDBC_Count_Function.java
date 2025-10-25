// Aggrigate founction 
/* count funtion: count()
    - count() function is used to count the number of rows in the table.
    - syntax:
        count(<column-name>)
*/

// importing imp packages
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class Query_JDBC_Count_Function{
    public static void main(String[] args) throws Exception{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");

        Statement statement = connection.createStatement();

        String query = "select count(*) from emp";
                    // or
        // String query = "select count(roll) from emp";

        ResultSet resultset = statement.executeQuery(query);

        System.out.print("Number of Records in table: ");
        if(resultset.next() != false){
            System.out.println(resultset.getString(1));
        }

        // connection close
        resultset.close();
        statement.close();
        connection.close();
    }
};