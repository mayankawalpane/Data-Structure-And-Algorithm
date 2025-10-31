import java.util.*;

public class Medium {
    public static void main(String[] args) {

        int nums1[] = {1,2};
        int nums2[] = {3, 4};

        ArrayList<Float> hs = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            hs.add((float) nums1[i]);
        }

        for (int j = 0; j < nums2.length; j++) {
            hs.add((float) nums2[j]);
        }

        Collections.sort(hs);

        int n = hs.size();
        float median;

        if (n % 2 != 0) {
            median = hs.get(n / 2);
        } else {
            median = (hs.get(n / 2 - 1) + hs.get(n / 2)) / 2;
        }

        System.out.println( median);
    }
}
