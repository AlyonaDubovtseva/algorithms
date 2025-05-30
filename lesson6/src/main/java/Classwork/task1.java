package Classwork;
//есть массив длины н, найти максимальный элемент через "разделяй и властвуй"

public class task1 {
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 1, 5, 9, 2, 6, 5,3};
        int left = 0;
        int right = arr.length - 1;
        System.out.println(find(arr, left, right));
    }
    public static int find(int[] arr, int left, int rigth) {

        if(left == rigth) {
            return arr[left];
        }

        int mid = (left + rigth) / 2;

        int inLeft = find(arr, left, mid);
        int inrigth = find(arr, mid + 1, rigth);

        return Math.max(inrigth, inLeft);
    }
}
