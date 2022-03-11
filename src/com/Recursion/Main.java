package com.Recursion;
import java.lang.reflect.Array;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
	// Array class in java.

        int[] arr = {9,6,7,8,3,1};
        // will directly call a method for binary search.
        int index = Arrays.binarySearch(arr,7);
        System.out.println(index);

        // you can directly sort the array
        Arrays.sort(arr);
        for(int i:arr){
            System.out.print(i+ " ");

            // method to fill a number at every index

            Arrays.fill(arr,45);

             // printing the array with replacement.
            for(int j:arr){
                System.out.println(j+" ");
            }
        }
    }
}
