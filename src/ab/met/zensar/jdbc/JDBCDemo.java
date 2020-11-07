package ab.met.zensar.jdbc;

import java.sql.*;

public class JDBCDemo {

  Connection con;
  Statement stmt;
  ResultSet rs;

  public JDBCDemo() {

    try {

      Class.forName("oracle.jdbc.driver.OracleDriver");
      con = DriverManager.getConnection("jdbc:oracle:thin:@localhost")

    } catch (Exception E) {

    }
  }
}
