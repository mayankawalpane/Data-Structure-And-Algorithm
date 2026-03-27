package NeetCode_150;

import java.util.*;

public class Top_K_Elements { 

    public static void main(String[] args) {


        int num[] = {1,2,2,3,3,3};
        int k=2;

        HashMap<Integer, Integer> map= new HashMap<>();

        for( int val: num){
            map.put(val ,map.getOrDefault(num,0)+1);
        }
        
       ArrayList<Integer> list= new ArrayList<>(map.keySet());

       Collections.sort(list, Collections.reverseOrder());
               
       System.out.println(list);

         int[] result = new int[k];
       for(int i=0; i<k; i++){
       result[i]=list.get(i);

       }

       
       System.out.println(list);
          

           
    }

}
