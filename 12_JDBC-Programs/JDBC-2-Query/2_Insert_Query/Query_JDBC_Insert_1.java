import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
//import oracle.jdbc.driver.OracleDriver;

public class Query_JDBC_Insert_1{
    public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
        Class.forName("oracle.jdbc.driver.OracleDriver");	// Type-4 Driver
        //Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");	// Type-1 Driver
        
	// Connection with the database software
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");	// Type-4 Driver
        //Connection con = DriverManager.getConnection("jdbc:odbc:orcldsn", "scott", "tiger");		// Type-3 Driver
        if(con != null){
            System.out.println("Connection Established !");
        }
        else{
            System.out.println("Connection not established...");
        }

		Statement statement = con.createStatement();

		// data insertion in the database using following way.
		System.out.print("Enter Student roll: ");
		int roll = in.nextInt();
		
		System.out.print("Enter Student name: ");
		String name = in.nextLine();
		name = in.nextLine();

		System.out.print("Enter Student Address: ");
		String address = in.nextLine();

		String query = "insert into student values ("+roll+","+"'"+name+"'"+","+"'"+address+"'"+")";
		int numberrow = statement.executeUpdate(query);

		System.out.println("Number of rows inserted: "+ numberrow);
		
		st.close();
        con.close();
    }
};