package LinkList;
import java.util.Collections;
import java.util.LinkedList;



public class Sort_List {

    public static void main(String[] args) {
        
        
        LinkedList<Integer> a = new LinkedList<>();
        
        
        a.add(20);
        a.add(40);
        a.add(10);
        a.add(30);

        Collections.sort(a);
        
        System.out.println(a);

        
    }
}
