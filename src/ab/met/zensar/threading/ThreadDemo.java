package ab.met.zensar.threading;

public class ThreadDemo extends Thread {
  //create custom threads
  Thread t1, t2;

  public ThreadDemo() {
    t1 = new Thread(this);
    t1.start();

    t2 = new Thread(this);
    t2.start();

  }

  public synchronized void run() {
    if (Thread.currentThread() == t1) {

      for (int i = 1; i < 11; i++) {
        System.out.println(i + " X 11 = " + i * 11);

        if (i == 10) {
          try {

            wait();
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
        }
      }
    }
    if (Thread.currentThread() == t2) {

      for (int i = 1; i < 11; i++) {
        if (i == 10) {
          System.out.println(i + " X 55 = " + i * 55);
          try {

            notify();
            Thread.sleep(20);
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
        }
      }
    }
  }

  public static void main(String[] args) {
    System.out.println("in main");
    ThreadDemo d1 = new ThreadDemo();
    d1.run();
  }

}
