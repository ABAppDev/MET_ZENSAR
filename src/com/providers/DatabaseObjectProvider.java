package com.providers;

import com.dao_services.DatabaseOperations;
import com.dao_services_impl.DatabaseOperationImplementation;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DatabaseObjectProvider {
  public static DatabaseOperations getDAOObject() {

    DatabaseOperations db = null;

    FileInputStream FIS = null;
    String Package = ".//src//com//resources//";

    try {
      FIS = new FileInputStream(Package + "config.properties");

      Properties properties = new Properties();
      properties.load(FIS);

      String class_name = properties.getProperty("DatabaseComponent");
      Class.forName(class_name);

      db = (DatabaseOperations) Class.forName(class_name).newInstance();

    } catch (ClassNotFoundException | IOException e) {
      // e.printStackTrace();
      System.err.println(e.getMessage());
    } finally {
      try {
        FIS.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
      return db;
    }
  }
}
