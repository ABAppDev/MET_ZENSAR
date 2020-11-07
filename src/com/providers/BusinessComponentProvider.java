package com.providers;

import com.services.AccountServices;
import com.services_impl.AccountServicesImplementation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/** Creates BusinessComponent And Provide */
public class BusinessComponentProvider {
  /** @return AccountServices */
  /*public static AccountServices provideObject(){
  return new AccountServicesImplementation();
  }

   */
  public static AccountServices provideObject() {
    FileInputStream FIS = null;
    AccountServices ac = null;
    String Package = ".//src//com//resources//";

    try {
      FIS = new FileInputStream(Package + "config.properties");

      Properties properties = new Properties();
      properties.load(FIS);

      String class_name = properties.getProperty("BusinessComponent");
      ac = (AccountServices) Class.forName(class_name).newInstance();

    } catch (ClassNotFoundException
        | InstantiationException
        | IllegalAccessException
        | IOException e) {
      e.printStackTrace();
      System.err.println(e.getMessage());
    } finally {
      return ac;
    }
  }
}
