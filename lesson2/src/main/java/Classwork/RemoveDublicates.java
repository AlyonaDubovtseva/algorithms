package Classwork;

import java.util.Arrays;
import java.util.Stack;
//В отсортированном списке удалить все дубликаты.
// Сложность O(n).

public class RemoveDublicates {
    public static void main(String[] args) {
        int[] array = {1,2,3,3,4,4,5};
        int[] result = remove(array);
        System.out.println(Arrays.toString(result));
    }
    public static int[] remove(int[] sortedArray) {
        if(sortedArray.length == 0) {
            return new int[0];
        }
        Stack<Integer> stack = new Stack<>();
        stack.push(sortedArray[0]);

        for (int i = 1; i < sortedArray.length; i++) {
            if(sortedArray[i] != stack.peek()) {
                stack.push(sortedArray[i]);
            }
        }

        int[] result = new int[stack.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = stack.get(i);
        }
        return result;
    }
}
