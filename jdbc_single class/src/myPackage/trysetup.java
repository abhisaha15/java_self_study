package myPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class trysetup {
    public static void main(String[] args) {
        // Create connection
        try {
            String url="jdbc:mysql://localhost:3306/";
//            String dbname="mydb";
            String username="root";
            String password="12345";

            Connection conn= DriverManager.getConnection(url,username,password);
            Statement stm=conn.createStatement();
            String query="create database mydb";
            stm.execute(query);
            System.out.println("Created sucessfully");
            stm.closeOnCompletion();
            conn.close();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}