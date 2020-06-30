package com.mani.soni;

public class SquareSort {

    public static void main(String[] args) {
        int[] array = {-6,-3,-1,2,4,5};

        int negativeIndex = -1;

        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * array[i];
        }
    }
}
