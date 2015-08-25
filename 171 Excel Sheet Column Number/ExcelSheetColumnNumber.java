/**
*   A -> 1
*   B -> 2
*   C -> 3
*   ...
*   Z -> 26
*   AA -> 27
*   AB -> 28 
*	实质上是26进制转化为十进制的问题，但是注意是从1开始，而不是0
*/
public class Solution {
    public int titleToNumber(String s) {
        int result = 0;
        char[] chs = s.toCharArray();
        for(int i = 0; i<chs.length;i++){
        	result = result*26 + (chs[i]-'A'+1);
        }
		return result;
    }
}