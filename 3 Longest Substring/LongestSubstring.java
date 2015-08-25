public int lengthOfLongestSubstring(String s) {
	      if(s == null){
	          return 0;
	      }
	      int start = 0;
	      int result = 0;
	      HashMap<Character,Integer> hm = new HashMap<Character,Integer>(s.length());
	      for(int i = 0;i<s.length();i++){
	    	  char ch = s.charAt(i);
	    	  if(hm.containsKey(ch) && hm.get(ch)>=start){
		    	  start = hm.get(ch)+1;
		      }
	    	  else {
	                result = Math.max(result, i - start + 1);
	            }
	    	  hm.put(ch, i);
	      }
		return result;
	    }