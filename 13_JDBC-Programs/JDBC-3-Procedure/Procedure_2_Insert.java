/* 
Create procedure using following SQL procedure query for insert query operation.
mysql> create procedure insert_proc(IN no INT, IN sname VARCHAR(50), IN scity VARCHAR(50), IN sdept VARCHAR(50))
    -> begin
    -> insert into student values (no, sname, scity, sdept);
    -> end@
*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;

public class Procedure_2_Insert{
    public static void main(String[] args) throws ClassNotFoundException, SQLException{
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Student ID: ");
        int id = in.nextInt();
        System.out.print("Enter Student Name: ");
        String name = in.next();
        System.out.print("Enter Student City: ");
        String city = in.next();
        System.out.print("Enter Student Department: ");
        String department = in.next();
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/csmss", "root", "Arjun@5556");

        CallableStatement callablestatement = connection.prepareCall("{call insert_proc( ?, ?, ?, ?)}");

        callablestatement.setInt(1, id);
        callablestatement.setString(2, name);
        callablestatement.setString(3, city);
        callablestatement.setString(4, department);

        callablestatement.execute();
        
        callablestatement.close();
        connection.close();
        in.close();
    }
};