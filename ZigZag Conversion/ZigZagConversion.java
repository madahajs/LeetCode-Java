	public String convert(String s, int numRows) {

		char[][] ch = new char[numRows][s.length()];

		char[] chs = s.toCharArray();
		if(numRows == 1){
			return s;
		}
		int time = 2 * numRows - 2;
		for (int i = 0; i < chs.length; i++) {
			if (i % (time) < numRows) {
				ch[i % (time)][i / (time) * (numRows - 2)
						+ i / (time)] = chs[i];
			}
			if (i % (time) >= numRows) {
				ch[numRows - 2 - i % (time) % numRows][i
						/ (time) * (numRows - 2) + i
						/ (time) + i % (time) % numRows
						+ 1] = chs[i];
			}
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < numRows; i++) {
			for (int j = 0; j < s.length(); j++) {
				if (ch[i][j] != '\0') {
					sb.append(ch[i][j]);
				}
				System.out.print(ch[i][j]+" ");
			}
			System.out.println();
		}
		return sb.toString();
	}