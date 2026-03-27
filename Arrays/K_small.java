
import java.util.*;

public class K_small {

    public static void main(String[] args) {

        int arr[] = { 7, 2, 5, 10, 15, 20 };
        int n = arr.length;
        int k=4;e

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

            

        }
        System.out.println("Sorted array is: " + Arrays.toString(arr));
    }
}
