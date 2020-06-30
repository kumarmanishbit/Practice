package com.mani.soni;

public class Test {

    public static void main(String[] args) {
        int[] stock = {7, 9, 5, 6, 3, 2};

        int max_so_far = 0;

        int prev_small = Integer.MAX_VALUE;

        for (int i = 0; i < stock.length; i++) {

            if( (stock[i] - prev_small) > max_so_far ) {
                max_so_far = (stock[i] - prev_small);
            }

            if(stock[i] < prev_small) {
                prev_small = stock[i];
            }
        }

        System.out.println(max_so_far);

    }
}
