package myPackage;

import java.sql.*;

public class Student {
    public void createTable(){
        // Create connection
        try {
            String url="jdbc:mysql://localhost:3306/";
            String dbname="mydb";
            String username="root";
            String password="12345";

            Connection conn= DriverManager.getConnection(url+dbname,username,password);
            Statement stm=conn.createStatement();
            String query="create table student(rollno int(3) primary key,sname varchar(200), semailid varchar(200))";
            stm.execute(query);
            System.out.println("Table Created successfully");
            stm.closeOnCompletion();
            conn.close();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void createDatabase() {
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

    public void createData() {
        try {
            String url="jdbc:mysql://localhost:3306/";
            String dbname="mydb";
            String username="root";
            String password="12345";

            Connection conn= DriverManager.getConnection(url+dbname,username,password);
//            Statement stm=conn.createStatement();
//            String query="insert into student values(2,'Abhi','abhis@gmail.com')";
//            stm.execute(query);
            String query="insert into student values(?,?,?)";
            PreparedStatement pstm=conn.prepareStatement(query);
            pstm.setInt(1,4);
            pstm.setString(2,"Shiv");
            pstm.setString(3,"shiv@gmail.com");
//            pstm.execute();
            pstm.executeUpdate();
//            pstm.executeQuery();  // will throw an error since it produce resultset which mean which produce output not boolean value
            System.out.println("Data inserted successfully");
            pstm.closeOnCompletion();
            conn.close();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void readData() {
        try {
            String url="jdbc:mysql://localhost:3306/";
            String dbname="mydb";
            String username="root";
            String password="12345";

            Connection conn= DriverManager.getConnection(url+dbname,username,password);
            Statement stm=conn.createStatement();
            String query="select * from student";
            ResultSet rs=stm.executeQuery(query);
            while (rs.next()){
                System.out.println("id: "+rs.getInt(1));
                System.out.println("name: "+rs.getString(2));
                System.out.println("emailid: "+rs.getString(3));
            }
            System.out.println("Data read successfully");
            stm.closeOnCompletion();
            conn.close();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateData() {
        try {
            String url="jdbc:mysql://localhost:3306/";
            String dbname="mydb";
            String username="root";
            String password="12345";

            Connection conn= DriverManager.getConnection(url+dbname,username,password);
            String query="update student set rollno=? where sname=? ";
            PreparedStatement pstm=conn.prepareStatement(query);
            pstm.setInt(1,5);
            pstm.setString(2,"Shiv");

            pstm.executeUpdate();

            System.out.println("Data updated successfully");
            pstm.closeOnCompletion();
            conn.close();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteData() {
        try {
            String url="jdbc:mysql://localhost:3306/";
            String dbname="mydb";
            String username="root";
            String password="12345";

            Connection conn= DriverManager.getConnection(url+dbname,username,password);
            String query="delete from student where sname=? ";
            PreparedStatement pstm=conn.prepareStatement(query);
            pstm.setString(1,"Shiv");

            pstm.executeUpdate();

            System.out.println("Data deleted successfully");
            pstm.closeOnCompletion();
            conn.close();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
