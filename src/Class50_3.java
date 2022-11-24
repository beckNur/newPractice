import java.util.*;

public class Class50_3 {

     public static void main(String[] args) {
          String text2 = "id\tfirst_name\tlast_name\temail\tgender\tip_address\n" +
                  "1\tHomer\tMeininger\thmeininger0@google.cn\tMale\t210.141.70.125\n" +
                  "2\tLeese\tMabbs\tlmabbs1@washingtonpost.com\tFemale\t241.91.113.110\n" +
                  "3\tCyndy\tBlenkin\tcblenkin2@hp.com\tFemale\t87.77.126.27\n" +
                  "4\tAnna-diane\tFragino\tafragino3@tuttocitta.it\tFemale\t108.62.47.22\n" +
                  "5\tLauren\tTellwright\tltellwright4@blog.com\tMale\t124.109.102.7\n" +
                  "6\tHercules\tFerbrache\thferbrache5@so-net.ne.jp\tMale\t34.176.222.168\n" +
                  "7\tKanya\tLeitch\tkleitch6@tripod.com\tBigender\t194.15.181.187\n" +
                  "8\tSophronia\tLeicester\tsleicester7@linkedin.com\tFemale\t10.210.91.20\n" +
                  "9\tThom\tBorless\ttborless8@google.es\tMale\t103.114.45.83\n" +
                  "10\tKaroly\tTremblot\tktremblot9@home.pl\tMale\t17.35.176.68\n";
          Class50_2 listClass = new Class50_2();
          List<List> list = listClass.returnListOfLists(text2);
          List tableHeader = list.get(0);
          System.out.println(tableHeader);
          List<Map<String, String>> listOfMaps = new ArrayList<>();
          Map row = new LinkedHashMap();
          for (int i = 1; i < list.size(); i++) {

               for (int j = 0; j < list.get(i).size(); j++) {
                    listOfMaps.get(i).put((String) tableHeader.get(j), (String) list.get(i).get(j));
               }
               listOfMaps.add(row);


          }





     }


}
