	 public int reverse(int x) {
		 long result = 0;
//		 if(Math.abs(x)<10){
//			 return x;
//		 }else {
			 while(x!=0){
				int s = x%10;
				result = result*10 + s;
				x = x/10;
			 }
			//��ֹ�������
			 if (result>Integer.MAX_VALUE||result<Integer.MIN_VALUE)
			   {
			         return 0;
			   }
	//	 }
		return (int)result;      
	 }