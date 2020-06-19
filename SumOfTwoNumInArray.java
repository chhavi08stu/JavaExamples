public class SumOfTwoNumInArray {
	static int[] arr = { 2, 1, 6, 6, 96, 92 };		
	static int n=98;
	public static void main(String[] s) {
		System.out.println("num: "+sumOfTwoNum(arr.length,n));
	}
	private static int sumOfTwoNum(int n,int sum) {
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		// Store counts of all elements in map hm 
        for (int i=0; i<n; i++){ 
               // initializing value to 0, if key not found 
            if(!hm.containsKey(arr[i])) 
                hm.put(arr[i],0); 
            hm.put(arr[i], hm.get(arr[i])+1); 
        } 
        int twice_count = 0; 
        for (int i=0; i<n; i++){ 
            if(hm.get(sum-arr[i]) != null)  // 2, 1, 6, 6, 96, 92 |||||||||| 98
                twice_count += hm.get(sum-arr[i]);  // 2, 1, 1 , 1 , 1
            if (sum-arr[i] == arr[i]) 
                twice_count--; 
        }
        return twice_count/2;
	}
}
