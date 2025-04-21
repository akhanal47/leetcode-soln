public class ValidPalindrome {
    public static void main (String [] args)
    {
        ValidPalindrome sol = new ValidPalindrome();
        String s = "1o11";
        System.out.println(sol.isPalindrome(s));
    }
    public boolean isPalindrome(String s)
    {
        String converteds = "";
        String reversedString = "";
        for(int i=0; i<s.length(); i++)
        {
            Character lowerchar = Character.toLowerCase(s.charAt(i));
            if(Character.isLetterOrDigit(lowerchar))
            {
                converteds = converteds + lowerchar;
                reversedString = lowerchar + reversedString;
            }
        }
        if (converteds.equals(reversedString))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}