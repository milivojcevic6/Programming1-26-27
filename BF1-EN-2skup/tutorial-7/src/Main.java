public class Main {
    public static void main(String[] args) {
        // STRINGS - "text"
        String s = "Hello World!";
        String s1 = new String("Hi!");
        char [] cArr = {'a','b','c'};
        String s2 = new String(cArr);


        int [] arr = {1,2,3};
        // printing strings
//        System.out.println(arr);

//        System.out.println(s);
//        System.out.println(s1);
//        System.out.println(s2);

        //String concatenation = "my name" " is Bogdan" -> "my name is Bogdan"
        String name = "Bogdan";
//        System.out.println("Hello "+ name); // we can use +
//        System.out.println("Hello ".concat(name));
//        System.out.println("Hello " + 5 + true + null);
        //System.out.println("Hello ".concat(6)); // works only with strings

        // Accessing elements using index
//        System.out.println("Print char at index 4: " + s.charAt(4)); // s[4] will not work. in java [] only works with arrays
//        System.out.println("Length of a string: " + s.length());
//        System.out.println("Last legal index in string s: " + (s.length()-1));
        //System.out.println("If we try to access invalid index: " + s.charAt(s.length())); // index out of bounds

        // we can easily transform string to char array and vise versa
//        char [] chars = s.toCharArray(); // "text" -> {'t','e','x','t'}
//
//        for (int i = 0; i < chars.length; i++) {
//            System.out.println(chars[i]);
//            chars[i] = '#';
//        }
//
//        System.out.println(chars);
//        String newString = String.valueOf(chars); //new String(chars);
//
//        for (int i = 0; i < s.length(); i++) {
//            System.out.println(s.charAt(i));
//            //s.charAt(i) = '#'; // cant do this
//        }

        // comparing 2 Strings
        String first = "Java";
        String second = "Java";
        String third = new String("Java");

//        System.out.println("first == second: " + (first == second));
//        System.out.println("first == third: " + (first == third));
//        System.out.println("first.equals(second): " + (first.equals(second)));
//        System.out.println("first.equals(third): " + (first.equals(third)));

        StringsHelper.palindrome("racecaR");
        StringsHelper.palindrome("kayak");
        StringsHelper.palindrome("anavolimilovana");
        StringsHelper.palindrome("programming");
        StringsHelper.palindrome("palindrome");

        System.out.println();
        System.out.println("Reverse of Java: " + StringsHelper.reverseString("Java"));

        System.out.println();
        StringsHelper.palindromeUsingReverse("racecaR");
        StringsHelper.palindromeUsingReverse("kayak");
        StringsHelper.palindromeUsingReverse("anavolimilovana");
        StringsHelper.palindromeUsingReverse("programming");
        StringsHelper.palindromeUsingReverse("palindrome");

        System.out.println("Replace a in Java with b: " +
                StringsHelper.replaceCharacter("Java",'a','b'));

        System.out.println("Replace a in Java with b: " +
                "Java".replace('a','b'));

        String sentence = "I love Java and I love Analysis!";

        System.out.println("Replace love with hate in " + sentence + ": \n" +
                StringsHelper.replaceWord(sentence,"love","hate"));

        System.out.println("Print substring (1,5) from sentence: " + sentence.substring(1,5));
        System.out.println("First index of a in sentence: " + sentence.indexOf('a'));
        System.out.println("Last index of a in sentence: " + sentence.lastIndexOf('a'));
        System.out.println("Last index of z in sentence: " + sentence.lastIndexOf('z'));

        System.out.println("Contains? love: " + sentence.contains("love"));
        System.out.println("Contains? hate: " + sentence.contains("hate"));

        System.out.println();

        StringsHelper.emailParser("bogdan@gmail.com");
        System.out.println();
        StringsHelper.emailParser("bogdan.sinik@famnit.upr.si");
        System.out.println();
        StringsHelper.emailParser("89261001@student.upr.si");

    }
}
