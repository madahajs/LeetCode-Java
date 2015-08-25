/**
*	实质上是判断一个整数的二进制是否只有一个1
*	n & (n-1) 可以算出一个整数的二进制有多少个1
*/
public class Solution {
    public boolean isPowerOfTwo(int n) {
       if(n>=1&&(n & (n-1))==0){
            return true;
        }
        else
        return false;
    }
}