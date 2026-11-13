public class StringsHelper {
    // Palindrome - text that reads the same from both sides
    // bob, kayak, radar, racecar, anavolimilovana

    public static void palindrome(String s){
        // Radar != radar
        s = s.toLowerCase();


        boolean isPalindrome = true;

        for (int i = 0; i < s.length()/2; i++) {
            if(s.charAt(i) != s.charAt((s.length()-1)-i)){
                //start with 2 pointers one at start (index 0) the other
                // at the end(index len-1)
                // add i to the first one and subtract i from second one at each step
                isPalindrome = false;
                break; // exit loop earlies
            }
        }
        // ternary operator
        System.out.println(s + " is " + (isPalindrome ? "":"not ") + "a palindrome!");
        // condition ? ifTrue : ifFalse
    }

    public static String reverseString(String s){
//        String reversed = "";
//
//        for (int i = s.length() - 1; i >= 0; i--) {
//            reversed += s.charAt(i); // started from last char and went to the start
//        }
//
//        return reversed;

        char [] chars = s.toCharArray();
        for (int i = 0; i < chars.length/2; i++) {
            char tmp = chars[i];
            chars[i] = chars[(chars.length - 1) - i];
            chars[(chars.length - 1) - i] = tmp;
        }

        return new String(chars); // String.valueOf(chars);
    }

    public static void palindromeUsingReverse(String s){
        // transform to lower/upper case
        s = s.toUpperCase();

        String reverse = reverseString(s);

        System.out.println(s + " is " + (s.equals(reverse) ? "" : "not ")+ "a palindrome");
    }

    // write a method that replaces all instances of char a with char b in text
    public static String replaceChar(String text, char target, char replacement){
//        String replaced = "";
//
//        for (int i = 0; i < text.length(); i++) {
//            if(text.charAt(i) == target) replaced += replacement;
//            else replaced += text.charAt(i);
//        }
//
//        return replaced;

        char [] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(chars[i] == target) chars[i] = replacement;
        }

        return new String(chars);
    }

    // replace whole word

    public static String replaceWord(String text, String target, String replacement){
        String [] words = text.split(" ");
        for (int i = 0; i < words.length; i++) {
            if(words[i].equals(target)) words[i] = replacement;
        }

        return String.join(" ",words);
    }

    // email parser function
    public static void emailParser(String email){
        //bogdan@gmail.com
        // username: bogdan
        // domain: gmail.com
        // main domain: gmail
        // top level domain: com

        //89261123@student.upr.si
        // username: 89261123
        // domain: student.upr.si
        // subdomain: student
        // main domain: upr
        // top level domain: si
        System.out.println("Email: " + email);

        String [] emailParts = email.split("@");
        String username = emailParts[0];
        String domain = emailParts[1];

        System.out.println("Username: "+ username);
        System.out.println("Full domain: "+ domain);

        int firstDotIndex = domain.indexOf('.');
        int lastDotIndex = domain.lastIndexOf('.');

        if(firstDotIndex == lastDotIndex){
            // only one dot
            String [] domainParts = domain.split("\\."); // escape special character
            String mainDomain = domainParts[0];
            String topLevelDomain = domainParts[1];
            System.out.println("Main domain: " + mainDomain);
            System.out.println("TLD: " + topLevelDomain);
        }else{
            // we have 2 dots
            // use substring
            String subdomain  = domain.substring(0,firstDotIndex);
            String mainDomain  = domain.substring(firstDotIndex + 1, lastDotIndex);
            String topLevelDomain  = domain.substring(lastDotIndex + 1); // if just 1 parameter it goes to the end
            System.out.println("Subdomain: " + subdomain);
            System.out.println("Main domain: " + mainDomain);
            System.out.println("TLD: " + topLevelDomain);
        }




    }

}

