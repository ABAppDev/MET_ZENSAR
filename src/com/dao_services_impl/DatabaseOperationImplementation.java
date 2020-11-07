package com.dao_services_impl;

import ab.met.zensar.accounting_project.Account;
import com.dao_services.DatabaseOperations;
import com.providers.DatabaseProvider;

import java.sql.*;

public class DatabaseOperationImplementation implements DatabaseOperations {
  private Connection con = null;
  private ResultSet rs;

  private DatabaseOperations AC;

  DatabaseOperationImplementation() {
    try {

      con = DatabaseProvider.provideDatabase();

    } catch (Exception E) {

    }
  }

  public void insertNewAccount(Account AC) {

    try {

      PreparedStatement stmt = con.prepareStatement("insert into Account values(?,?,?,?)");
      stmt.setInt(1, AC.getAccNo());
      stmt.setString(2, AC.getName());
      stmt.setString(3, AC.getType());
      stmt.setFloat(4, AC.getBalance());
      int i = stmt.executeUpdate();

      System.out.println("\n\nAccount Generated ");

    } catch (SQLException throwables) {
      System.err.println("\nError =" + throwables.getMessage());
    }
  }

  @Override
  public void updatebalance(int accNo, float Balance) {}

  @Override
  public void getAccountDetails(int accNo) {

    try {

      PreparedStatement stmt = con.prepareStatement("select * from Account where AccountNo =?");
      stmt.setInt(1, accNo);

      rs = stmt.executeQuery();

      while (rs.next()) System.out.println("\nAccount Details ==>\n " + rs.getString("HolderName"));

    } catch (SQLException throwables) {
      System.err.println("\nError =" + throwables.getMessage());
    }
  }

  public static void main(String args[]) {
    DatabaseOperations d1 = new DatabaseOperationImplementation();
    // d1.insertNewAccount(new Account("Abhishek", "CA", 50000));
    d1.getAccountDetails(10001);
  }
}
