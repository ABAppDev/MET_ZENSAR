package ab.met.zensar;

import com.providers.BusinessComponentProvider;
import com.services.AccountServices;

public class DB {
  public static void main(String[] args) {
    //
    AccountServices services = BusinessComponentProvider.provideObject();


    int accNo = services.openAccount("CA", 600000);

    System.out.println("New Account " + accNo + " Created");

    services.checkBalance(10001);
    services.deposit(10001,500);
  }
}
