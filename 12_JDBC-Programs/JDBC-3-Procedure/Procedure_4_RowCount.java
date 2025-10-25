import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.CallableStatement;
import java.sql.Types;
import java.sql.SQLException;
import java.util.Scanner;

public class Procedure_4_RowCount{
    public static void main(String[] args) throws ClassNotFoundException, SQLException{
        Scanner in = new Scanner(System.in);

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/csmss", "root", "Arjun@5556");

        CallableStatement callablestatement = connection.prepareCall("{call update_proc( ?, ?, ?, ?, ?)}");

        callablestatement.registerOutParameter(5, Types.INTEGER);

        callablestatement.setInt(1, in.nextInt());
        callablestatement.setString(2, in.next());
        callablestatement.setString(3, in.next());
        callablestatement.setString(4, in.next());

        int count = callablestatement.getInt(5);
        callablestatement.execute();

        System.out.println(count);
        callablestatement.close();
        connection.close();
    }
};