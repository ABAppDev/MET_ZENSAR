package com.providers;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DatabaseProvider {
  /** @return Connection For Database */
  public static Connection provideDatabase() {
    Connection con = null;

    FileInputStream FIS = null;
    String Package = ".//src//com//resources//";

    try {
      FIS = new FileInputStream(Package + "dbConfig.properties");

      Properties properties = new Properties();
      properties.load(FIS);

      String class_name = properties.getProperty("DatabaseComponent");
      Class.forName(class_name);
      con =
          DriverManager.getConnection(
              properties.getProperty("URL"),
              properties.getProperty("Username"),
              properties.getProperty("Password"));

    } catch (ClassNotFoundException | IOException e) {
      // e.printStackTrace();
      System.err.println(e.getMessage());
    } finally {
      try {
        FIS.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
      return con;
    }
  }
}
