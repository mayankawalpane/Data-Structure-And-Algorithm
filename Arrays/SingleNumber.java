
import java.util.*;

public class SingleNumber {

    public static void main(String[] args) {

        int nums[] = { 2, 2, 1, 5, 5, 4, 4 };

        for (int i = 0; i < nums.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < nums.length; j++) {

                if (i != j && nums[i] == nums[j]) {

                    isUnique = false;
                    break;

                }

            }
            if (isUnique) {
                System.out.println(nums[i]);
                break;
            }
        }

    }

}