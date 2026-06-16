package NeetCode_150;

import java.util.Arrays;

public class Top_Integer {

    public static void main(String[] args) {

        int arr[]= {1,2,3,4};
        int target = 3;

        for( int i =  0; i<arr.length;i++){

             for(int j=i+1;j<arr.length; j++){
                if(arr[i]+arr[j]==target){
                    System.out.println(arr[i] +" "+ arr[j]);
                      int[] result = {arr[i], arr[j]};
                      
                      System.out.println(Arrays.toString(result));
                    }
                    
                    
                }
        }
    }
    
}
