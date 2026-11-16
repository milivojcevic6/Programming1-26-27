public class Main {
    public static void main(String[] args) {
        // STRINGS - any text
        String name = "Johny";
        String s1 = new String("test");
        char [] chars = {'a','v','d'};
        String s2 = new String(chars);

        //print strings
//        int [] arr = new int [2];
//        System.out.println(arr);

        System.out.println(name);
//        System.out.println(s1);
//        // concatenation = putting 2 or more strings into one
//        System.out.println(s2 + 6 + true + null);
//
//        System.out.println("hello " + "world");
//        System.out.println("hello".concat(" world")); // works only with strings

        System.out.println("Element at index 3 in " + name + ": " + name.charAt(3));
        //System.out.println("Element at index 33 in " + name + ": " + name.charAt(33)); // if index is >= len or < 0 it goes out of bounds
        System.out.println("Length of string: " + name.length());
        System.out.println("Last valid index: " + (name.length() - 1));

        // easily transform string into char array
        char [] letters = name.toCharArray(); // {'B','o','g','d','a','n'}
        for (int i = 0; i < letters.length; i++) {
            System.out.println("Letter at index "+ i + ": " + letters[i]);
            letters[i] = 'A';
        }

        String stringFromArray = new String(letters);
        System.out.println(stringFromArray);

        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
            //name.charAt(i) = 's'; // not allowed (strings are immutable)
        }

        // compare 2 strings
//        String first = "text";
//        String second = "text";
//        String third = new String("text");
//
//        System.out.println("first == second: " + (first ==second));
//        System.out.println("first == third: " + (first ==third));
//
//        System.out.println("first.equals(second): " + (first.equals(second)));
//        System.out.println("first.equals(third): " + (first.equals(third)));

//        StringsHelper.palindrome("taCocat");
//        StringsHelper.palindrome("raceCar");
//        StringsHelper.palindrome("anaVolimilovana");
//        StringsHelper.palindrome("Java");
//        StringsHelper.palindrome("paLindrome");

        System.out.println("Reverse of Java: " + StringsHelper.reverseString("Java"));

        StringsHelper.palindromeUsingReverse("taCocat");
        StringsHelper.palindromeUsingReverse("raceCar");
        StringsHelper.palindromeUsingReverse("anaVolimilovana");
        StringsHelper.palindromeUsingReverse("Java");
        StringsHelper.palindromeUsingReverse("paLindrome");

        // replace a with b in Java

        System.out.println(StringsHelper.replaceChar("Java",'a','b'));
        System.out.println("Java".replace('a','b'));

        String sentence = "I love Java and I love Analysis!";

        System.out.println("Replace love with hate in sentence: \n" +
                StringsHelper.replaceWord(sentence,"love","hate"));

        System.out.println("Substring of sentence (1,7): " + sentence.substring(1,7)); // returns string from char 1 to char 6
        //  len is always end - start index (7-1 = 6)
        System.out.println("First index of a in sentence: " + sentence.indexOf('a'));
        System.out.println("Last index of a in sentence: " + sentence.lastIndexOf('a'));
        System.out.println("Last index of a in sentence: " + sentence.lastIndexOf('z'));

        System.out.println("Contains love? " + sentence.contains("love"));
        System.out.println("Contains hate? " + sentence.contains("hate"));

        System.out.println();
        StringsHelper.emailParser("bogdan@gmail.com");
        System.out.println();
        StringsHelper.emailParser("bogdan.sinik@famnit.upr.si");
        System.out.println();
        StringsHelper.emailParser("89261123@student.upr.si");
        
    }
}
