//        1. add and commit all uncommitted work in your current AdLister branch
//        2. create a 'jdbc-exercise' branch off of the 'jdbc' tag
//        3. add the MySQL connector dependency to your POM file (if not already there)
//        4. create a class called 'JDBCTest'
//        5. in this class, create a private static method called getEmployeeFirstNames that returns a list of strings
//        - the method should return an array list of the first 10 first names of employees in the employees database
//        - a specific table from a given database can be queried directly with the syntax database_name.table_name
//        6. test this method out by adding a main method and souting out the return value of the getEmployeeFirstNames method
//        7. overload the method to take in an integer that determines how many names of employees to return

import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.jar.JarOutputStream;


public class JDBCTest {
    //------- Mini-exercise --------//
    private static List<String> getEmployeeFirstName(){
        List<String> names = new ArrayList<>();

        try {
            DriverManager.registerDriver(new Driver());

            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost/codeup_test_db?serverTimezone=UTC&useSSL=false",
                    "root",
                    "codeup"
            );

            Statement statement = conn.createStatement();
            String query = "SELECT first_name FROM employees.employees LIMIT 10";
            ResultSet rs = statement.executeQuery(query);
            while(rs.next()) {
                names.add(rs.getString(1));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return names;
    }

    private static List<String> getEmployeeFirstName(int numberOfNames){
        List<String> names = new ArrayList<>();

        try {
            DriverManager.registerDriver(new Driver());

            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost/employees?serverTimezone=UTC&useSSL=false",
                    "root",
                    "codeup"
            );

            Statement statement = conn.createStatement();
            String query = "SELECT first_name FROM employees.employees LIMIT " + numberOfNames;
            ResultSet rs = statement.executeQuery(query);
            while(rs.next()) {
                names.add(rs.getString(1));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return names;
    }


    public static void main(String[] args) {
        //---- Mini-exercise ----//
        System.out.println(getEmployeeFirstName());
        System.out.println(getEmployeeFirstName(3));

        //---- mimicking the lecture walk-through -------//
//        try {
//            DriverManager.registerDriver(new Driver());
//
//            Connection conn = DriverManager.getConnection(
//                    "jdbc:mysql://localhost/employees?serverTimezone=UTC&useSSL=false",
//                    "root",
//                    "codeup"
//            );
//
//            Statement statement = conn.createStatement();
//
//            String query = "SELECT * FROM employees";
//
//            ResultSet rs = statement.executeQuery(query);
//
//            rs.next();
//            System.out.println(rs.getString(1));
//            System.out.println(rs.getString(2));
//            System.out.println(rs.getString(3));
//            System.out.println(rs.getString(4));
//            System.out.println(rs.getString(5));
//            System.out.println(rs.getString(6));
//
//            Employee employee = new Employee(rs.getLong("emp_no"),
//                    rs.getString("birth_date"),
//                    rs.getString("first_name"),
//                    rs.getString("last_name"),
//                    rs.getString("gender"),
//                    rs.getString("hire_date")
//            );
//            System.out.println(employee);
//
//
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
    }

}
