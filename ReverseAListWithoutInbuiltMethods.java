public class ReverseAListWithoutInbuiltMethods
{
int[] arr = { 12, 4, 34, 7, 78, 33, 20 }; 

  public static void main(String[] s){
      reverseArrayUsingStreamRange(arr);
  }
    /** This method will reverse the array. reverseArrayUsingStreamRange */
  private static void reverseArrayUsingStreamRange(int[] arr){
      int[] tempArray = Arrays.stream(arr).toArray();
		  int[] arr2 = IntStream.range(1, tempArray.length + 1).boxed().mapToInt(i -> tempArray[tempArray.length - 1]).toArray();
    	Arrays.stream(arr2).forEach(System.out::println);
	}
  /** This method will reverse and sort the array. reverseArrayAndSortUsingStream */
  private static void reverseArrayAndSortUsingStream(int[] arr){
    int[] arr2=Stream.of(arr).collect(Comparator.reverseOrder().reversed());
    Arrays.stream(arr2).forEach(System.out::println);
  }
  
  /** this method will reverse using Java 8 stream reduce method */
  private static void reverseArrayUsingStremReduce(int[] arr){
    myStream.reduce(Stream.empty(), (Stream<Integer> a, Integer b) -> Stream.concat(Stream.of(b), a),
				(a, b) -> Stream.concat(b, a)).forEach(System.out::println);
  }
  /** this method will use listIterator to reverse the int array */
  private static void reverseArrayUsinglistIterator(int[] arr){
    //List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
   Stream<Integer> myStream = Arrays.asList(arr).stream().flatMapToInt(num -> Arrays.stream(num)).boxed();
		List<Integer> list = myStream.collect(Collectors.toList());
		Stream.generate(listIterator::previous).limit(list.size()).forEach(System.out::println);
  }
  
  /** this method will use listIterator to reverse the int array */
  private static void reverseUsingJava8StreamreduceAndConcat(int[] arr){
   Stream<Integer> myStream = Arrays.asList(arr).stream().flatMapToInt(num -> Arrays.stream(num)).boxed();
  myStream.reduce(Stream.empty(), (Stream<Integer> a, Integer b) -> Stream.concat(Stream.of(b), a),
				(a, b) -> Stream.concat(b, a)).forEach(System.out::println);
}
}
