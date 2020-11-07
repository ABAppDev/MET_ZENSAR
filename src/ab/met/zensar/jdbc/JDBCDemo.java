package ab.met.zensar.jdbc;

import java.sql.*;

public class JDBCDemo {

  Connection con;
  Statement stmt;
  ResultSet rs;

  public JDBCDemo() {

    try {

      Class.forName("oracle.jdbc.driver.OracleDriver");
      con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XE", "admin", "admin");

      // Class.forName("org.mariadb.jdbc.Driver");
      // con = DriverManager.getConnection("jdbc:mariadb://abappdev.ml:3306/TESTING_DEBUG",
      // "AppDevAB", "AbAppDev^7586#432");

      stmt = con.createStatement();

    } catch (Exception E) {
      E.printStackTrace();
    }
  }

  public void getRecord(int empNo) {

    try {
      rs = stmt.executeQuery(String.format("select * from EmployeeDemo where EmpID=%d", empNo));

      while (rs.next()) {
        System.out.println("\n*Employee Name = " + rs.getString("EmpName"));
        System.out.println("*Employee ID = " + rs.getInt("EmpID"));
        System.out.println("*Employee Salary = " + rs.getString("Salary"));
      }
    } catch (SQLException throwables) {
      System.err.println("Error =" + throwables.getMessage());
    }
  }

  public void insertData(int empNo, String name, float Salary) {

    try {
      rs =
          stmt.executeQuery(
              String.format("insert into EmployeeDemo values(%d,'%s',%f)", empNo, name, Salary));

      System.out.println("Succesfully Inserted");

    } catch (SQLException throwables) {
      System.err.println("\nError =" + throwables.getMessage());
    }
  }

  public static void main(String[] args) {
    JDBCDemo j = new JDBCDemo();
    j.getRecord(Integer.parseInt(args[0]));
     j.insertData(6, "vid", 30400);
     j.getRecord(3);
  }
}
