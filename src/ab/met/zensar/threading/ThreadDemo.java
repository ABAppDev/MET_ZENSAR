package ab.met.zensar.threading;

public class ThreadDemo extends Thread {
public   Thread T11, T55;

  public ThreadDemo() {
    T11 = new Thread();
    T55 = new Thread();

    T11.start();
    T55.start();

  }

  @Override
  public void run() {
    System.out.println("11 " + 1 + "'s are " + 11 * 1);

    if (Thread.currentThread() == T11) {
      System.out.println("11 " + 1 + "'s are " + 11 * 1);

      for (int i = 1; i <= 10; i++) {

        try {        System.out.println("11 " + i + "'s are " + 11 * i);

          Thread.sleep(100);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    }
    if (Thread.currentThread() == T55) {

      for (int i = 1; i <= 10; i++) {

        try {
          System.out.println("55 " + i + "'s are " + 55 * i);

          Thread.sleep(100);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    }
  }

  public static void main(String[] args) {
    //
    ThreadDemo T = new ThreadDemo();

  }
}
