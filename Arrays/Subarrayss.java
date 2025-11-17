import java.util.*;


public class Subarrayss {

    public static void main(String[] args) {
        int arr[]={1,1,1,1,2,2,3};

        HashSet<Integer> hs= new HashSet<>();

        Arrays.sort(arr);

        for(int i=0;i<arr.length;i++){
            hs.add(arr[i]);
        }
        System.out.println(hs.size());
        System.out.println(hs);
        
    }
    
}
