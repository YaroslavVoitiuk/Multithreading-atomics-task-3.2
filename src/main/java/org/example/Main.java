package org.example;


public class Main {
    public static void main(String[] args) throws Exception {
        Shop account = new Shop();
        Thread thread1 = new Thread(null, account::transferCash, "Магазин 1");
        Thread thread2 = new Thread(null, account::transferCash, "Магазин 2");
        Thread thread3 = new Thread(null, account::transferCash, "Магазин 3");
        thread1.start();
        thread2.start();
        thread3.start();
        thread3.join();
        thread2.join();
        thread1.join();
        account.calculate();

    }
}
