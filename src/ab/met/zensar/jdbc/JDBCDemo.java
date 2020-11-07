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

      stmt = con.createStatement();

    } catch (Exception E) {
      E.printStackTrace();
    }
  }

  public void getRecord(int empNo) {

    try {
      rs = stmt.executeQuery(String.format("select * from EmployeeData where EmpID=%d", empNo));

      while (rs.next()) {
        System.out.println("\n\n*Employee Name = " + rs.getString("Name"));
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
              String.format("insert into EmployeeData values(%d,'%s',%f)", empNo, name, Salary));


    } catch (SQLException throwables) {
      System.err.println("Error =" + throwables.getMessage());
    }
  }

  public static void main(String[] args) {
    JDBCDemo j = new JDBCDemo();
    //j.getRecord(1);
    j.insertData(5,"abhi",50400);
  }
}
