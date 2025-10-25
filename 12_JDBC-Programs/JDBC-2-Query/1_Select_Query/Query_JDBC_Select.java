// Select the details of student from the city name.

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.Scanner;
import java.sql.SQLException;
import oracle.jdbc.driver.OracleDriver;

public class Query_JDBC_Select{
    public static void main(String[] args) throws SQLException, ClassNotFoundException{
        Scanner sc = new Scanner(System.in);
        Class.forName("oracle.jdbc.driver.OracleDriver");

        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
        Statement st = con.createStatement();

        System.out.print("Enter City Name: ");
        String city = sc.next();
        String query = "select * from student where address = " + "'"+city+"'";

        ResultSet rs = st.executeQuery(query);

        while(rs.next() != false){
            System.out.println(rs.getString(1) + "\t " + rs.getString(2) + "\t" + rs.getString(3));
        }

        rs.close();
        st.close();
        con.close();
    }
};