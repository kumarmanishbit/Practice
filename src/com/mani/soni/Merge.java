package com.mani.soni;

import java.util.Arrays;

public class Merge {

    public static void main(String[] args) {

        int[] arr = {-6,-3,-1,2,4,5};

        int positive = -1;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > 0 ) {
                positive = i;
                break;
            }
        }



        int[] first = Arrays.copyOfRange(arr, 0, positive);


        for (int i = 0; i < first.length; i++) {
            first[i] = first[i] * first[i];
        }

        int i = 0 , j = first.length - 1;
        while(i < j) {

            int f = first[i];

            first[i]= first[j];

            first[j] = f;

            j--;
            i++;

        }

        for (int k = 0; k < first.length; k++) {
         //   System.out.println(first[k]);
        }


        for (int l = positive; l < arr.length; l++) {
            arr[l] = arr[l] * arr[l];
        }



        int[] newarray = merge(Arrays.copyOfRange(arr, positive, arr.length ), first);

        for (int l = 0; l < newarray.length; l++) {

            System.out.println(newarray[l]);
        }
    }

    static int[] merge(int[] first, int[] second) {

        int[] newarray = new int[first.length + second.length];

        int i = 0, j = 0 , k= 0;
        for ( k=0; k < newarray.length; k++) {

            if((i< first.length && j < second.length) && first[i] > second[j]) {
                newarray[k] = second[j];
                j++;
            } else if(i< first.length){
                newarray[k] = first[i];
                i++;
            }
        }

        return newarray;
    }
}
