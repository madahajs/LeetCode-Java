public class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        if(x<10){
            return true;
        }
        int num = 0;
        int temp = x;
        while(x!=0){
            num = num*10 + x%10;
            x = x/10;
        }
        
        if(temp == num) return true;
        return false;
    }
}