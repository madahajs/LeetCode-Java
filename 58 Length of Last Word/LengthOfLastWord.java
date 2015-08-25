public class Solution {
    public int lengthOfLastWord(String s) {
        if(s.trim().equals("")|| s.length() == 0){  
            return 0;  
        }  
        String[] ss = s.trim().split(" ");  
        int len = ss.length;  
        return ss[len - 1].length();  
    }
}