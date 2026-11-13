import java.util.Locale;

public class StringsHelper {
    // PALINDROME - kayak, radar, racecar, rotor
    public static void palindrome(String text){
        // Kayak != kayak
        text = text.toLowerCase(); // KAyak -> kayak
        boolean isPalindrome = true; // we assume it is a palindrome

        for (int i = 0; i < text.length()/2; i++) {
            if(text.charAt(0 + i) != text.charAt((text.length()-1) - i)){
                // START FROM 2 SIDES 0 AND text.length - 1 AND ADD I TO LEFT SIDE
                // AND SUBTRACT I FROM RIGHT SIDE IN EACH ITERATION
                isPalindrome = false; // we found pair that is not matching
                // so it cant be palindrome
                break; // exit loop earlier
            }
        }

        if(isPalindrome){
            System.out.println(text + " is a palindrome!");
        }else{
            System.out.println(text + " is not a palindrome!");
        }
    }

    // other aleternative is to reverse a string and compare to original

    public static String reverseString(String s){
//        char[] chars = s.toCharArray();
//
//        for (int i = 0; i < chars.length/2; i++) {
//            char tmp = chars[i];
//            System.out.println("current tmp: " + tmp);
//            chars[i] = chars[(chars.length - 1) - i];
//            System.out.println("current chars[i]: " + chars[i]);
//            chars[(chars.length - 1) - i] = tmp;
//            System.out.println("current  chars[(chars.length - 1) - i]: " +  chars[(chars.length - 1) - i]);
//        }
//
//
//
//        return new String(chars);

        String reverse = "";

        for (int i = s.length()-1; i >= 0; i--) {
            reverse += s.charAt(i);
        }

        return reverse;
    }

    public static void palindromeUsingReverse(String s){
        s = s.toUpperCase();
        String reverse = reverseString(s);

        if(reverse.equals(s)) System.out.println(s + " is a palindrome!");
        else System.out.println(s + " is not a palindrome!");
    }

    // replace all instances of some char (a) with some other character (b)
    public static String replaceChar(String s, char target, char replacement){
//        char[] chars = s.toCharArray(); // "Java" -> {'J','a','v','a'}
//
//        for (int i = 0; i < chars.length; i++) {
//            if(chars[i] == target) chars[i] = replacement;
//        }
//
//        return new String(chars);
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == target) result += replacement;
            else result+= s.charAt(i);
        }
        return result;
    }

    public static String replaceWord(String s, String target, String replacement){
        String [] words = s.split(" ");

        for (int i = 0; i < words.length; i++) {
            if(words[i].equals(target)) words[i] = replacement;
        }

        s = String.join(" ", words);
        return s;
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
        System.out.println("Email: "+ email );
        String [] emailParts = email.split("@");

        String username = emailParts[0];
        String domain = emailParts[1];
        System.out.println("Username: " + username);
        System.out.println("Domain: " + domain);

        int indexOfFirstDot = domain.indexOf('.');
        int indexOfLastDot = domain.lastIndexOf('.');

        if(indexOfFirstDot == indexOfLastDot){
            //just 1 dot
            String [] domainParts = domain.split("\\."); // escape special char
            String mainDomain = domainParts[0];
            String topLevelDomain = domainParts[1];
            System.out.println("Main domain: " + mainDomain);
            System.out.println("TLD: " + topLevelDomain);
        }else{
            // more dots
            String subdomain = domain.substring(0,indexOfFirstDot);
            String mainDomain = domain.substring(indexOfFirstDot + 1, indexOfLastDot);
            String topLevelDomain = domain.substring(indexOfLastDot+1);
            System.out.println("Subdomain: " + subdomain);
            System.out.println("Main domain: " + mainDomain);
            System.out.println("TLD: " + topLevelDomain);
        }

    }
}
