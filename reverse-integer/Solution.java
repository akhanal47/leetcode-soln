class Solution {
    public static String reverseS(String s){
        String reversedS = "";
        for(int idx = 0; idx<s.length(); idx++){
            char c = s.charAt(idx);
            reversedS = c + reversedS;
        }
        return reversedS;
    }

    public int reverse(int x) {
        String new_x = "";
        if (x == 0) {
            return 0;
        }
        else {
            String x_str = Integer.toString(x);
            new_x = reverseS(x_str);
            if (new_x.charAt(new_x.length()-1) == '-')
            {
                new_x = '-' + new_x.substring(0, new_x.length()-1);
            }
            long new_x_int = Long.parseLong(new_x);
            // return based on the limits, for JAVA, the limits or integers are defined in the integer class itself
            if (new_x_int < Integer.MIN_VALUE || new_x_int > Integer.MAX_VALUE) {
                return 0;
            }
            else {
                return (int) new_x_int;
            }
        }
    }

}