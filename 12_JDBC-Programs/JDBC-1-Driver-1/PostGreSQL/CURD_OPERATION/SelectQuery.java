import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class SelectQuery{
    public static void main(String[] args)throws ClassNotFoundException, SQLException{
        Class.forName("org.postgresql.Driver");

        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/csmss", "postgres", "Arjun@5556");

        String query = "select * from student";
        Statement statement = connection.createStatement();

        ResultSet rs = statement.executeQuery(query);

        while(rs.next()){
            System.out.println(rs.getString(1) +"\t" + rs.getString(2) + "\t" + rs.getString(3));
        }

        rs.close();
        statement.close();
        connection.close();
    }
};