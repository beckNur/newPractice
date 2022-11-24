 public class Class37 {

     public static void main(String[] args) {

         reverseStr("bekzod");

    }

    public static void reverseStr(String str){
         str = new StringBuilder(str).reverse().toString();
        System.out.println(str);
    }
}
