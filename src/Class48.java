import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Class48 {

     public static void main(String[] args) {
         Object[][] objArr = {{"STRING", "1", '4'},{"3", "NUM", '2'},{"26", '8',"WIFE"} };

         System.out.println(returnListOfList(objArr));

         }
         static List<List<Object>> returnListOfList(Object[][] objArr){
             List<List<Object>> listObj = new ArrayList<>();
             for (int i = 0; i <objArr.length ; i++) {
                 listObj.add(new ArrayList<>());
             }

             for (int i = 0; i <objArr.length ; i++) {
                 for (int j = 0; j < objArr[i].length; j++) {
                     listObj.get(i).add(objArr[i][j]);

                 }

             }

         return listObj;
         }
     }
