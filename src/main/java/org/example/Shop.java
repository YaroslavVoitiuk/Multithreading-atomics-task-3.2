package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import java.util.concurrent.atomic.LongAdder;


public class Shop  {
   private static final int ARR_SIZE = 5;
   private static final int MAX_RANDOM_VALUE = 100;
   LongAdder bank = new LongAdder();

   public void transferCash(){
      System.out.println(Thread.currentThread().getName() + " переводит деньги");
      List<Integer> cash = new ArrayList<>();
      for (int i = 0; i < ARR_SIZE; i++){
         cash.add(new Random().nextInt(MAX_RANDOM_VALUE));
      }
      for (Integer i:cash) {
         bank.add(i);
      }
   }
   public void calculate(){
      System.out.println("Общая сумма: " + bank.sum() + "$");
   }

}


