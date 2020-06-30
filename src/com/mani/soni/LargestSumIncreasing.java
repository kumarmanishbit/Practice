package com.mani.soni;

public class LargestSumIncreasing {

    public static void main(String[] args) {
        int[] array = {7, 9, 5, 6, 3, 2};

        int sum = array[0];
        int max_sum = array[0];

        for (int i = 1; i < array.length; i++) {

            if(array[i] > array[i-1]) {
                sum = sum + array[i];
            } else {
                sum = array[i];
            }

            if(sum > max_sum) {
                max_sum = sum;
            }
        }

        System.out.println(max_sum);
    }
}
