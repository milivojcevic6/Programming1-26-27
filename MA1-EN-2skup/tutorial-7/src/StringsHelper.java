import java.util.Locale;

public class StringsHelper {
    // PALINDROME - kayak, racecar, anavolimilovana

    public static void palindrome(String s){
        // KAyak != kayak
        // transform to lower or upper case KAyak -> kayak
        boolean isPalindrome = true; // we ASSUME it is a palindrome
        s = s.toLowerCase();
        for (int i = 0; i < s.length()/2; i++) {
            if(s.charAt(0 + i) != s.charAt((s.length() - 1) - i)){
                // two pointers one at the beginning and one at the end
                // 0  and len - 1 add i to first one and subtract from last one
                isPalindrome = false; // proof by contradiction
                break; // exit loop earlier
            }
        }

//        if(isPalindrome){
//            System.out.println(s + " is a palindrome!");
//        }else{
//            System.out.println(s + " is not a palindrome!");
//        }

        System.out.println(s + " is " + (isPalindrome ? "": "not ") + "palindrome!");
        // ternary operator condition ? ifTrue : ifNotTrue

    }

    // reverse a string
    public static String reverseString(String s){
        // using array
//        char [] chars = s.toCharArray(); // {'a','b','c'}
//
//        for (int i = 0; i < chars.length/2; i++) {
//            char tmp = chars[i];
//            chars[i] = chars[(chars.length - 1) - i];
//            chars[(chars.length - 1) - i] = tmp;
//        }
//
//        // return string
//        return String.valueOf(chars); //new String(chars)

        String reverse = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            reverse += s.charAt(i);
        }

        return reverse;
    }

    public static void palindromeFromReverse(String s){
        // transform to lower/upper case
        s = s.toUpperCase();
        // reverse a string
        String reverse = reverseString(s);
        // compare with original
        String yesOrNo = (s.equals(reverse) ? "" : "not ");
        System.out.println(s+ " is " + yesOrNo + "a palindrome");
    }

    public static String replaceCharacter(String s, char target, char replacement){
        // e.g. replace a in Java with b -> Jbvb
        // char array
//        char [] chars = s.toCharArray();
//        for (int i = 0; i < chars.length; i++) {
//            if(chars[i] == target) chars[i] = replacement;
//        }
//
//        return new String(chars);

        String reverse = "";

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == target) reverse += replacement; // add replacement
            else reverse += s.charAt(i); // add original letter
        }

        return reverse;
    }

    public static String replaceWord(String s, String target, String replacement){
        // split(" ")
        String [] words = s.split(" "); // whenever u find space cut there

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

        String [] emailParts = email.split("@");
        String username = emailParts[0];
        String domain = emailParts[1];
        System.out.println("Email: "  + email);
        System.out.println("Username: "  + username);
        System.out.println("Domain: "  + domain);

        int firstDotIndex = domain.indexOf('.');
        int lastDotIndex = domain.lastIndexOf('.');

        if(firstDotIndex == lastDotIndex){
            String [] domainParts = domain.split("\\."); // escape special character .
            String mainDomain = domainParts[0];
            String topLevelDomain = domainParts[1];
            System.out.println("Main domain: " + mainDomain);
            System.out.println("TLD: " + topLevelDomain);
        }else{
            String subdomain = domain.substring(0,firstDotIndex); // [0,firstDotIndex)
            String mainDomain = domain.substring(firstDotIndex + 1, lastDotIndex); // [firstDotIndex + 1, lastDotIndex)
            String topLevelDomain = domain.substring(lastDotIndex + 1); // [lastDotIndex + 1, domain.length())

            System.out.println("Subdomain: " + subdomain);
            System.out.println("Main Domain: " + mainDomain);
            System.out.println("TLD: " + topLevelDomain);
        }


    }


}
