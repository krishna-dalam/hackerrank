package com.practice.hackerrank.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class UnexpectedDemand {

    public static void main(String[] args) {
        List<Integer> order = new ArrayList<>();
        order.add(30);
        order.add(10);
//        order.add(6);

        int k = 40;
        int count = 0;

        order.sort(Integer::compareTo);
        for(int e: order) {
            if(k >=e){
                k-=e;
                count++;
            }
        };
        System.out.println(count);
    }
}
