package Homework;
//Дан массив целых чисел и число k. Определить, есть ли в массиве такие два различных индекса i и j,
// что nums[i] == nums[j] и |i - j| <= k
//Пример:
//[1, 2, 3, 1, 5], k = 3
//Вывод: true (индекс 0 и 3, расстояние 3)

import java.util.HashMap;

public class ArraysIndex {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 2, 2};
        int k = 3;
        System.out.println(isHave(array, k));
    }
    public static boolean isHave(int[] array, int k) {
        //число-ключ, его последний индекс-значение
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            if(hashMap.containsKey(array[i])) {
                if(array[i] - hashMap.get(array[i]) <= k) {
                    return true;
                }
            }
            hashMap.put(array[i], i);
        }
        return false;
    }
}
