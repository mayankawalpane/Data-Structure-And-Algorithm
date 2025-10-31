import java.util.*;

public class RemoveDuplicate {
    public static void main(String[] args) {
        
        int arr[] = {0,0,1,1,1,2,2,3,3,4};

        
        Set<Integer> num = new LinkedHashSet<>();
             

        for(int i=0 ;i<arr.length;i++){

            num.add(arr[i]);


        }

        System.out.println(num);
    }
}
 