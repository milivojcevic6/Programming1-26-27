public class Main {
    static void main(String[] args) {
        // STRINGS - "some text"
        String s = "Hello World!";
        String s1 = new String("Text");
        String s2 = new String(new char []{'a','b','c'});

        // print a string
        //System.out.println(s);
//        System.out.println(s1);
//        System.out.println(s2);

        // string concatenation
        // "hello" + " world" = "hello world"
//        String s3 = s1 + s2;
//        System.out.println("hello " + "world");
//        System.out.println(s3);
//        String s4 = s1.concat(s2);
//        System.out.println(s4);
//
//        System.out.println("Hello " + 1 + true + 2.9 + null);
//        System.out.println("Hello ".concat(null)); // null exception

        // access characters by index
//        System.out.println("Char at index 4 of s: " + s.charAt(4));
//        System.out.println("Length of string: " + s.length());
//        System.out.println("Last valid index: " + (s.length() - 1));
//        System.out.println("Invalid index: " + (s.charAt(s.length()))); // index out of bounds

//        char [] chars = s.toCharArray();
//
//        for (int i = 0; i < chars.length; i++) {
//            System.out.println(chars[i]);
//        }

//        for (int i = 0; i < s.length(); i++) {
//            System.out.println(s.charAt(i));
//        }

        // comparing 2 strings
        String first = "test";
        String second = "test";
        String third = new String("test");
        String fourth = new String("test");

//        System.out.println("first == second: " + (first == second));
//        System.out.println("first == third: " + (first == third));
//
//        System.out.println("first.equals(second): " + first.equals(second));
//        System.out.println("first.equals(third): " + first.equals(third));

//        StringsHelper.palindrome("racecar");
//        StringsHelper.palindrome("kayak");
//        StringsHelper.palindrome("anavOliMiLovaNa");
//        StringsHelper.palindrome("programming");
//        StringsHelper.palindrome("palindrome");

//        System.out.println("Reverse of string Java: "
//                + StringsHelper.reverseString("Java"));

//        StringsHelper.palindromeUsingReverse("racecar");
//        StringsHelper.palindromeUsingReverse("kayak");
//        StringsHelper.palindromeUsingReverse("anavOliMiLovaNa");
//        StringsHelper.palindromeUsingReverse("programming");
//        StringsHelper.palindromeUsingReverse("palindrome");


//        System.out.println("Replacing char a with o in word Java: " +
//                StringsHelper.replaceChar("Java",'a','o'));

        String sentence = "I love basketball and I love movies!";
        // replace love with hate
//        System.out.println(StringsHelper.replaceWord(sentence,"love","hate"));

//        System.out.println("Substring (1,3) of stentence: " + sentence.substring(1,3));
//        // length is always end-start(3-1=2)
//        //[1,3)
//        System.out.println("First index of letter I: " + sentence.indexOf('I'));
//        System.out.println("Last index of letter I: " + sentence.lastIndexOf('I'));
//        System.out.println("First index of letter Z: " + sentence.indexOf('Z'));
//
//        System.out.println("Sentence contains 'programming': "+ sentence.contains("programming"));
//        System.out.println("Sentence contains 'love': " + sentence.contains("love"));

        StringsHelper.emailParser("bogdan@gmail.com");
        System.out.println();
        StringsHelper.emailParser("bogdan.sinik@famnit.upr.si");
        System.out.println();
        StringsHelper.emailParser("89213994@student.upr.si");
    }
}
