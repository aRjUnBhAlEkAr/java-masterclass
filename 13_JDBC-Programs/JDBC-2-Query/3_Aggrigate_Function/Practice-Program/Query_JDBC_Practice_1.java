
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Query_JDBC_Practice_1{
    public static void main(String[] args) throws SQLException, ClassNotFoundException
    {
        Class.forName("oracle.jdbc.driver.OracleDriver");

        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");

        Statement statement = connection.createStatement();

        // Query within query
        String query = "select * from emp where sal> = (select avg(sal) from emp)";

        ResultSet resultset = statement.executeQuery(query);

        while(resultset.next() != false){
            System.out.println(resultset.getString("empno")+ "\t" + resultset.getString("ename") + "\t" + resultset.getString("job") + "\t" + resultset.getString("mgr") + "\t" + resultset.getString("hiredate")  + "\t" + resultset.getString("sal") + "\t" + resultset.getString("deptno"));
        }
        // prints the number of line will be printed in the output
        int result = statement.executeUpdate(query);
        System.out.println("Number of rows selected: " + result);

        // connection close
        resultset.close();
        statement.close();
        connection.close();
    }
};