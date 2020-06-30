package com.mani.soni;

import java.util.Collections;
import java.util.PriorityQueue;

public class KLargestSum {

    public static void main(String[] args) {
        int[] array = {20, 15, 14, -5, -6, -1};

        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> Integer.compare(a,a));


        //PriorityQueue<Integer> pq =new PriorityQueue<>((x, y) -> Integer.compare(y, x));


        queue.add(5);
        queue.add(10);
        queue.add(67);

     //   queue.remove();
        System.out.println(queue.peek());
        System.out.println(queue.poll());

    }
}
