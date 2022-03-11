package com.Recursion;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
	// Array class in java.
        int[] arr = {9,6,7,8,3,1};
        int index = Arrays.binarySearch(arr,7);
        System.out.println(index);
    }
}
