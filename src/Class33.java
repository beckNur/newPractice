 public class Class33 {

    int studentAge;
    Class33(int studentAge){
        this.studentAge=studentAge;
    }



    public static void main(String[] args) {

        Class33 [] students = new Class33[70];
        for (int i = 0; i < students.length; i++) {
            int randomAge = 22+(int)(Math.random()*68);
            students[i] = new Class33(randomAge);
        }
        for(Class33 age: students){
            System.out.println(age.studentAge);
        }








    }
}
