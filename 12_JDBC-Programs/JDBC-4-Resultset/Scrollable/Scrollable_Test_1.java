import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Scrollable_Test_1{
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/csmss", "root", "Arjun@5556");

        Statement st = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

        ResultSet rs = st.executeQuery("select * from student");

        System.out.println("Data will be retrieved from top to bottom:");
        while(rs.next()){
            System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getString(4) + "\t" + rs.getString(5));
        }

        System.out.println("\n\nData will be retrieved from bottom to top:");

        while(rs.previous()){
            System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getString(4) + "\t" + rs.getString(5));
        }

        System.out.println("\n\nFirst Data from table: ");
        if(rs.first()){
            System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getString(4) + "\t" + rs.getString(5));
        }

        System.out.println("\n\nLast Data from table: ");
        if(rs.last()){
            System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getString(4) + "\t" + rs.getString(5));
        }

        System.out.println("\n\nRelative relative(-2) Record from table: ");
        if(rs.relative(-2)){
            System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getString(4) + "\t" + rs.getString(5));
        }

        System.out.println("\n\nRelative relative(1) Record from table: ");
        if(rs.relative(1)){
            System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getString(4) + "\t" + rs.getString(5));
        }


        System.out.println("\n\nAbsolute absolute(3) Record from table: ");
        if(rs.absolute(3)){
            System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getString(4) + "\t" + rs.getString(5));
        }

        System.out.println("\n\nAbsolute absolute(-5) Record from table: ");
        if(rs.absolute(-5)){
            System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getString(4) + "\t" + rs.getString(5));
        }
        // if(connection != null){
        //     System.out.println("Connection successful!");
        //     connection.close();
        // }
        // else{
        //     System.out.println("Connection not successful!");
        // }

        st.close();
        rs.close();
        connection.close();
    }
}