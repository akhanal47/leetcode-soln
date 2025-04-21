class Solution {
    public int romanToInt(String s) {
        Integer num = 0;
        Map<String, Integer> roman = Map.of("I", 1, "V", 5, "X", 10, "L", 50, "C", 100, "D", 500, "M", 1000);

        // iterate through the string and check
        for(int i=0; i<s.length(); i++){
            if ((i+1 < s.length()) && (roman.get(String.valueOf(s.charAt(i))) < roman.get(String.valueOf(s.charAt(i+1))))){
                num -= roman.get(String.valueOf(s.charAt(i)));
            }
            else{
                num += roman.get(String.valueOf(s.charAt(i)));
            }
        }
        return num;
    }
}