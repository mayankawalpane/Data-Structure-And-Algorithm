
import java.util.*;

public class NotebookCounting {


    public static void main(String[] args) {
        

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter No of Books: ");

          int a = sc.nextInt();
          System.out.println("Enter No of Lines: ");
          int b = sc.nextInt();


          System.out.println("total no of line is "+ a*b*100);

          sc.close();

    }
    
}
