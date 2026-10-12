public class Types {


    /*

    Primitive data types:

    int - integer, whole numbers            32b
    long - long, whole numbers              64b
    float - decimal numbers                 32b
    doubles - decimal number                64b

     */

    public static void overview(){

        int grade = 6;
        System.out.println("grade: "+grade);
        grade = 9;
        System.out.println("grade: "+grade);
        grade = grade - 2;
        System.out.println("grade: "+grade);

        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;

        System.out.println("Min value is: " + min);
        System.out.println("Max value is: " + max);     // ctrl + d
        System.out.println("Max + 1 value is: " + (max+1) );


    }



}
