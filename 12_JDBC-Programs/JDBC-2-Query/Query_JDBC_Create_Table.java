import java.sql.Connection;     // sql connection package for connectivity.
import java.sql.DriverManager;  // sql DriverManager package for driver registration and connection.
import java.sql.Statement;      // sql Statement interface for the performing the operation on the quories.
import java.sql.ResultSet;      // sql ResultSet interface for the fetching the result set from the Database.
import oracle.jdbc.driver.OracleDriver; // JDBC oracle package for performing operation on the Oracle DB.


public class Query_JDBC_Create_Table{
    public static void main(String[] args) throws Exception{
        Class.forName("oracle.jdbc.driver.OracleDriver");

        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");

        if(con != null){
            System.out.println("Connection established !");
        }
        else{
            System.out.println("Connection not established...");
        }

        Statement st = con.createStatement();

        String query = "create table student(roll int, name varchar2(50), address varchar2(100))";
        System.out.println("Query: " + query);
        ResultSet rs = st.executeQuery(query);  // for the select query.

        query = "select * from tab";
        rs = st.executeQuery(query);    // executeQuery for the select query.

        while(rs.next() != false){
            System.out.println(rs.getString("tname") + "\t" + rs.getString("tabtype"));
        }

        // connection close
        rs.close();
        st.close();
        con.close();
    }
};