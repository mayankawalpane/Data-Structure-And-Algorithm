import java.util.*;

public class Push0ToBack {

    public static void main(String[] args) {

        int arr[] = {0, 1, 0, 3, 12};

        int n = arr.length;

        for (int i = 0; i < n; i++) {

            if (arr[i] == 0) {

                for (int j = i; j < n - 1; j++) {
                    arr[j] = arr[j + 1];
                }

                arr[n - 1] = 0;  
                n--;            
                i--;            
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
