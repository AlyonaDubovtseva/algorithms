package Classwork;

public class BinaryFind {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 2, 8};
        int a = 2;
        int[] result = findMinAndMax(array, a);
        System.out.println(result[0] + " " + result[1]);
    }
    public static int[] findMinAndMax(int[] array, int a) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = (right + left) / 2;
            if (array[mid] >= a) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        int low = (left < array.length && array[left] == a) ? left : -1;

        if (low == -1) return new int[]{-1, -1};
        right = array.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] <= a) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        int up = right;

        return new int[]{low, up};
        }
    }

