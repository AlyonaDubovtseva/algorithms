package Homework;
//Есть строка. Нужно развернуть строку так, чтобы каждое из слов осталось в естественном порядке.
// Например.
// Input 1: A = "the sky is blue"
// Output 1: "blue is sky the"
// Input 2: A = "this is ib"
// Output 2: "ib is this". Сложность линейная, с О(1) дополнительной памяти.

public class Task2 {
    public static void main(String[] args) {
        String str = "the sky is blue";
        System.out.println(reverse(str));
    }
    public static String reverse(String str) {
        String[] words = str.trim().split("\\s+");
        int left = 0;
        int right = words.length - 1;

        while (left < right) {
            String temp = words[left];
            words[left] = words[right];
            words[right] = temp;
            left++;
            right--;
        }
        return  String.join(" ", words);
    }
}
