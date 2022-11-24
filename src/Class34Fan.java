 public class Class34Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    static int noOffFans = 0;
    int speed = SLOW;
    boolean isOn = false;
    double radius = 5;
    String color = "blue";
    String manifacturer = "WhirlWind";
    String productId = "xxx";

    public Class34Fan(){
        noOffFans++;
        productId = generateProduct();
    }
     public Class34Fan(int speed, double radius, String color, boolean isOn){
        this.speed = speed;
        this.radius = radius;
        this.color = color;
        this.isOn = isOn;
        noOffFans++;
        productId = generateProduct();
     }

     public static String generateProduct(){
         String id=""+1000+(int)(Math.random()*1000);
        return id;
     }

     int getNoOffFansCreated(){
        return noOffFans;
     }

     @Override
     public String toString() {
         return "Class34Fan{" +
                 "speed=" + speed +
                 ", isOn=" + isOn +
                 ", radius=" + radius +
                 ", color='" + color + '\'' +
                 ", manifacturer='" + manifacturer + '\'' +
                 ", productId='" + productId + '\'' +
                 '}';
     }

     public static void main(String[] args) {

         Class34Fan [] arrFan = new Class34Fan[3];
         arrFan[0] = new Class34Fan(1, 6, "red", true);
         System.out.println(arrFan[0].toString() + "Number of Fans: "+arrFan[0].getNoOffFansCreated());
         arrFan[1] = new Class34Fan(2, 9, "green", true);
         System.out.println(arrFan[1].toString() + "Number of Fans: "+arrFan[1].getNoOffFansCreated());
         arrFan[2] = new Class34Fan();
         System.out.println(arrFan[2].toString() + "Number of Fans: "+arrFan[2].getNoOffFansCreated());


    }
}
