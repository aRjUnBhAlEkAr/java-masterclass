

import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

public class Query_JDBC_Update_1{
    
    public static void main(String[] args){
        Connection connection;
        Statement statement;
        Scanner in;
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
            in = new Scanner(System.in);
            int roll = 0, result = 0;
            String name= "";
            String city = "";

            if(connection != null){
                statement = connection.createStatement();
                System.out.print("Enter Student roll: ");
                roll = in.nextInt();
                System.out.print("Enter Student name: ");
                name = in.nextLine();
                name = in.nextLine();
                System.out.print("Enter Student city: ");
                city = in.nextLine();

                String query = "UPDATE student SET name= "+"'"+name+"'"+", address ="+"'"+city+"'"+" WHERE roll= "+roll;

                result = statement.executeUpdate(query);

                if(result != 0){
                    System.out.println(result + " records are updated!");
                }
                else{
                    System.out.println("no record updated!");
                }
            }
            else{
                System.out.println("Connection not established !");
            }
        }
        catch(SQLException sql){
            sql.printStackTrace();
        }
        catch(ClassNotFoundException cnfe){
            cnfe.printStackTrace();
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }
};