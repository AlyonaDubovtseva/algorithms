package Classwork;

import java.util.Arrays;

public class Array012 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0,2, 0, 1, 2, 1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int [] arr) {
        int left = 0;
        int mid = 0;
        int right = arr.length - 1;

        while (mid <= right) {
            if(arr[mid] == 0) {
                swap(arr, left, mid);
                left++;
                mid++;
            }
            else if(arr[mid] == 1) {
                mid++;
            }
            else{
                swap(arr, mid, right);
                right--;
            }
        }
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
