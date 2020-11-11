package com.client;

import com.exceptions.InsufficiantAccountBalanceException;
import com.exceptions.InvalidAccountException;
import com.providers.BusinessComponentProvider;
import com.services.AccountServices;
import com.services_impl.AccountServicesImplementation;

import java.util.Scanner;

// Main Client Code Program

/** User Interaction Class */
public class Main {

  public static void main(String[] args) {

    int Ac1, Ac2;
    char ch;

    /** Getting Business Component From Provider */
    AccountServices services = BusinessComponentProvider.provideObject();
    AccountServices services2 = BusinessComponentProvider.provideObject();

    System.out.println("\nBanking System Project\n");

    /** Creating Account 1 */
    Scanner Sc = new Scanner(System.in);

    {
      System.out.println("*Creating Account\nEnter TYPE (SA/CA/DM) and Opening Balance=");

      Ac1 = services.openAccount(Sc.nextLine(), Sc.nextFloat());

      System.out.println("\n*Account Created. Account Number = " + Ac1);
    }


    /** Creating Account 2 */
    Sc = new Scanner(System.in);
    {
      System.out.println("*Creating Account\nEnter TYPE (SA/CA/DM) and Opening Balance=");

      Ac2 = services2.openAccount(Sc.nextLine(), Sc.nextFloat());

      System.out.println("\n*Account Created. Account Number = " + Ac2);
    }

    do {

      System.out.println(
          "Menu" +
                  "\n1.Deposit To Account" +
                  "\n2.Withdraw From Account" +
                  "\n3.Fund Transfer" +
                  "\n4.Balance Check" +
                  "\n=> ");

      int choice = Sc.nextInt();

      switch (choice) {

        //Deposit Balance
        case 1 -> {
          System.out.println("\nEnter Account Number = ");
          int AcNo = Sc.nextInt();
          System.out.println("\nEnter Balance = ");
          float Bal = Sc.nextFloat();
          if (Ac1 == AcNo) {
            services.deposit(AcNo, Bal);
          } else if (Ac2 == AcNo) {
            services2.deposit(AcNo, Bal);
          } else {
            System.out.println("\nInvalid Account Number");
          }
        }

        //Balance Withdraw
        case 2 -> {
          System.out.println("\nEnter Account Number = ");
          int AcNo = Sc.nextInt();
          System.out.println("\nEnter Balance = ");
          float Bal = Sc.nextFloat();
          try {
            if (Ac1 == AcNo) {
              services.withdraw(AcNo, Bal);
            } else if (Ac2 == AcNo) {
              services2.withdraw(AcNo, Bal);
            } else {
              System.out.println("\nInvalid Account Number");
            }
          } catch (InvalidAccountException | InsufficiantAccountBalanceException e) {
            e.printStackTrace();
          }
        }

        //FundTransfer
        case 3 -> {
          System.out.println("\nEnter FROM Account Number = ");
          int from = Sc.nextInt();
          System.out.println("\nEnter TO Account Number = ");
          int to = Sc.nextInt();
          System.out.println("\nEnter Balance = ");
          float Bal = Sc.nextFloat();
          try {
            if (Ac1 == from && Ac2 == to) {
              services.fundTransfer(from, to, (AccountServicesImplementation) services2, Bal);
            } else if (Ac1 == to && Ac2 == from) {
              services2.fundTransfer(from, to, (AccountServicesImplementation) services, Bal);
            } else {
              System.out.println("\nInvalid Account Number");
            }
          } catch (InvalidAccountException | InsufficiantAccountBalanceException e) {
            e.printStackTrace();
          }
        }

        //For Check Balance
        case 4 -> {
          System.out.println("\nEnter Account Number = ");
          int AcNo = Sc.nextInt();
          if (Ac1 == AcNo) {
            services.checkBalance(Ac1);
          } else if (Ac2 == AcNo) {
            services2.checkBalance(Ac2);
          } else {
            System.out.println("\nInvalid Account Number");
          }
        }

        //For Invalid Choice
        default -> System.out.println("\nInvalid Input");
      }

      System.out.println("\n Continue ?? (y to continue) => ");
      ch = Sc.next().charAt(0);
    } while (ch == 'y');


  }
}
