import java.util.HashMap;
import java.util.Hashtable;

public class TitletoNumber {
    public static void main (String[] args)
    {
        TitletoNumber solution = new TitletoNumber();
        String test = "BD";
        solution.titleToNumber(test);
    }
    public int titleToNumber(String columnTitle)
    {
        // Create the hasmape to put value in
        HashMap<Character, Integer> pairTable = new HashMap<>();
        Integer correspondingNum = 0;

        for(Character c='A'; c<='Z'; c++)
        {
            pairTable.put(c, c-'A'+1);
        }
        System.out.println(pairTable);

        // the general approach is same as the binary to decimal conversion
        Integer pow = 0;
        for(int i=columnTitle.length()-1; i>=0; i--)
        {
            Integer idxvalue = pairTable.get(columnTitle.charAt(i));
            correspondingNum = correspondingNum + (idxvalue * (int) Math.pow(26,pow));
            pow ++;
        }
        System.out.println(correspondingNum);
        return correspondingNum;
    }
}