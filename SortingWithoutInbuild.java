import java.util.Arrays;

public class SortingWithoutInbuild {

    public static void main(String[] args) {

        int arr[] = {1, -1, 3, 2, -7, -5, 11, 6 };

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                
                if (arr[j] >0) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("The Sorted Array is: " + Arrays.toString(arr));
    }
}
