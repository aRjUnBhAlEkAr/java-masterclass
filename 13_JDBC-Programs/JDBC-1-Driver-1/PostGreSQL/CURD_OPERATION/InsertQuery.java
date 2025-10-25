import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
// import java.sql.
import java.util.Scanner;

public class InsertQuery{
    public static void main(String[] args)throws ClassNotFoundException, SQLException{
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Student id: ");
        int id = in.nextInt();

        System.out.print("Enter Student name: ");
        String name = in.next();

        System.out.print("Enter Student Department: ");
        String department = in.next();

        System.out.print("Enter Student City: ");
        String city = in.next();

        System.out.print("Enter Student Mark1: ");
        int mark1 = in.nextInt();

        System.out.print("Enter Student Mark2: ");
        int mark2 = in.nextInt();

        System.out.print("Enter Student Mark3: ");
        int mark3 = in.nextInt();

        Class.forName("org.postgresql.Driver");
        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/csmss", "postgres", "Arjun@5556");

        String query = "insert into student values("+id+","+"'"+name+"'"+","+"'"+department+"'"+","+"'"+city+"'"+","+mark1+","+mark2+","+mark3+")";

        PreparedStatement ps = connection.prepareStatement(query);

        int result = ps.executeUpdate();

        if(result!=0){
            System.out.print("Data inserted successfully!");
        }
        else{
            System.out.print("Data not inserted!");
        }

        ps.close();
        connection.close();
        in.close();
    }
};