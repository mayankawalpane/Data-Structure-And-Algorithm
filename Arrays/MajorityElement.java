
import java.util.*;

public class MajorityElement {

    public static void main(String[] args) {

        int nums[] = { 2, 2, 1, 1, 1, 2, 2 };

        int morenum = nums[0];
        
        int morecount = 0;

        for (int i = 0; i < nums.length; i++) {
            int count=0;


            for (int j = 0; j < nums.length; j++) {

                if (nums[i] == nums[j]) {
                
                count++;

            }
             }
             if(count > morecount){
                morecount=count;
                count= nums[i];
             }

             System.out.println("The Most Repeat Number is"+ morenum);

        }

    }

}
