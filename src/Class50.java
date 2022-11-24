import java.util.*;

public class Class50 {

     public static void main(String[] args) {
         String[] text = {"beck","why","and","chembula","and","wy"};
         Set<String> set = new HashSet<>(Arrays.asList(text));
         Iterator<String> iterator = set.iterator();
         Map<String, Integer> map1= new HashMap<>();
         for (String str: set) {
             map1.put(str, str.length());
         }
         System.out.println(map1);


     }


}
