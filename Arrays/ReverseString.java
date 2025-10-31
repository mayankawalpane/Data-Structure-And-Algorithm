
import java.util.*;

public class ReverseString {


     public static String reverseString(String s) {


        StringBuilder sb=new StringBuilder();

        sb.append(s);

        sb.reverse();

        return sb.toString();
     } 



     public static void main(String[] args) {
        

        String s= "Mayank";

        System.out.println(reverseString(s));
     }
}
