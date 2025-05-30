package Homework;
//есть с и т - два двоичных числа, нужно побитово перемножить их через "разделяй и властвуй"

public class task2 {
    private static String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        while (i >= 0 || j >= 0 || carry > 0) {
            int digitA = (i >= 0) ? a.charAt(i--) - '0' : 0;
            int digitB = (j >= 0) ? b.charAt(j--) - '0' : 0;
            int sum = digitA + digitB + carry;
            result.insert(0, sum % 2);
            carry = sum / 2;
        }
        return result.toString();
    }

    private static String addZeros(String s, int numZeros) {
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < numZeros; i++) {
            sb.insert(0, '0');
        }
        return sb.toString();
    }

    private static String[] equalizeLength(String x, String y) {
        int len = Math.max(x.length(), y.length());
        x = addZeros(x, len - x.length());
        y = addZeros(y, len - y.length());
        return new String[]{x, y};
    }

    public static String multiply(String x, String y) {

        String[] nums = equalizeLength(x, y);
        x = nums[0];
        y = nums[1];
        int n = x.length();
        if (n == 1) {
            return String.valueOf((x.charAt(0) - '0') * (y.charAt(0) - '0'));
        }
        int half = n / 2;
        String xLeft = x.substring(0, half);
        String xRight = x.substring(half);
        String yLeft = y.substring(0, half);
        String yRight = y.substring(half);
        String P1 = multiply(xLeft, yLeft);
        String P2 = multiply(xRight, yRight);
        String sumX = addBinary(xLeft, xRight);
        String sumY = addBinary(yLeft, yRight);
        String P3 = multiply(sumX, sumY);
        String temp = subtractBinary(subtractBinary(P3, P1), P2);
        String part1 = P1 + String.format("%0" + 2 * (n - half) + "d", 0).replace('0', '0');
        String part2 = temp + String.format("%0" + (n - half) + "d", 0).replace('0', '0');
        String sumPart1Part2 = addBinary(part1, part2);
        return addBinary(sumPart1Part2, P2);
    }

    private static String subtractBinary(String a, String b) {
        String[] nums = equalizeLength(a, b);
        a = nums[0];
        b = nums[1];
        StringBuilder result = new StringBuilder();
        int borrow = 0;
        for (int i = a.length() - 1; i >= 0; i--) {
            int digitA = a.charAt(i) - '0';
            int digitB = b.charAt(i) - '0';
            digitA -= borrow;
            if (digitA < digitB) {
                digitA += 2;
                borrow = 1;
            } else {
                borrow = 0;
            }
            result.insert(0, digitA - digitB);
        }

        while (result.length() > 1 && result.charAt(0) == '0') {
            result.deleteCharAt(0);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String binary1 = "1101"; // 13
        String binary2 = "1010"; // 10

        String result = multiply(binary1, binary2);
        System.out.println(result);
    }
}
