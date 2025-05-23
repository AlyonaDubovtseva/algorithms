package Homework;
//Дан список неотрицательных чисел и некоторое число s.
// Необходимо вывести мксимальное количество числе из списка, сумма которых не превышает s.
// Пример: [15, 5, 11, 10, 12], s = 30, тогда ответ будет 3 (например, 5 + 10 + 11 < 30)

import java.util.Arrays;

public class task4 {
    public static int maxNumbers(int[] nums, int s) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        int count = 0;
        int sum = 0;

        while (left <= right) {
            if (sum + nums[left] <= s) {
                sum += nums[left];
                count++;
                left++;
            } else if (left != right && sum + nums[right] <= s) {
                sum += nums[right];
                count++;
                right--;
            } else {
                right--;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {15, 5, 11, 10, 12};
        int s = 30;
        System.out.println(maxNumbers(nums, s));
    }
}
