import java.util.Locale;

public class StringsHelper {
    // PALINDROME IS anavolimilovana
    // kayak
    // racecar

    public static void palindrome(String s){
        // Racecar not same as racecar
        s = s.toLowerCase();
//        System.out.println(s);

        boolean isPalindrome = true;

        for (int i = 0; i < s.length()/2; i++) {
            if(s.charAt(i) != s.charAt((s.length() - 1) - i)){
                // alternative is to transform to char array and use []
                // transform back to string at the end
                // start at 0 and len - 1 and add i to 0 and subtract i from len-1
                isPalindrome = false;
                break; // early exit as soon as we find pair that is not matching
            }
        }

        System.out.println(s + " is a palindome? " + isPalindrome);
    }

    public static String reverseString(String s){
        // 1st way transform to char array and do it like we did on tutorial 6
//        char [] chars = s.toCharArray();
//
//        for (int i = 0; i < chars.length/2; i++) { // stop at the half so we dont do it twice
//            char tmp = chars[i];
//            chars[i] = chars[(chars.length - 1) - i];
//            chars[(chars.length - 1) - i] = tmp;
//        }
//
//        return new String(chars);

        // 2nd way
        String reversed = "";

        for (int i = s.length()-1; i >= 0; i--) {
            reversed += s.charAt(i);
        }

        return reversed;
    }

    public static void palindromeWithReverse(String s){
        // transform to lower/upper case
        s = s.toLowerCase();
        String reverse = reverseString(s);

        boolean isPalindrome = s.equals(reverse);

        System.out.println(s + " is a palindome? " + isPalindrome);
    }

    // replace all instances of character with another character
    // replace a in java with o -> jovo

    public static String replaceCharacters(String s, char target, char replacement){
        // char array way
//        char [] chars = s.toCharArray();
//
//        for (int i = 0; i < chars.length; i++) {
//            if(chars[i] == target) chars[i] = replacement;
//        }
//
//        return new String(chars);

        String replaced = "";

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == target){
                replaced += replacement;
            }else{
                replaced += s.charAt(i);
            }
        }

        return replaced;
    }

    public static String replaceWord(String s, String target, String replacement){
        String [] words = s.split(" "); // looks for spaces and cuts there

        for (int i = 0; i < words.length; i++) {
            if(words[i].equals(target)) words[i] = replacement;
        }

        return String.join(" ", words);
    }


    // REAL WORLD USAGE/SOLUTION

    // get all parts of email
    // bogdan.sinik@famnit.upr.si
    // bogdan@gmail.com
    // username@domain
    // username@mainDomain.topLevelDomain
    // username@subDomain.mainDomain.topLevelDomain

    public static void email(String email){
        String [] emailParts = email.split("@");
        String username = emailParts[0];
        String domain = emailParts[1];
        System.out.println("Email: " + email);
        System.out.println("Username: " + username);
        System.out.println("Full domain: " + domain);

        int firstDotIndex = domain.indexOf('.');
        int lastDotIndex = domain.lastIndexOf('.');

        if(firstDotIndex != lastDotIndex){
            // we have subdomain
            String subdomain = domain.substring(0, firstDotIndex); // [0,firstDotIndex)
            String mainDomain = domain.substring(firstDotIndex + 1, lastDotIndex);
            String topLevelDomain = domain.substring(lastDotIndex + 1); // [lastDotIndex + 1, domain.length)

            System.out.println("Subdomain: " + subdomain);
            System.out.println("Main domain: " + mainDomain);
            System.out.println("TLD: " + topLevelDomain);

        }else{
            // we have just the main domain
            // gmail.com
            String [] domainParts = domain.split("\\.");
            String mainDomain = domainParts[0];
            String topLevelDomain = domainParts[1];

            System.out.println("Main domain: " + mainDomain);
            System.out.println("TLD: " + topLevelDomain);

        }

    }

}
