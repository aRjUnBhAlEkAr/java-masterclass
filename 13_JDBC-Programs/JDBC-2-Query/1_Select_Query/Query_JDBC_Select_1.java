// select student details based on given first character of student name and city
// select * from student where name like m% and 

import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Query_JDBC_Select_1{
    public static void main(String[] args) throws SQLException, ClassNotFoundException{
        Scanner sc = new Scanner(System.in);

        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");

        System.out.print("Enter First Character: ");
        char name = sc.next().charAt(0);

        System.out.print("Enter City 1 name: ");
        String city_1 = sc.nextLine();
        city_1 = sc.nextLine();

        System.out.print("Enter City 2 name: ");
        String city_2 = sc.nextLine();


        Statement st = con.createStatement();

        // String query = "select * from student where name like " + "'"+name+"%'" + " and (address = " + "'"+city_1+"'" +" or address = "+"'"+city_2+"'"+")";
                                                            // OR
        String query = "select * from student where name like " + "'"+name+"%'" + " and address in ("+ "'"+city_1+"'" + "," + "'"+city_2+"'" + ")";
        // System.out.println(query);
        ResultSet rs = st.executeQuery(query);

        while(rs.next() != false){
            // System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3));
                                            // or
            // System.out.println(rs.getInt("roll") + "\t" + rs.getString("name") + "\t" + rs.getString("address"));
                                            // or
            System.out.println(rs.getInt("roll") + "\t" + rs.getString(2) + "\t" + rs.getString("address"));
        }
    // Connection close statement with database.
        rs.close();
        st.close();
        con.close();
    }
};