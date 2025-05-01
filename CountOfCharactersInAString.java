
public class CountOfCharactersInAString{
static String str = "shopkeeper";
public static void main(String[] s){
  // Count of characters using stream
  getCountByStream(str);
  // Count of characters using merge method of stream
  getCountByMergeJava8(str);
  // Count of characters using filter and for loop
  char[] cA = str.toCharArray();

		for (int i = 0; i < cA.length; i++) {
			char c = cA[i];
			getCountOfCharactersInaString(str, c);
}
}
static void getCountByStream(String str){
		Map<Character, Integer> frequencies = str.chars().boxed()
		        .collect(Collectors.toMap(
		                // key = char
		                k -> Character.valueOf((char) k.intValue()),
		                v -> 1,         // 1 occurence
		                Integer::sum)); // counting
		System.out.println("Frequencies 1 :\n" + frequencies);
}
static void getCountByMergeJava8(String str){
Map<Character, Integer> freqs = new HashMap<>();
		for (char c : str.toCharArray()) {
		    freqs.merge(c,                  // key = char
		                1,                  // value to merge
		                Integer::sum);      // counting
		}
		System.out.println("Frequencies 2 :\n" + freqs);
		}


	private static void getCountOfCharactersInaString(String str, char c) {
		
		int count2 = charSearchByStream(str, c);
		System.out.println("char: " + c + " & count: " + count2);

		//LocalTime t3 = LocalTime.now();
	//	System.out.println(t3);
	}
	public static int charSearchByStream(String str, char ch) {
		int count = 0;
		count = (int) str.chars().filter(k -> k == ch).count();

		return count;
	}
