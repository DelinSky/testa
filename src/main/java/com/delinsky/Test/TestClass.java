package com.delinsky.Test;

/**
 * Created by Vladimir on 16.03.2017.
 */
public class TestClass {
    public static void main(String[] args) {
        Loot a = new Loot();
        int summ = 0;
        for (int j = 0; j < 100; j++) {


            for (int i = 0; i < 1000000; i++) {
                a.gotOrNot();
            }
            System.out.println(a.counter);
            summ+=a.counter;
            a.counter = 0;
        }
        System.out.println();
        System.out.println(summ/100);
    }
}
