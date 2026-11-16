import java.util.Locale;

public class StringsHelper {
    // Palindromes - racecar, kayak, radar, anavolimilovana

    public static void palindrome(String s){
        // KayAk != kayak
        // KayAk -> kayak
        s = s.toLowerCase(); // dont forget to assign to s again
        boolean isPalindrome = true; // assume it is a palindrome
        for (int i = 0; i < s.length()/2; i++) { // .length() will have same result
            if(s.charAt(i) != s.charAt((s.length() - 1) - i)){ // we start from 0 and len-1
                // and add i to the first and subtract i from second in each iteration
                isPalindrome = false;
                break; // exit loop earlier
            }
        }

//        if(isPalindrome){
//            System.out.println(s + " is a palindrome!");
//        }else {
//            System.out.println(s + " is not a palindrome!");
//        }

        // ternary operator
        String yesOrNo = isPalindrome ? "" : "not ";
        // condition ? ifTrue : else

        System.out.println(s + " is " + yesOrNo + "a palindrome!");

    }

    // reverse string

    public static String reverseString(String s){
        // USING ARRAYS
//        char [] chars = s.toCharArray();
//
//        for (int i = 0; i < chars.length/2; i++) {
//            char tmp = chars[chars.length - 1 - i];
//            chars[chars.length - 1 - i] = chars[i];
//            chars[i] = tmp;
//        }
//
//        String reverse = new String(chars);
//
//        return reverse;

        // DIRECTLY WITH STRINGS
        String reverse = "";

        // Java
        // "", "a", "av", "ava", "avaJ"
        for (int i = s.length()-1; i >= 0 ; i--) {
            reverse += s.charAt(i);
        }

        return reverse;
    }


    public static void palindromeUsingReverse(String s){
        // transforming to lower/upper casew
        s = s.toUpperCase(); // dont forget to assign to s
        // reverse a string
        String reverse = reverseString(s);
        // compare reverse with original
        if(reverse.equals(s)){
            System.out.println(s + " is a palindrome!");
        }else{
            System.out.println(s + " is not a palindrome!");
        }
    }

    // replace all instances of a in word Java with b -> Jbvb
    public static String replaceCharacter(String s, char target, char replacement){
//        String replace = "";
//
//        for (int i = 0; i < s.length(); i++) {
//            char currentChar = s.charAt(i);
//            if(currentChar == target) replace += replacement;
//            else replace += currentChar;
//        }
//
//        return replace;

        // char array
        char [] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if(chars[i] == target) chars[i] = replacement;
        }

        return new String(chars);
    }

    public static String replaceWord(String s, String target, String replacement){
        // I love basketball
        // replace basketball with football
        // I love football
        // .split(" ")
        String [] words = s.split(" "); // {"I", "love", "basketball"}

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

        //check if just 1 dot
        if(firstDotIndex == lastDotIndex){
            // gmail.com
            String [] domainParts = domain.split("\\.");
            //escape special char
            String mainDomain = domainParts[0];
            String topLevelDomain = domainParts[1];
            System.out.println("Main domain: "+ mainDomain);
            System.out.println("TLD: "+ topLevelDomain);
        }else{
            // student.upr.si
            String subdomain = domain.substring(0,firstDotIndex); // [0,firstDotIndex)
            String mainDomain = domain.substring(firstDotIndex+1, lastDotIndex); // [firstDotIndex+1, lastDotIndex)
            String topLevelDomain = domain.substring(lastDotIndex+1); // [lastDotIndex+1, length)

            System.out.println("Subdomain: " + subdomain);
            System.out.println("Main domain: " + mainDomain);
            System.out.println("TLD: " + topLevelDomain);


        }

    }
}
