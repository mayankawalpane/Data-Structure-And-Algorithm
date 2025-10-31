import java .util.*;

public class Profits {
    
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);

    System.out.println("Enter No of Customer ");
    int a= sc.nextInt();

    System.out.println("Enter Cost of Juice ");
    int b= sc.nextInt();


    int c= b-a;

    if(c<0){
        System.out.println("Loss");
    }else{

        System.out.println(c);
    }

}

}
