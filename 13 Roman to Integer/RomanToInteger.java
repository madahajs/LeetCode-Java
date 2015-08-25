public class Solution {
    public int romanToInt(String s) {
        //I(1)£¬V(5)£¬X(10)£¬L(50)£¬C(100)£¬D(500)£¬M(1000)
        if(s==null){
            return 0;
        }
        char[] chs = s.toCharArray();
        HashMap<Character,Integer> hm = new HashMap<Character,Integer> ();
        hm.put('\0', 0);
        hm.put('I', 1);
        hm.put('V', 5);
        hm.put('X', 10);
        hm.put('L', 50);
        hm.put('C', 100);
        hm.put('D', 500);
        hm.put('M', 1000);
        int res = 0;
        for(int i=0; i<chs.length-1;i++){
            if(hm.get(chs[i])<hm.get(chs[i+1])){
            	res += 0-hm.get(chs[i]);
            	chs[i] = '\0';
            }
        }
        for(int i=0; i<chs.length;i++){
        	res += hm.get(chs[i]);
        }
        return res;
    }
}