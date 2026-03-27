package NeetCode_150;

import java.util.*;

class Contain_Duplicate {

    public static boolean hashDuplicate(int[] arr) {

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            if (!set.add(arr[i])) {
                return true;
            }

        }

        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 3, 4, 4, 5 };

        System.out.println(hashDuplicate(arr));

    }

}