import java.util.*;


public class SingleNumber {

    public static void main(String[] args) {
        
     int nums[] ={2,2,1,5,5,4,4};


     for(int i=0;i<nums.length;i++){

        for(int j=1;j<nums.length;j++){

            if(nums[i]==nums[j]){
                return ;
            }else{

                   System.out.println(nums[i]);
            }
        }

     }


    }

    
}