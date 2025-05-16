import java.util.Scanner;
import java.util.Stack;

public class PostfixCalculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        try {
            int result = calculate(s);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Ошибка");
        }
    }

    public static int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        String[] tokens = s.trim().split("\\s+");

        for (String token : tokens) {
            if (token.matches("-?\\d+")) {
                stack.push(Integer.parseInt(token));
            } else {
                if (stack.size() < 2) {
                    throw new IllegalArgumentException();
                }
                int element2 = stack.pop();
                int element1 = stack.pop();

                switch (token) {
                    case "+":
                        stack.push(element1 + element2);
                        break;
                    case "-":
                        stack.push(element1 - element2);
                        break;
                    case "*":
                        stack.push(element1 * element2);
                        break;
                    default:
                        throw new IllegalArgumentException();
                }
            }
        }

        return stack.pop();
    }
}