public class Types {

    /*

    Primitive data types:
        int - integers 32b whole numbers
        long - 64b whole numbers
        double - decimal number 64b
        float - decimal number 32b

     */


    public static void overview(){

        int grade = 6;
        System.out.println( grade );

        grade = 9;
        System.out.println( grade );

        grade = grade - 2;
        System.out.println( grade );

        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        System.out.println("Max is: "+max);     // ctrl + d
        System.out.println("Min is: "+min);     // ctrl + d
        System.out.println("Max - 2 is: " + (max-2) );
        System.out.println("Max + 1 is: " + (max+1) );
    }

}
