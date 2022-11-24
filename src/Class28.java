public class Class28 {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3}, {4,5,6}, {1,0,1}};
        int sumOfMinRow = 0;
        int minRowIndex = 0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j <arr[i].length ; j++) {

                sumOfMinRow += arr[i][j];

            }
            System.out.println(sumOfMinRow);

        }


    }
}
