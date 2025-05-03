import java.util.Scanner;
import java.util.Stack;

public class Deck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("введите строку из скобок");
        String s = scanner.nextLine();

        boolean result = isRight(s);
        System.out.println("Скобки расставлены " + (result ? "правильно." : "неправильно."));
    }

    public static boolean isRight(String s) {
        if ( s == null) {
            System.out.println("вы ничего не ввели");
            return false;
        }

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if(ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            }
            else if(ch == ')' || ch == ']' || ch == '}') {
                if (stack.isEmpty()) {
                    return false;
                }
                char up = stack.pop();
                if ((ch == ')' && up != '(') ||
                        (ch == ']' && up != '[') ||
                        (ch == '}' && up != '{')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
