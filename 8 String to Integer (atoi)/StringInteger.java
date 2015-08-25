public class Solution {
    public int myAtoi(String str) {
        if (str == null) {
			return 0;
		}
		long result = 0;
		str = str.trim();
		if (str.length() == 0)
			return 0;
		char[] chs = str.toCharArray();
		int symb = 0;
		if(chs[0] == '-'||chs[0]=='+'){
			symb = 1;
		}
		
		int flag = chs.length-1;
		for(int i=symb;i<chs.length;i++){
			if(chs[i]<'0'||chs[i]>'9'){
				flag = i-1;
				break;
			}
		}
		
		for(int i=flag;i>=symb;i--){
			result += (int)(chs[i]-'0')*Math.pow(10, flag-i);
		}
		if(chs[0] == '-'){
			result *= -1;
		}
		if(result>Integer.MAX_VALUE)	result = Integer.MAX_VALUE;
		if(result<Integer.MIN_VALUE)	result = Integer.MIN_VALUE;
		return  (int)result;
    }
}