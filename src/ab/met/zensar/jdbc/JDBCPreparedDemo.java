package ab.met.zensar.jdbc;

import java.sql.*;


public class JDBCPreparedDemo {

  Connection con;
  PreparedStatement stmt;
  ResultSet rs;






  public JDBCPreparedDemo() {

    try {

      Class.forName("oracle.jdbc.driver.OracleDriver");
      con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XE", "admin", "admin");

      // Class.forName("org.mariadb.jdbc.Driver");
      // con = DriverManager.getConnection("jdbc:mariadb://abappdev.ml:3306/TESTING_DEBUG",
      // "AppDevAB", "AbAppDev^7586#432");

    } catch (Exception E) {
      E.printStackTrace();
    }
  }







  public void getAllRecord() {

    try {
      stmt = con.prepareStatement("select * from EmployeeDemo");

      rs = stmt.executeQuery();

      System.out.println("\n\nEmpID\tEmpName\tSalary");

      while (rs.next()) {
        System.out.print("\n " + rs.getInt("EmpID"));
        System.out.print("\t" + rs.getString("EmpName"));
        System.out.print("\t\t" + rs.getString("Salary"));
      }
    } catch (SQLException throwables) {
      System.err.println("Error =" + throwables.getMessage());
    }
  }



  public void getRecord(int empNo) {

    try {
      stmt = con.prepareStatement("select * from EmployeeDemo where EmpID=?");
      stmt.setInt(1, empNo);

      rs = stmt.executeQuery();

      System.out.println("\n\nEmpID\tEmpName\tSalary");

      while (rs.next()) {
        System.out.print(" " + rs.getInt("EmpID"));
        System.out.print("\t" + rs.getString("EmpName"));
        System.out.print("\t\t" + rs.getString("Salary"));
      }
    } catch (SQLException throwables) {
      System.err.println("Error =" + throwables.getMessage());
    }
  }





  public void insertData(int empNo, String name, float Salary) {

    try {

      stmt = con.prepareStatement("insert into EmployeeDemo values(?,?,?)");
      stmt.setInt(1, empNo);
      stmt.setString(2, name);
      stmt.setFloat(3, Salary);
      int i = stmt.executeUpdate();

      System.out.println("\n\nSuccesfully Inserted " + i);

    } catch (SQLException throwables) {
      System.err.println("\nError =" + throwables.getMessage());
    }
  }





  public void removeEmployee(int min_salary) {
    try {

      stmt = con.prepareStatement("DELETE FROM EmployeeDemo WHERE Salary>?");
      stmt.setFloat(1, min_salary);

      int i = stmt.executeUpdate();
      System.out.println("\nSuccesfully Inserted " + i);

    } catch (SQLException throwables) {
      System.err.println("\nError =" + throwables.getMessage());
    }
  }




  public void reduceSalary(int min_salary, int new_salary) {

    {
      try {

        stmt = con.prepareStatement("UPDATE EmployeeDemo SET Salary = ?  WHERE Salary > ?");
        stmt.setFloat(1, new_salary);
        stmt.setFloat(2, min_salary);

        int i = stmt.executeUpdate();
        System.out.println("\n\nSuccesfully Inserted " + i);

      } catch (SQLException throwables) {
        System.err.println("\nError =" + throwables.getMessage());
      }
    }
  }



  public static void main(String[] args) {
    JDBCPreparedDemo j = new JDBCPreparedDemo();

    j.getAllRecord();
    j.getRecord(Integer.parseInt(args[0]));

    j.insertData(Integer.parseInt(args[1]), args[2], Float.parseFloat(args[3]));
    j.getAllRecord();

    j.removeEmployee(150000);
    j.getAllRecord();

    j.reduceSalary(100000, 80000);
    j.getAllRecord();
  }


}


/*

UPDATE Account SET Balance = ?  WHERE AccountNo > ?"

 */