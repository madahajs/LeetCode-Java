/**
*	n & (n-1) 可以算出一个整数的二进制有多少个1
*/
public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;
        while(n!=0){
            n = n & (n-1);
            count++;
        }
        return count;
    }
}