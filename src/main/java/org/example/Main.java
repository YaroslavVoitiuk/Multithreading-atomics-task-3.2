package org.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static final int MAX_VAl = 3;

    public static void main(String[] args) throws Exception {
        Shop account = new Shop();

        ExecutorService es = Executors.newCachedThreadPool();
        for (int i = 0; i < MAX_VAl; i++) {
            es.execute(account::transferCash);
        }
        es.shutdown();
        boolean isOver = es.awaitTermination(1, TimeUnit.MINUTES);

        if (isOver) {
            account.calculate();
        }
    }
}
