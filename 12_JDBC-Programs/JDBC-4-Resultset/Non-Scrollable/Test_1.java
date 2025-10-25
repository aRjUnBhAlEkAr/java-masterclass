import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test_1{
    public static void main(String[] arsg) throws ClassNotFoundException, SQLException{
       Class.forName("com.mysql.cj.jdbc.Driver");

       Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/csmss", "root", "Arjun@5556");

       Statement statement = connection.createStatement();

       ResultSet rs = statement.executeQuery("select * from student");

       while(rs.next()){
            System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3));
       } 

       rs.close();
       statement.close();
       connection.close();
    }
};