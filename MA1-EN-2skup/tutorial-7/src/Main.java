public class Main {
    public static void main(String[] args) {
        // Strings - any kind of text e.g. "text!!!"
        String s = "Hello World!";
        String s1 = new String("Hi!"); // new object is created for sure
        String s2 = new String(new char[] {'a','b','c'});

        // print String
        int [] arr = new int[4];
//        System.out.println(arr);
//
        System.out.println(s);
        // concatenation - putting more strings together
        String s3 = "My" + " name " + "is";
//        System.out.println(s3);
//        System.out.println(s3.concat(" Bogdan"));
//        System.out.println("Hello " + 5 + false + null + " !");
        //System.out.println("Hello".concat(null));
        // .concat() does not work with null (only with strings)

        System.out.println("length of a string: " + s.length());

        System.out.println("Print character at index 4: " + s.charAt(4)); // s[4] only works with arrays

        arr[1] = 34; // since arrays are mutable (we can change in place)
        //s.charAt(3) = 's'; cant do this because Strings are immutable
        System.out.println("Last valid index: " + (s.length() - 1));
        //System.out.println("Access invalid index: " + s.charAt(s.length())); // index out of bounds


        // transform to char array
        char [] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
            chars[i] = '$';
        }

        System.out.println(new String(chars));

        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i)); // but we cant update charAt(i)
        }

        // comparing 2 strings
        String first  = "test";
        String second  = "test";
        String third  = new String("test");

        // == compares the reference in the memory not string letter by letter
//        System.out.println("first == second: " + (first == second)); // true
//        System.out.println("first == third: " + (first == third)); // false
//
//        // equals compares letter by letter (content of the string)
//        System.out.println("first.equals(second): " + (first.equals(second))); // true
//        System.out.println("first.equals(third): " + (first.equals(third))); // true

//        System.out.println();
//        StringsHelper.palindrome("anAvOlimilovana");
//        StringsHelper.palindrome("RaCecar");
//        StringsHelper.palindrome("programming");
//        StringsHelper.palindrome("palindrome");

//        System.out.println("Reverse of Java: " + StringsHelper.reverseString("Java"));
//
//        System.out.println();
//        StringsHelper.palindromeFromReverse("anAvOlimilovana");
//        StringsHelper.palindromeFromReverse("RaCecar");
//        StringsHelper.palindromeFromReverse("programming");
//        StringsHelper.palindromeFromReverse("palindrome");
//        String sentence = "I love Java and I love Analysis";
//        System.out.println("Replace a in Java with b: " + StringsHelper.replaceCharacter("Java", 'a','b'));
//        System.out.println("Replace a in Java with b: " + "Java".replace('a','b'));
//        System.out.println("Replace love in "+sentence+
//                " with hate: " +
//                StringsHelper.replaceWord(sentence,"love","hate"));
//
//        System.out.println("Find substring (1,3) of programming: " +
//                "programming".substring(1,3)); // len is always end - start (3-1 = 2)
//        System.out.println("First index of a in Java: " + "Java".indexOf('a'));
//        System.out.println("Last index of a in Java: " + "Java".lastIndexOf('a'));
//        System.out.println("First index of z in Java: " + "Java".lastIndexOf('z'));
//        System.out.println("Contains? love" + sentence.contains("love"));
//        System.out.println("Contains? hate" + sentence.contains("hate"));

        System.out.println();
        StringsHelper.emailParser("bogdan@gmail.com");
        System.out.println();
        StringsHelper.emailParser("bogdan.sinik@famnit.upr.si");
        System.out.println();
        StringsHelper.emailParser("89261123@student.upr.si");


    }
}
