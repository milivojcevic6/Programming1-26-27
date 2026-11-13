public class Main {
    static void main(String[] args) {
        String s = "Hello world!";
        String s1 = new String("new string");
        String s3 = new String(new char[] {'a','b','c'});

//        System.out.println(s3);

//        System.out.println(s + 7 + true + null);
        //System.out.println(s1);
        // concatination = connecting 2 or more strings
        // we can use +
        // .concat() exists
        String s2 = s.concat(s1); // same as s + s1
//        System.out.println(s2);

        //s[1]; // [] are only for arrays in Java!!!
        // get character at some index
//        System.out.println("String s: " + s);
//        System.out.println("Character at index 2: " + s.charAt(2));
//        System.out.println("Length of a string: " + s.length());
////        System.out.println("Print char at index s.length(): " + s.charAt(s.length())); // out of bounds exception
//        System.out.println("Last valid index is s.length() - 1: " + s.charAt(s.length() - 1));

        // String by default is an object and immutable
        // we can easily transform it to array of characters

//        char [] charArrayFromString = s.toCharArray(); // "text" -> {'t','e','x','t'}
//
//
//        for (int i = 0; i < charArrayFromString.length; i++) {
//            System.out.print(charArrayFromString[i]);
//        }
//        System.out.println();
//
//        String stringFromCharArray = String.valueOf(charArrayFromString);
//        String stringFromCharArray2 = new String(charArrayFromString);
//
//        System.out.println(stringFromCharArray);
//        System.out.println(stringFromCharArray2);

        // traverse a string
        // transform to char array and go through

//        for (int i = 0; i < s.length(); i++) {
//            System.out.println(s.charAt(i));
//        }

        String first = new String("test");
        String second = new String("test");
        String third = "test";
        String fourth = "test";

//        System.out.println("first == second: " + (first == second));
//        System.out.println("third == fourth: " + (third == fourth));
//        System.out.println("first.equals(second): " + (first.equals(second)));
//        System.out.println("third.equals(fourth): " + (third.equals(fourth)));
        // ALWAYS USE .equals

//        StringsHelper.palindrome("AnAvolimilOvana");
//        StringsHelper.palindrome("racecar");
//        StringsHelper.palindrome("programming");


       // System.out.println(StringsHelper.reverseString("Bogdan"));

//        StringsHelper.palindromeWithReverse("racecar");
//        StringsHelper.palindromeWithReverse("kayak");
//        StringsHelper.palindromeWithReverse("java");

//        System.out.println("Replace a in anavolimilovana with $: "
//                + StringsHelper.replaceCharacters("anavolimilovana", 'a', '$'));

        //System.out.println("anavolimilovana".replace('a', '$'));

//        String test = "I love basketball and I love food!";
//        System.out.println(StringsHelper.replaceWord(test, "love", "hate"));

//        System.out.println("Substring (1,3) of programming: " + "programming".substring(1,3));
//        // length is always end - start (3-1 = 2)
//        System.out.println("First index where 'o' appears in String okno: " + "okno".indexOf('o'));
//        System.out.println("Last index where 'o' appears in String okno: " + "okno".lastIndexOf('o'));
//        System.out.println("First index where 'z' appears in String okno: " + "okno".lastIndexOf('z'));
//        String sentence = "Java programming is fun!";
//
//        System.out.println("Contains programming: " + sentence.contains("programming"));
//        System.out.println("Contains Python: " + sentence.contains("Python"));

        StringsHelper.email("bogdan@gmail.com");
        System.out.println();
        StringsHelper.email("bogdan.sinik@famnit.upr.si");
        System.out.println();
        StringsHelper.email("89203013@student.upr.si");


    }
}
