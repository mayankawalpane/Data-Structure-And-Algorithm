import java.util.*;

public class Search_in_Rotated_Sorted_Array {

    public static void main(String[] args) {

        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;

        int flag = -1;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target) {
                flag = i;
                break;
            }
        }

        System.out.println(flag);
    }
}
