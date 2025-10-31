
import java.util.*;

public class Union {

    public static void main(String[] args) {
        
int a[]={1, 2, 1, 1, 2};
    int b[]={2, 2, 1, 2, 1};
    
HashSet<Integer> result= new HashSet<>();
for(int  i=0;i< a.length;i++){
      result.add(a[i]);
}
    for(int j=0;j<b.length;j++){
        result.add(b[j]);

    
    }
ArrayList<Integer> x= new ArrayList<>(result);

System.out.println(x);
}
}