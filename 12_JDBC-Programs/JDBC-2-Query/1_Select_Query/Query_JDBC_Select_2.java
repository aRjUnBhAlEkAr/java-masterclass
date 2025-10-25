// select student details between perticular range of roll number

import java.util.Scanner;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class Query_JDBC_Select_2{
    public static void main(String[] args) throws SQLException, ClassNotFoundException{
        Scanner in = new Scanner(System.in);

        // Driver Registration
        Class.forName("oracle.jdbc.driver.OracleDriver");

        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");

        System.out.print("Starting Index: ");
        int start_index = in.nextInt();

        System.out.print("Ending Index  : ");
        int end_index = in.nextInt();

        // Query Exection and data retrieval.
        Statement st = con.createStatement();

        String query = "select * from student where roll>=" + "'"+start_index+"'" + " and " + "roll<="+ "'"+end_index+"'" + " order by roll asc";
        System.out.println(query);
        ResultSet rs = st.executeQuery(query);
        while(rs.next() != false){
            System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3));
        }

        // Connectivity close
        rs.close();
        st.close();
        con.close();
    };
};