package Revision;

/**
 *
 *
 */
class Test2 implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i < 10; i+=2) {
            System.out.println(i);
            try {
                Thread.sleep(10000);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }

    }
}

class Test3 implements Runnable {
    @Override
    public void run() {
        for (int i = 2; i < 10; i+=2) {
            System.out.println(i);
            try {
                Thread.sleep(10000);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }

    }
}

public class Result {
    public static void main(String[] args) {
        Test2 test2 = new Test2();
        Test3 test3 = new Test3();
        Thread firstThread = new Thread(test2);
        Thread secondThread = new Thread(test3);
        firstThread.start();
        secondThread.start();
    }
}

