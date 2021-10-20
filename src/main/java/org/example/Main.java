package org.example;

public class Main {
    public static final int START_VAL = 1;
    public static final int MAX_VAl = 3;

    public static void main(String[] args) throws Exception {
        Shop account = new Shop();

        for (int i = START_VAL; i <= MAX_VAl; i++){
            Thread thread = new Thread(null, account::transferCash, "Магазин " + i);
            thread.start();
            thread.join();
        }
        account.calculate();

    }
}
