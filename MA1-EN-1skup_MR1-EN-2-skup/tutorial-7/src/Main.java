public class Main {
    static void main(String[] args) {
        // Strings - any text
        String s = "Hello world!";
//        String s1 = new String("Whatever");
//        String s2 = new String(new char [] {'a','b','c'});
//
//        System.out.println(s);
//        System.out.println(s1);
//        System.out.println(s2);

        System.out.println("Character at index 3 in string " + s + ": " + s.charAt(3));
        //System.out.println("Character at index 3 in string " + s + ": " + s[3]);
        // [] only reserved for arrays in Java and String is not array in java

        System.out.println("Length of the string: " + s.length());
        System.out.println("Last valid index: " + (s.length() - 1));
        //System.out.println("Last valid index: " + (s.charAt(s.length())));//out of bounds

        // string concatenation
        String s3 = "Hello" + " World";
        System.out.println(s3);
        System.out.println(s.concat("!!!!!!"));
        //System.out.println("Text" + 7 + false + null);

//        for (int i = 0; i < s.length(); i++) {
//            System.out.println(s.charAt(i));
//        }

//        char [] chars = s.toCharArray(); // "text" -> {'t','e','x','t'}
//
//        for (int i = 0; i < chars.length; i++){
//            System.out.println(chars[i]);
//        }

        String first = "test";
        String second = "test";
        String third = new String("test");

        System.out.println("first == second: " + (first == second));
        System.out.println("first == third: " + (first == third));
        System.out.println("first.equals(second): " + first.equals(second));
        System.out.println("first.equals(third): " + first.equals(third));
        // never use == with strings!!!!

        StringsHelper.palindrome("raCecar");
        StringsHelper.palindrome("kayAk");
        StringsHelper.palindrome("Java");

        System.out.println(StringsHelper.reverseString("tail"));
        StringsHelper.palindromeUsingReverse("kayak");
        StringsHelper.palindromeUsingReverse("racecar");
        StringsHelper.palindromeUsingReverse("Java");


        System.out.println(StringsHelper.replaceChar("Java",'a','b'));
        System.out.println(StringsHelper.replaceChar("aava",'a','b'));
        System.out.println(StringsHelper.replaceChar("aaaaaaa",'a','b'));


        String sentence = "I like pizza and I like sushi I like movies!";
        System.out.println(StringsHelper.replaceWord(sentence,"like","enjoy"));

        System.out.println("First index of e in sentence: " + sentence.indexOf('e'));
        System.out.println("Last index of e in sentence: " + sentence.lastIndexOf('e'));
        System.out.println("Last index of ? in sentence: " + sentence.lastIndexOf('?'));

        System.out.println("Substring (1,3) for tail: " + "tail".substring(1,3));
        // chars [1,3) length 3-1=2

        System.out.println("Contains like? " + sentence.contains("like"));
        System.out.println("Contains hate? " + sentence.contains("hate"));

        StringsHelper.emailParser("bogdan@gmail.com");
        System.out.println();
        StringsHelper.emailParser("bogdan.sinik@famnit.upr.si");
        System.out.println();
        StringsHelper.emailParser("89261123@student.upr.si");

    }
}
