package Homework;
//Даны два массива целых чисел. Вернуть массив их общих элементов,
// где количество вхождений каждого элемента равно минимальному из его встречаемости в обоих массивах
//Пример:
//[2, 4, 4, 1], [2, 2, 4, 5]
//Вывод:
//[2, 4]

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TwoArrays {
    public static void main(String[] args) {
        int[] nums1 = {2, 4, 4, 1};
        int[] nums2 = {2, 2, 4, 5};
        List<Integer> result = intersection(nums1, nums2);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }


    public static List<Integer> intersection(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map1 = new HashMap<>();
        for (int num : nums1) {
            map1.put(num, map1.getOrDefault(num, 0) + 1);
        }
        HashMap<Integer, Integer> map2 = new HashMap<>();
        for (int num : nums2) {
            map2.put(num, map2.getOrDefault(num, 0) + 1);
        }
        List<Integer> result = new ArrayList<>();
        for (int num : map1.keySet()) {
            if (map2.containsKey(num)) {
                int count = Math.min(map1.get(num), map2.get(num));
                for (int i = 0; i < count; i++) {
                    result.add(num);
                }
            }
        }
        return result;
    }
}
