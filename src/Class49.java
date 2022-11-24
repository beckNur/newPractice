import java.util.*;

public class Class49 {

     public static void main(String[] args) {

         String str = "aaabbbcccdddhhheekkkfff";
         Set<Character> set1 = new HashSet<>();
         for (int i = 0; i < str.length(); i++) {
                 set1.add(str.charAt(i));
         }

         Set set2 = new TreeSet<>(set1);
         Iterator iterator = set2.iterator();
         String newStr="";
         while (iterator.hasNext()){
             newStr+=iterator.next();


         }
         System.out.println(newStr);

     }


}
