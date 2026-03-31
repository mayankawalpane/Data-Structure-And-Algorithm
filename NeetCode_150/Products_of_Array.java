package NeetCode_150;

import java.util.Arrays;

public class Products_of_Array {

    public static void main(String[] args) {

        int arr[] = {1, 2, 4, 6};
        int n = arr.length;

        int result[] = new int[n];

        for (int i = 0; i < n; i++) {

            int product = 1;

            for (int j = 0; j < n; j++) {

                if (i != j) {
                    product *= arr[j];
                }
            }

            result[i] = product;
        }


        System.out.println(Arrays.toString(result));
    }
}