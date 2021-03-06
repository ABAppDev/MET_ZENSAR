package com.dao_services_impl;

import com.beans.Account;
import com.dao_services.DatabaseOperations;
import com.providers.DatabaseConnectionProvider;

import java.sql.*;

public class DatabaseOperationImplementation implements DatabaseOperations {
  private Connection con = null;
  private ResultSet rs;

  public DatabaseOperationImplementation() {
    con = DatabaseConnectionProvider.provideDatabase();
  }

  /**
   * @param AC Account Class
   * @return AccountNumber
   */
  @Override
  public int insertNewAccount(Account AC) {

    try {

      if (isAccountExists(AC.getAccNo())) {

        updateBalance(AC.getAccNo(), AC.getBalance());
        System.out.println("\nAccount Already Exists");
        System.out.println("Existing Account Balance Reset");

      } else {

        PreparedStatement stmt = con.prepareStatement("insert into Account values(?,?,?)");
        stmt.setInt(1, AC.getAccNo());
        stmt.setString(2, AC.getType());
        stmt.setFloat(3, AC.getBalance());
        int i = stmt.executeUpdate();
        System.out.println("\nNew Account Created");
      }
      return AC.getAccNo();

    } catch (SQLException throwables) {
      System.err.println("\nError Occured. Reason - " + throwables.getMessage());
      return 0;
    }
  }


  /**
   * Check If Account Exists Or Not
   * @param NUM Account Number
   * @return isAccountIsExists In Database
   */
  @Override
  public boolean isAccountExists(int NUM) {

    try {

      PreparedStatement stmt = con.prepareStatement("select * from Account where AccountNo=?");
      stmt.setInt(1, NUM);

      ResultSet i = stmt.executeQuery();
      i.next();
      return i.getInt("AccountNo") == (NUM);

    } catch (SQLException throwables) {
      return false;
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
      System.out.println("Transaction Successful");
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

      while (rs.next())
        System.out.println(
            "\nAccount Details ==>\n AccountNo = "
                + rs.getString("AccountNo")
                + "\n Account Type = "
                + rs.getString("AccountType")
                + "\n Account Balance = "
                + rs.getString("Balance"));

    } catch (SQLException throwables) {
      System.err.println("\nError Occured. Reason - " + throwables.getMessage());
    }
  }
}
