import java.util.Scanner;

public class DeskClose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(countWrongBrackets(s));
    }

    public static int countWrongBrackets(String s) {
        int open = 0;
        int errors = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') open++;
            else if (c == ')') {
                if (open > 0) open--;
                else errors++;
            }
        }
        errors += open;

        return errors;
    }
}
