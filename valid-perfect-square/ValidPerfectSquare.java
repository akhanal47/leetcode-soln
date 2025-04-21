
// ---- LeetCode Problem: https://leetcode.com/problems/valid-perfect-square/  ----
// Solved by using method of binary search
// This is the most efficient approach as of now

public class ValidPerfectSquare{
    public static void main(String[] args){
        ValidPerfectSquare sol = new ValidPerfectSquare();
        boolean x = sol.isPerfectSquare(1);
        System.out.println(x);

    }
    public boolean isPerfectSquare(int num){
        if(num == 1){
            return true;
        }
        int left = 0;
        int right = num;
        while(left<right){
            long mid = (left + right)/2; // for large numbers chance of overflow
            if(mid*mid==num){
                return true;
            }
            else if (mid*mid<num) {
                left = (int) mid + 1;
            }
            else
            {
                right = (int) mid;
            }

        }
        return false;
    }
}