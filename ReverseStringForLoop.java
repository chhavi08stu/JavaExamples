public static void main(String[] args) {
		/* create a new string */
		StringBuilder s = new StringBuilder("GeeksQuiz");
		System.out.println(" ****************************** REVERSED STRING IS **************************************");
		
		char[] c2=reverseForLoop(s);
		for (int i = 0; i < c2.length; i++) {
			System.out.print(c2[i]);
		}

	}


private static char[] reverseForLoop(StringBuilder sb) {
		char[] str = sb.toString().toCharArray();
		int n = str.length;

		char[] charNew = new char[n];
		int j = 0;
		for (int i = n - 1; i >= 0; i--) {
			charNew[j] = str[i];
			j++;
		}
		return charNew;
	}
