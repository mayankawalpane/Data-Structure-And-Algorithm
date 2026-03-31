package NeetCode_150;

import java.util.Arrays;
import java.util.HashSet;

public class Longest_Consecutive_Sequence {
    public static void main(String[] args) {

        int arr[] = { 1,4,8,9,11,10,2,1 };
        int n = arr.length;

        Arrays.sort(arr);

        int len = 1;
        int curLen = 1;
        for (int i = 0; i < n -1; i++) {
            if(arr[i] == arr[i+1]) continue;
            if (arr[i] + 1 == arr[i + 1]) {
                curLen++;
            } else {
                curLen = 1;
            }
            len = Math.max(len, curLen);
        }

        System.out.println("Length = " + len);
    }

}
