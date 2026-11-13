import java.util.Locale;

public class StringsHelper {
    // PALINDROME - kayak, racecar, anavolimilovana, rotor

    public static void palindrome(String s){
        // Racecar -> racecar/RACECAR
        s = s.toLowerCase();

        boolean isPalindrome = true;

        for (int i = 0; i < s.length()/2; i++) {
            if(s.charAt(i) != s.charAt((s.length() - 1) - i)){
                // start at 0 and len - 1 and add i to first and
                // subtract i from second in each step
                isPalindrome = false;
                break; // exit loop earlier since we found nonmatching pair
            }
        }

        System.out.println(s + (isPalindrome == true ? " is ": " is not ") + "a palindrome!");
        // conddition ? doSomethingIfTrue : doSomethingIfNot
    }

    public static String reverseString(String s){
//        String reverse = "";
//
//        for (int i = s.length() - 1; i >= 0; i--) {
//            reverse += s.charAt(i); // start from the end of s and concat all chars one by one
//        }
//
//        return reverse; // the other way is to use array method for reversing

        char [] chars = s.toCharArray();

        for (int i = 0; i < chars.length/2; i++) {
            char tmp = chars[i];
            chars[i] = chars[(chars.length - 1) - i];
            chars[(chars.length - 1) - i] = tmp;
        }

        return new String(chars);
    }

    public static void palindromeUsingReverse(String s){
        // KaYak same as kayak
        s = s.toUpperCase();
        String reverse = reverseString(s);

        System.out.println(s + (s.equals(reverse) ? " is a " : " is not a ") + "palindrome!");

    }

    // replace all instances of some character with another char
    // Java repalce a with o -> Jovo

    public static String replaceCharacter(String s, char target, char replacement){
//        String result = "";
//
//        for (int i = 0; i < s.length(); i++) {
//            if(s.charAt(i) != target){
//                result += s.charAt(i);
//            }else{
//                result += replacement;
//            }
//        }
//        return result;

        char [] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(chars[i] == target){
                chars[i] = replacement;
            }
        }
        return new String(chars);
    }

    public static String replaceWord(String s, String target, String replacement){
        // Java is fun -> replace fun with boring -> Java is boring
        String [] words = s.split(" ");
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

        System.out.println("Email: " + email);

        String [] emailParts = email.split("@");
        String username = emailParts[0];
        String domain = emailParts[1];

        System.out.println("Username: " + username);
        System.out.println("Domain: " + domain);

        int firstDotIndex = domain.indexOf('.');
        int lastDotIndex = domain.lastIndexOf('.');

        if(firstDotIndex == lastDotIndex){
            // we have exactly 1 dot
            // gmail.com
            String [] domainParts = domain.split("\\."); // \\ escapes . as special char
            String mainDomain = domainParts[0];
            String topLevelDomain = domainParts[1];

            System.out.println("Main domain: " + mainDomain);
            System.out.println("TLD: " + topLevelDomain);
        }else{
            // we have more dots
            String subdomain = domain.substring(0,firstDotIndex);
            String mainDomain = domain.substring(firstDotIndex + 1,lastDotIndex);
            String topLevelDomain = domain.substring(lastDotIndex + 1);
            System.out.println("Subdomain: " + subdomain);
            System.out.println("Main domain: " + mainDomain);
            System.out.println("TLD: " + topLevelDomain);
        }


    }
}
