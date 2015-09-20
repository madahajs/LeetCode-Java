public class Solution {
    public int addDigits(int num) {
        int result = getNum(num);
        while(result>=10){
            result = getNum(result);
        }
        return result;
    }
    public int getNum(int n){
        String s = String.valueOf(n);
        int sum = 0;
        for (char ch : s.toCharArray()) {
            sum += (ch - '0');
        }
        return sum;
    }
}