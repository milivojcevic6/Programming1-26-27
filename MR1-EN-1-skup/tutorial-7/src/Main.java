public class Main {
    static void main(String[] args) {
        // String - any text "something like this"
        String name = "Bogdan";
        String lastName = "Sinik";
        String s1 = new String("Hi");
        char [] letters = {'a','v','c'};
        String s2 = new String(letters);

        // concatenation - connecting 2 or more strings into 1
        String fullName = name + " " + lastName;
        // one way is to use plus
        // printing strings
        int [] arr = new int[2];//{0,0}
        //System.out.println(arr);
        System.out.println(fullName + " and I am x years old" + true + null + 1);
        System.out.println(fullName.concat(" is my name!"));
        //System.out.println(fullName.concat(7));
        // concat accepts only strings

        System.out.println("Character at index 5: " + fullName.charAt(5));
        System.out.println("Character at index 0: " + fullName.charAt(0));

        System.out.println("length of string: " + fullName.length());
        System.out.println("last valid index: " + (fullName.length() - 1));
//        System.out.println("invalid index: " + fullName.charAt(112));

        char [] chars = fullName.toCharArray(); //{'B','o','g','d'...}
        for (int i = 0; i < chars.length; i++) {
            System.out.println("Char at index " + i + ": "+ chars[i]);
            chars[i] = 'A';
            System.out.println("Same position after changing: " + chars[i]);
        }

        String stringFromCharArray = new String(chars);
        System.out.println(stringFromCharArray);

        // traverse string
        for (int i = 0; i < fullName.length(); i++) {
            System.out.println(fullName.charAt(i));
            //fullName.charAt(i) = 'A'; // not allowed as strings are immutable
        }

        // comparing strings

        String first = "text";
        String second = "text";
        String third = new String("text");
        String fourth = new String("text");


//        System.out.println("first == second: " + (first ==second));
//        System.out.println("first == third: " + (first ==third));
//        System.out.println("first == fourth: " + (first ==fourth));
//        System.out.println("third == fourth: " + (third ==fourth));
//
//        System.out.println("first.equals(second): " + first.equals(second));
//        System.out.println("first.equals(third): " + first.equals(third));
//        System.out.println("first.equals(fourth): " + first.equals(fourth));
//        System.out.println("third.equals(fourth): " + third.equals(fourth));

        StringsHelper.palindrome("racecar");
        StringsHelper.palindrome("tacocat");
        StringsHelper.palindrome("anavolimilovana");
        StringsHelper.palindrome("programming");
        StringsHelper.palindrome("palindrome");

        System.out.println("Reverse of Java: " + StringsHelper.reverseString("Java"));

        StringsHelper.palindromeUsingReverse("racecar");
        StringsHelper.palindromeUsingReverse("tacocat");
        StringsHelper.palindromeUsingReverse("Anavolimilovana");
        StringsHelper.palindromeUsingReverse("programming");
        StringsHelper.palindromeUsingReverse("palindrome");

        System.out.println();
        System.out.println("Replace a in Java with b: " + StringsHelper.replaceChar("Java",'a','b'));

        String sentence = "I love Java and I love Analysis!";

        System.out.println("Replace love with something more realistic: \n" +
                StringsHelper.replaceWord(sentence,"love","hate"));

        System.out.println("Substring (0,5) in sentence: " + sentence.substring(0,5));
        // upper bound not included
        System.out.println("First index of a in sentnce: "+ sentence.indexOf('a'));
        System.out.println("Last index of a in sentnce: "+ sentence.lastIndexOf('a'));
        System.out.println("Last index of a in sentnce: "+ sentence.lastIndexOf('z'));
        System.out.println("Contains love? " + sentence.contains("love"));
        System.out.println("Contains hate? " + sentence.contains("hate"));

        System.out.println();
        StringsHelper.emailParser("bogdan@gmail.com");
        System.out.println();
        StringsHelper.emailParser("bogdan.sinik@famnit.upr.si");
        System.out.println();
        StringsHelper.emailParser("89261123@student.upr.si");
        System.out.println();

    }
}
