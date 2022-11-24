import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Class50_4 {

     public static void main(String[] args) {
          List<Map> listOfMaps = new ArrayList<>();
          for (int i = 0; i <10 ; i++) {
               listOfMaps.add(new LinkedHashMap());
               listOfMaps.get(i).put(i, i+5);

          }
          System.out.println(listOfMaps);
     }



}
