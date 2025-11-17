
// Input: arr[] = {2, 3, -8, 7, -1, 2, 3}
// Output: {7, -1, 2, 3}
// Explanation: The subarray {7, -1, 2, 3} has the largest sum 11.

// Input: arr[] = {-2, -5, 6, -2, -3, 1, 5, -6}
// Output: {6, -2, -3, 1, 5}
// Explanation: The subarray {6, -2, -3, 1, 5} has the largest sum of 7.



import java.util.*;
public class Subarray {
    public static void main(String[] args) {
        int[] arr = {2, 3, -8, 7, -1, 2, 3};

        findMaxSubarray(arr);
    }

    public static void findMaxSubarray(int[] arr) {
        int maxSum = arr[0];
        int currentSum = arr[0];

        int start = 0, end = 0, tempStart = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > currentSum + arr[i]) {
                currentSum = arr[i];
                tempStart = i;
            } else {
                currentSum += arr[i];
            }

            if (currentSum > maxSum) {
                maxSum = currentSum;
                start = tempStart;
                end = i;
            }
        }

        
        System.out.println("Largest subarray sum: " + maxSum);
        System.out.print("Subarray: [ ");
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
    }
}
