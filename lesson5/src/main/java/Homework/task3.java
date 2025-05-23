package Homework;
//Дан список неотрицательных чисел.
// Измените их порядок так, чтобы если их после этого выписать в строку, то получилось максимальное из возможных чисел.
// Пример: дан массив [3, 30, 34, 5, 9]. Максимальное возможное число можно получить 9534330. Сложность O(n log n)

import java.util.Arrays;
import java.util.Comparator;

public class task3 {
    public static String largestNumber(int[] nums) {
        String[] strNums = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strNums[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(strNums, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                String order1 = a + b;
                String order2 = b + a;
                return order2.compareTo(order1);
            }
        });

        if (strNums[0].equals("0")) {
            return "0";
        }

        StringBuilder sb = new StringBuilder();
        for (String num : strNums) {
            sb.append(num);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        int[] nums = {3, 30, 34, 5, 9};
        System.out.println(largestNumber(nums));
    }
}
