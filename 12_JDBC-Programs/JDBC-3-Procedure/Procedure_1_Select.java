/*
Create procedure using following SQL procedure query for select query operation.
mysql> delimiter $$
mysql> create procedure test_proc(IN NO INT, OUT SNAME VARCHAR(10), OUT SCITY VARCHAR(10), OUT SDEPT VARCHAR(10))
    -> BEGIN
    ->      select name, city, department into SNAME, SCITY, SDEPT from student where id=no;
    -> end $$
*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.CallableStatement;
import java.sql.Types;
import java.sql.SQLException;
import java.util.Scanner;

public class Procedure_1_Select{
    public static void main(String[] args) throws ClassNotFoundException, SQLException{
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Student ID: ");
        int id = in.nextInt();

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/csmss", "root", "Arjun@5556");

                                                                                //     IN   OUT   OUT   OUT
        CallableStatement callablestatement = connection.prepareCall("{call test_proc(   ?,    ?,    ?,    ?)}");
        callablestatement.registerOutParameter(2, Types.VARCHAR);
        callablestatement.registerOutParameter(3, Types.VARCHAR);
        callablestatement.registerOutParameter(4, Types.VARCHAR);

        callablestatement.setInt(1, id);
        callablestatement.execute();

        System.out.println(callablestatement.getString(2) +"\t"+callablestatement.getString(3)+"\t"+callablestatement.getString(4));

        connection.close();
    }
};