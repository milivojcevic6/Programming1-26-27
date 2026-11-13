public class Main {
    static void main(String[] args) {
        // STRINGS - "some text"
        String s = "Hello world!";
//        String s1; // declaration
//        s1 = new String("Hello!");
//        String s2 = new String(new char[] {'a','b','c'});
//
//        System.out.println(s);
//        System.out.println(s1);
//        System.out.println(s2);
//
//        // concatenation - "some " "text" -> "some text"
//        String s3 = s1 + s2; // one way
//        System.out.println(s3);
//        String s4 = s.concat(s3); // another way
//        System.out.println(s4);
//
////        System.out.println(s.concat(null));
//        System.out.println(s + null + true + 1 + 2.4+ 'c');

//        System.out.println("Character at index 2: " + s.charAt(2) ); //  s[2] not allowed [] only for arrays
//        System.out.println("Length of string: " + s.length());
//        //System.out.println("Char at s.length(): " + s.charAt(s.length())); // out of bounds error
//        System.out.println("Last valid index: " + (s.length() - 1));

        // in java String is immutable object not char array
        // but can be transformed to one easily

//        char [] chars = s.toCharArray(); // "text" -> {'t','e','x','t'}
//        String stringFromCharArray = new String(chars);//String.valueOf(chars);

        // traversing the string
//        for (int i = 0; i < chars.length; i++) {
//            System.out.println(chars[i]);
//        }
//
//
//        for (int i = 0; i < s.length(); i++) {
//            System.out.println(s.charAt(i));
//        }

//        String first = "text";
//        String second = "text";
//        String third = new String("text");
//        String fourth = new String("text");

//        System.out.println("first == second: " + (first ==second));
//        System.out.println("first == third: " + (first ==third));
//        System.out.println("first == fourth: " + (first ==fourth));
//        System.out.println("third == fourth: " + (third ==fourth));
//
//        System.out.println("first.equals(second): " + first.equals(second));
//        System.out.println("first.equals(third): " + first.equals(third));
//        System.out.println("first.equals(fourth): " + first.equals(fourth));
//        System.out.println("third.equals(fourth): " + third.equals(fourth));
        // never use == with string

//        StringsHelper.palindrome("racecar");
//        StringsHelper.palindrome("anavolimilovana");
//        StringsHelper.palindrome("kayak");
//        StringsHelper.palindrome("programming");

//        System.out.println(StringsHelper.reverseString(s));

//        StringsHelper.palindromeUsingReverse("racecar");
//        StringsHelper.palindromeUsingReverse("anavolimilovana");
//        StringsHelper.palindromeUsingReverse("kayak");
//        StringsHelper.palindromeUsingReverse("programming");

//        System.out.println("Replace a in Java is fun thing with $: "
//                + StringsHelper.replaceCharacter("Java is fun thing",'a','$'));
//        System.out.println("Replace a in Java is fun thing with $: "
//                + "Java is fun thing".replace('a','$')); // built in method
//        String sentence = "I love basketball and I love good music!";
//        System.out.println("I love basketball and I love good music! " +
//                        "REPLACE love WITH hate: " +
//                        StringsHelper.replaceWord(sentence,"love","hate")
//                );

        // few more useful methods

//        System.out.println("First index of a in word Java: " + "Java".indexOf('a'));
//        System.out.println("Last index of a in word Java: " + "Java".lastIndexOf('a'));
//        System.out.println("First index of z in word Java: " + "Java".lastIndexOf('z'));
//        System.out.println("Substring (1,3) of programming: " + "programming".substring(1,3));
//        // length of substring is always end-start (3-1=2)
//        String s12 = "Java is really fun language!";
//        System.out.println("s12 contains fun? " + s12.contains("fun"));
//        System.out.println("s12 contains Python? " + s12.contains("Python"));

        StringsHelper.emailParser("bogdan@gmail.com");
        System.out.println();
        StringsHelper.emailParser("bogdan.sinik@famnit.upr.si");
        System.out.println();
        StringsHelper.emailParser("8926123@student.upr.si");

        
    }
}
