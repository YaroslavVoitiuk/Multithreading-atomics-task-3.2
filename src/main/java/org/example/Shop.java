package org.example;

import java.util.concurrent.atomic.LongAdder;


public class Shop{
   private static final int ARR_SIZE = 7;
   private static final int INCREASE_VALUE = 100;
   LongAdder bank = new LongAdder();

   public void transferCash(){
      Thread.currentThread().setName("Магазин");
      System.out.println(Thread.currentThread().getName() + " переводит деньги");
      int [] cash = new int[ARR_SIZE];
      for (int i = 0; i < ARR_SIZE; i++){
         cash[i] = (int) (Math.random()*INCREASE_VALUE);
      }
      for (Integer i:cash) {
         bank.add(i);
      }
   }
   public void calculate(){
      System.out.println("Общая сумма: " + bank.sum() + "$");
   }

}


