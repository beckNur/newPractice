import java.util.ArrayList;
import java.util.Arrays;

public class Class46 {

     public static void main(String[] args) {
         reverseArrString(new ArrayList<>());






     }
    static ArrayList<String> reverseArrString(ArrayList<String> arrString){
        arrString = new ArrayList<>();
        arrString.add("java");
        arrString.add("beck");
        arrString.add("cap");


        for (int i = 0; i < arrString.size(); i++) {
            String str = "";
            String reverse = "";
            str=arrString.get(i);
            for (int b =str.length(), j=1; b >=j; j++) {
                reverse +=str.charAt(b-j);

            }
            arrString.set(i, reverse.toUpperCase());

        }

        System.out.println(arrString);


         return arrString;
    }


}
