package GeeksForGeeks.Arrays;
/**
 *"2a", "grea3t", "l3earning", "geeksfor0geeks", "p5latform", "is1"
 */


class MyThread extends Thread {
    Balance b = new Balance();
    @Override
    public void run() {
        System.out.println("I am child thread");
    }

    public void setBalance() {
        synchronized (Balance.class) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("I am child start");
        }
    }
    public void getBalance() {
        b.tiger();
        System.out.println("I am child start");
    }
}

public class Test {
    public static void main(String arr[]) {
//        MyThread t= new MyThread();
//        MyThread t1= new MyThread();
//        t.setBalance();
//        t1.getBalance();
//        System.out.println("S chala");
        try {
            extracted();
        } catch (ArithmeticException e) {
            e.printStackTrace();


        }
    }

    private static void extracted() {
        int a = 10 / 0;
        System.out.println(a);
    }
}
