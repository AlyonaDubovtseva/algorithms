import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] array = {1, 3, -5 ,3 ,2 , 10};
        System.out.println(Arrays.toString(array));

        int min;
        int temp;
        for (int i = 0; i < array.length - 1; i++) {
            min = i;
            for(int j = i + 1; j < array.length; j++) {
                if(array[j] < array[min]) {
                    min = j;
                }
             }
            temp = array[min];
            array[min] = array[i];
            array[i] = temp;

        }
        System.out.println(Arrays.toString(array));
    }
}
