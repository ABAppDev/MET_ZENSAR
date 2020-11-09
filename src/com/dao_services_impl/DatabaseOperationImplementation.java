package com.dao_services_impl;

import ab.met.zensar.accounting_project.Account;
import com.dao_services.DatabaseOperations;
import com.providers.DatabaseProvider;

import java.sql.*;

public class DatabaseOperationImplementation implements DatabaseOperations {
  private Connection con = null;
  private ResultSet rs;

  DatabaseOperationImplementation() {
    con = DatabaseProvider.provideDatabase();
  }

  /**
   * @param AC Account Class
   * @return AccountNumber
   */
  @Override
  public int insertNewAccount(Account AC) {

    try {

      PreparedStatement stmt = con.prepareStatement("insert into Account values(?,?,?,?)");
      stmt.setInt(1, AC.getAccNo());
      stmt.setString(2, AC.getName());
      stmt.setString(3, AC.getType());
      stmt.setFloat(4, AC.getBalance());
      int i = stmt.executeUpdate();
      System.out.println("\n\nNew Account Created");
      return AC.getAccNo();

    } catch (SQLException throwables) {
      System.err.println("\nError =" + throwables.getMessage());
      return 0;
    }
  }

  /**
   * @param accNo Account Number
   * @param Balance Balance
   */
  @Override
  public void updateBalance(int accNo, float Balance) {

    try {
      PreparedStatement pst =
          con.prepareStatement("update Account set BALANCE=? where AccountNo =?");
      pst.setFloat(1, Balance);
      pst.setInt(2, accNo);
      int count = pst.executeUpdate();
      System.out.println("Record updated" + count);
    } catch (Exception e) {
      System.out.println("\n" + e.getMessage());
    }
  }

  /** @param accNo Account Number */
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
}
