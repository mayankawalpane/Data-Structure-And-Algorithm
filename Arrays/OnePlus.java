import java.util.*;

public class OnePlus {

    public static void main(String[] args) {

        int arr[] = { 9 };
        int result = 0;
        for (int i : arr) {
            result = result * 10 + i;
            System.out.println(result+1);
        }
        
       
        result = result + 1;
        // System.out.println("Result + 1: " + result);

        char[] newarr = Integer.toString(result).toCharArray();
        System.out.println(newarr);
    }
     

           

}

public class HelloWorld {
    public static void main(String[] args) {
        // Prints "Hello, World!" to the terminal window.
        System.out.println("Hello, World!");
    }
}