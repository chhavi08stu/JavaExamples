public class StreamExamples{
// static int[] arr = { 8, 7, -3, 23, 8, -4, 11, -19, 21, 8, 6, 13, -7, 0, 11,
	// -5, 3, -9 };
	// String[] str= {"my","name","garima","garg"};
	static String str = "woh ot od ni avaj ";
	static String[] arr = { "abc", "hello", "abc", "my", "new", "man", "can", "man" };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// getOrderedintegers(arr);
		// getAverage(arr);
		// reverseWordsinstring(str);
		duplicateFrequencyInArray(arr);
	}

	private static void duplicateFrequencyInArrayToMap(String[] str) {
		Arrays.stream(str).collect(Collectors.toMap(k -> k, k -> 1, Integer::sum))
				.forEach((k, v) -> System.out.println(k + " & " + v));
	}
private static void duplicateFrequencyInArrayUsingGroupingBy(String[] str) {
	
Arrays.stream(str).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.forEach((k, v) -> System.out.println(k + " & " + v));
}


	private static void reverseWordsinstring(String a) {
		Arrays.stream(a.split("\\s")).map(k -> new StringBuilder(k).reverse().toString()).forEach(System.out::println);
	}

	private static void getOrderedintegers(int[] arr) {
		Arrays.stream(arr).sorted().boxed().collect(Collectors.toList()).forEach(System.out::println);
	}

	private static void getAverage(int[] arr) {
		double avg = Arrays.stream(arr).mapToDouble(x -> x * 2).average().orElse(0);

		System.out.println("average: " + avg);

		Arrays.stream(arr).mapToDouble(x -> x * x).boxed().collect(Collectors.toList()).forEach(System.out::println);
	}}
