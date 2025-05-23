package Homework;
//Дана последовательность различных чисел,
// в которой все числа до определенного индекса j отсортированы по убыванию, а после j по возрастанию.
// Найдите этот индекс j.  (Сложность O(log n).)
public class task1 {
    public static int findIndex(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if((mid == 0 || arr[mid - 1] > arr[mid]) && mid == arr.length - 1 || arr[mid] < arr[mid + 1]) {
                return mid;
            } else if(mid == arr.length - 1 || arr[mid] < arr[mid + 1]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {10, 8, 5, 3, 6, 9, 12};
        System.out.println(findIndex(arr));
    }
}
