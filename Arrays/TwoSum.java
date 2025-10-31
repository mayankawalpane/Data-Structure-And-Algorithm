import java.util.*;

public class TwoSum {

    public static void main(String[] args) {

        int arr[] = { 2, 5, 5, 11 };
        int target = 10;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] + arr[j] == target) {
                    System.out.println("Indices: " + i + " and " + j);
                    System.out.println("Values: " + arr[i] + " + " + arr[j] + " = " + target);
                }
            }
        }
    }
}
