import java.util.*;
import java.util.Arrays;
import java.util.HashSet;

public class MostWater {
    public static void main(String[] args) {
        
  int height[]={1,8,6,2,5,4,8,3,7};


  int maxArea = 0;
for (int i = 0; i < height.length; i++) {
    for (int j = i + 1; j < height.length; j++) {
        int area = (j - i) * Math.min(height[i], height[j]);
        maxArea = Math.max(maxArea, area);
    }
}

System.out.println(maxArea);

        
}
    
}
