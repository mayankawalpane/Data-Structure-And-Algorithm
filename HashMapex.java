import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.HashSet;

public class HashMapex {

    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();  // yaha Hashset define Kia Hai

        map.put(20, "Om");   // data enter Kia hai 
        map.put(22, "Jay");
        map.put(30, "Raj");

        System.out.println(map);         

        map.put(31, "Om");       // update ya add kia hai 
        System.out.println(map);

        if (map.containsKey(30)) {               // check kia hai element exist karta hai ya nhi 
            System.out.println("True");
        } else {
            System.out.println("False");
        }


        System.out.println(map.get(30));      // key se value get key hai 


           for(Map.Entry<Integer,String> en: map.entrySet()){
               System.out.print(en.getKey() +"=>"+ en.getValue()+ " ");   /// loop to print key and values 
            //    System.out.println(en.getValue());
           }

    }

}
