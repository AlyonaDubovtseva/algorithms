package Classwork;

public class task3 {
    public static void main(String[] args) {

        int num =  1010000;
        int left = 0;

    }
    public static int countLastZero(String str, int left, int right) {
        if(left == right) {
            return str.charAt(left) == '0' ? 1 : 0;
        }

        int mid = (left + right) / 2;

        int rightZero = countLastZero(str, mid + 1, right);
        int leftZero = countLastZero(str, left, mid);
        return 0;
    }
}
