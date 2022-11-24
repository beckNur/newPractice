import java.io.PrintWriter;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class Class54 {

     public static void main(String[] args) throws Exception {

          URL url = new URL("https://sherlock-holm.es/stories/plain-text/advs.txt");
          PrintWriter pw = new PrintWriter("readText.txt");
          Scanner sc = new Scanner(url.openStream());
          while (sc.hasNext()){
               pw.print(sc.nextLine());
//               System.out.println(sc.nextLine());
          }

     }



}
