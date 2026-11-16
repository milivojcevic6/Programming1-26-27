import java.util.Locale;

public class StringsHelper {
    // PALINDROMES - racecar, tacocat, kayak, anavolimilovana

    public static void palindrome(String text){
        // KayAk != kayak
        // transform to all same case (upper/lower)
        text = text.toLowerCase();
        boolean isPalindrome = true; // assume it is palindrome
        for (int i = 0; i < text.length()/2; i++) { //text.length() works as well
            if(text.charAt(i) != text.charAt((text.length() - 1) - i)){
                //  start from both sides and move by 1
                isPalindrome = false; // proof by contradiction
                break; // exit loop earlier
            }
        }

//        if(isPalindrome){
//            System.out.println(text + " is a palindrome!");
//        }else{
//            System.out.println(text + " is not a palindrome!");
//        }

        // ternary operator
        String yerOrNo = isPalindrome ? "" : "not ";
        // condition ? ifTrue : else

        System.out.println(text + " is " + yerOrNo + "palindrome!");

    }

    public static String reverseString(String s){
        // 2 ways
        // arrays
//        char [] letters = s.toCharArray();
//        for (int i = 0; i < letters.length/2; i++) {
//            char tmp = letters[i];
//            letters[i] = letters[(letters.length - 1) - i];
//            letters[(letters.length - 1) - i] = tmp;
//        }
//
//        return new String(letters);
        // strings
        String reverse = "";
        // Java -> "","a","av","ava","avaJ"

        for (int i = s.length() - 1; i >= 0; i--) {
            reverse += s.charAt(i);
        }

        return reverse;
    }

    public static void palindromeUsingReverse(String text){
        // transform to upper
        text = text.toUpperCase();

        // reverse
        String reverse = reverseString(text);
        // compare
        if(reverse.equals(text)) System.out.println(text + " is a palindrome!");
        else System.out.println(text + " is not a palindrome!");
    }

    // replace a in Java with b
    // Jbvb
    public static String replaceChar(String s, char target, char replacement){
        // arrays
//        char [] chars = s.toCharArray();
//        for (int i = 0; i < chars.length; i++) {
//            if(chars[i] == target) chars[i] = replacement;
//        }
//
//        return new String(chars);

        String replaced = "";
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == target) replaced += replacement;
            else replaced += s.charAt(i);
        }
        return replaced;
    }

    // replace word
    // i like this and I like that
    // replace like with have
    // i have this and I have that

    public static String replaceWord(String text, String target, String replacement){
        // get words
        String [] words = text.split(" ");

        for (int i = 0; i < words.length; i++) {
            if(words[i].equals(target)) words[i] = replacement;
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
        System.out.println("Email: "+email);
        String [] emailParts = email.split("@");
        String username = emailParts[0];
        String domain = emailParts[1];

        System.out.println("Username: "+ username);
        System.out.println("Domain: "+ domain);

        int firstDotIndex = domain.indexOf('.');
        int lastDotIndex = domain.lastIndexOf('.');

        // check if just 1 dot
        if(firstDotIndex == lastDotIndex){
            String [] domainParts = domain.split("\\."); // escape special character .
            String mainDomain = domainParts[0];
            String topLevelDomain = domainParts[1];
            System.out.println("Main domain: " + mainDomain);
            System.out.println("TLD: " + topLevelDomain);
        }else{
            // we have more than 1 dot
            String subdomain = domain.substring(0,firstDotIndex); //[0,firstDotIndex)
            String mainDomain = domain.substring(firstDotIndex+1,lastDotIndex); //[firstDotIndex+1,lastDotIndex)
            String topLevelDomain = domain.substring(lastDotIndex+1); //[firstDotIndex+1,domain.length())

            System.out.println("Subdomain: "+ subdomain);
            System.out.println("Main domain: " + mainDomain);
            System.out.println("TLD: " + topLevelDomain);



        }



    }
}
