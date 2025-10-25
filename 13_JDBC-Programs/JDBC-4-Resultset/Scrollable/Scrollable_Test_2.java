// import java.sql.Connection;
// import java.sql.DriverManager;
// import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Scrollable_Test_2{
    public static void main(String[] args)throws ClassNotFoundException, SQLException{

        System.out.println("ResultSet.TYPE_SCROLL_SENSITIVE: " + ResultSet.TYPE_SCROLL_SENSITIVE);
        
        System.out.println("ResultSet.TYPE_SCROLL_INSENSITIVE: " + ResultSet.TYPE_SCROLL_INSENSITIVE);
    }
};