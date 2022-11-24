import java.util.*;

public class Class50_1 {

     public static void main(String[] args) {
         String[] text = {"beck","why","and","chembula","and","why"};
         Set<String> set = new TreeSet<>(Arrays.asList(text));
         System.out.println(set);
         Iterator<String> iterator = set.iterator();
         Map<String, Integer> map1= new HashMap<>();
         while (iterator.hasNext()){
             String str = iterator.next();
             int value = 0;
             if(!str.equals(iterator.next())){
                 map1.put(str, 1);
             }else{
                 map1.put(str, ++value );
             }
         }
         System.out.println(map1);


     }


}
