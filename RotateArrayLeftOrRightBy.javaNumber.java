public class RotateByANumber {
    public static void main(String[] args) {
        Integer[] arr={2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int k=2;
        int n=arr.length;
        rotateLeftByNum(arr,k); //Complexity O(n2)
        rotateRightByNum(arr,k);// Complexity O(n2)
        
        rotateLeft(arr,n,k);
        rotateRight(arr,n,k);
    }
    *********************************************************               Complexity O(n)                ************************************************************
    private void  rotateLeft(Integer[] arr,int n,int k){
           Collections.rotate(Arrays.asList(arr), n - k);
		// print the array
        for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
    }
         private void  rotateRight(Integer[] arr,int n,int k){
             Collections.rotate(Arrays.asList(arr), k);
		// print the array
        for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
    }
        
        
        
    *********************************************************               Complexity O(n2)                ************************************************************
    
    private static void rotateLeftByNum(int[] arr,int k){
        System.out.println("\n");
        System.out.println("******************************************************");

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
        for(int i=0;i<k;i++){
            arr=rotateLeft(arr);
        }System.out.println("\n");
        System.out.println("******************************************************");
        for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+"\t");
        }
        System.out.println("\n");
    }
    private static int[] rotateLeft(int[] arr){
        int temp=arr[0];//int last=arr[arr.length-1];
        int k=0;
        int[] tempArr=new int[arr.length];
        for(int i=1;i<arr.length;i++){
            tempArr[k]=arr[i];
            k++;
        }
        tempArr[arr.length-1]=temp;
        return tempArr;
    }
    private static void rotateRightByNum(int[] arr,int num){
        System.out.println("\n");
        System.out.println("******************************************************");

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
        for(int i=0;i<num;i++){
            arr=rotateRight(arr);
        }System.out.println("\n");
        System.out.println("******************************************************");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println("\n");
    }
    private static int[] rotateRight(int[] arr){
        int temp=arr[arr.length-1];
        int k=0;
        int[] tempArr=new int[arr.length];
        for(int i=0;i<arr.length-1;i++){
            k++;
            tempArr[k]=arr[i];
        }
        tempArr[0]=temp;
        return tempArr;
    }
}
