import java.awt.event.ItemListener;

public class StringsHelper {
    // Palindrome - racecar, tacocar, anavolimilovana, kayak
    public static void palindrome(String s){
        // Kayak != kayak
        // transform string to all small or all capital letter
        s = s.toLowerCase();
        boolean isPalindrome = true; // we asssume it is a palindrome
        for (int i = 0; i < s.length()/2; i++) { // length() also works
            // read it from both sides letter by letter
            if(s.charAt(i) != s.charAt((s.length() - 1) - i)){
                isPalindrome = false; // proof by contradiction
                break; // exit loop earlier
            }
        }

//        if(isPalindrome){
//            System.out.println(s + " is a palindrome!");
//        }else{
//            System.out.println(s + " is not a palindrome!");
//        }

        String yesOrNo = isPalindrome ? "" : "not "; // condition ? ifTrue : ifNotTrue

        System.out.println(s + " is " + yesOrNo + "a palindrome");

    }

    // reverse string
    public static String reverseString(String s){
//        // using char array
//        char [] letters = s.toCharArray();
//
//        for (int i = 0; i < letters.length/2; i++) {
//            char tmp = letters[i];
//            letters[i] = letters[(letters.length - 1) - i];
//            letters[(letters.length - 1) - i] = tmp;
//        }
//
//        // String.valueOf(letters)
//        return new String(letters);

        String reverse = "";
        // Java -> "", "a","av","ava","avaJ"
        for (int i = s.length()-1; i >= 0; i--) {
            reverse += s.charAt(i);
        }

        return reverse;
    }

    public static void palindromeUsingReverse(String s){
        // transform to upper/lower
        s = s.toUpperCase();
        // reverse
        String reverse = reverseString(s);
        // compare to original
        if(reverse.equals(s)){
            System.out.println(s + " is a palindrome!");
        }else{
            System.out.println(s + " is not a palindrome!");
        }
    }

    // replace a character with another character in string
    // replace a in Java with b -> Jbvb
    public static String replaceChar(String text, char target, char replacement){
//        // array
//        char [] letters = text.toCharArray();
//
//        for (int i = 0; i < letters.length; i++) {
//            if(letters[i] == target) letters[i] = replacement;
//        }
//
//        return new String(letters);

        String replaced = "";

        for (int i = 0; i < text.length(); i++) {
            char currentLetter = text.charAt(i);
            if(currentLetter == target) replaced += replacement;
            else replaced += currentLetter;
        }

        return replaced;

    }

    // replace whole word
    // I love movies -> replace movies with Java -> I love Java

    public static String replaceWord(String text, String oldWord, String newWord){
        // get words from text
        // .split(" ")

        String [] words = text.split(" ");

        for (int i = 0; i < words.length; i++) {
            if(words[i].equals(oldWord)) words[i] = newWord;
        }

        return String.join(" ", words);
    }

    public static void emailParser(String email){
        //bogdan@gmail.com
        // username: bogdan
        // domain: gmail.com
        // main domain: gmail
        // top level domain: com

        //8921241@student.upr.si
        // username: 8921241
        // domain: student.upr.si
        // subdomain: student
        // main domain: upr
        // top level domain: si
        System.out.println("Email: " + email);

        String [] emailParts = email.split("@");
        String username = emailParts[0];
        String domain = emailParts[1];
        System.out.println("Username: " + username);
        System.out.println("Domain: " + domain);

        int firstDotIndex = domain.indexOf('.');
        int lastDotIndex = domain.lastIndexOf('.');

        //check if only 1 dot
        if(firstDotIndex == lastDotIndex){
            String [] domainParts = domain.split("\\."); // escape special character
            String mainDomain = domainParts[0];
            String topLevelDomain = domainParts[1];
            System.out.println("Main domain: " + mainDomain);
            System.out.println("TLD: " + topLevelDomain);
        }else{
            // we have 2 or more dots
            String subdomain = domain.substring(0,firstDotIndex); // [0,firstDotIndex)
            String mainDomain = domain.substring(firstDotIndex + 1, lastDotIndex); // [firstDotIndex + 1, lastDotIndex)
            String topLevelDomain = domain.substring(lastDotIndex+1); // [lastDotIndex+1, domain.length())

            System.out.println("Subdomain: " + subdomain);
            System.out.println("Main domain: " + mainDomain);
            System.out.println("TLD: " + topLevelDomain);
        }

    }

}
