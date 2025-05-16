package Classwork;
//Для заданного числового массива а для каждого элемента a[i] найти индекс ближайшего меньшего
//элемента.
//Если такого элемента нет - вернуть 0.
//Сложность O(n).

//В стеке хранишь индексы элементов, которые меньше текущего
//Если текущий элемент больше, стек — твой помощник: сверху лежит индекс ближайшего меньшего

import java.util.Stack;

public class SearchSmallestElement {
    public static void main(String[] args) {
        int[] a = {5, 4, 9, 7, 2};
        int[] result = find(a);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }

    public static int[] find(int[] a) {
        int[] b = new int[a.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < a.length; i++) {
            while (!stack.isEmpty() && a[i] <= a[stack.peek()]) {
                stack.pop();
            }

            if (!stack.isEmpty()) {
                b[i] = stack.peek();
            } else {
                b[i] = 0;
            }

            stack.push(i);
        }
        return b;
    }
}
