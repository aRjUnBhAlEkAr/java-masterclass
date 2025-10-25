// write a java program to find maximum 4 salary of employee and also print the details of employee
//  to limit the number of rows returned in an Oracle database is to use the ROWNUM pseudocolumn.
// select * from <query> where ROWNUM<=<number>

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class Query_JDBC_Practice_2{
    public static void main(String[] args) throws SQLException, ClassNotFoundException{
        Class.forName("oracle.jdbc.driver.OracleDriver");

        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");

        Statement statement = connection.createStatement();

        String query = "select * from (select * from emp order by sal desc) where rownum<=4";

        ResultSet resultset = statement.executeQuery(query);

        while(resultset.next() != false){
            System.out.println(resultset.getString(1) + "\t" + resultset.getString(2) + "\t" + resultset.getString(3) + "\t" + resultset.getString("sal"));
        }
        
        // connection close
        resultset.close();
        statement.close();
        connection.close();
    }
};