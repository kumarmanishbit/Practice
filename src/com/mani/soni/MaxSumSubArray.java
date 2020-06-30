package com.mani.soni;

import org.omg.CORBA.MARSHAL;

public class MaxSumSubArray {
    public static void main(String[] args) {
        int[] array = {-2,1,-3,4,-1,2,1,-5,4};

        int max_till_now = array[0];

        int max_sum = array[0];


        for (int i = 1; i < array.length ; i++) {


            // reset the start index.
            // keep track of the sum till that index
            // if the sum till now is less than the current index
            // then reset it.

            if(array[i] > max_till_now + array[i]) {
                max_till_now = array[i];
            } else {
                max_till_now = max_till_now + array[i];
            }
            // decide dowm the loop max_till_now

            if(max_sum < max_till_now) {
                max_sum = max_till_now;
            }

        }

        System.out.println(max_sum);

    }
}
