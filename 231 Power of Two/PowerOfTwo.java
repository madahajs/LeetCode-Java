/**
*	ʵ�������ж�һ�������Ķ������Ƿ�ֻ��һ��1
*	n & (n-1) �������һ�������Ķ������ж��ٸ�1
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