public class SlidingWindowMaximum {
    public static void main(String[] args) {
int[] arr={1,3,-1,-3,5,3,6, 7};
    int winSize=3;
   int[] arrMax=getMax(arr,winSize);
        System.out.println("*****************************************");
display(arrMax);
    }
    private static int[] getMax(int[] A,int B){

        List<Integer> list=new ArrayList<>();
        int[] tempA=new int[B];
                for(int i=0;i<A.length-B+1;i++){
                    tempA=Arrays.copyOfRange(A, i, i+B);
                    Arrays.sort(tempA);
                    list.add(tempA[tempA.length-1]);
        }
        int[] array = list.stream().mapToInt(i->i).toArray();
        return array;
    }
   /* private static int[] getMax(int[] A,int B){

        List<Integer> list=new ArrayList<>();
        int[] tempA=new int[B];

                for(int i=0;i<A.length-B+1;i++){

            int tempi=0;
             for(int j=i;j<i+B;j++){

            tempA[tempi]=A[j];
                 tempi++;
               }
            int retMax=getMaxValueFromSortedArray(tempA);
            list.add(retMax);

        }
        int[] array = list.stream().mapToInt(i->i).toArray();
        return array;
    }*/
    private static int getMaxValueFromSortedArray(int[] tempA){
        display(tempA);
        int maxValue=0;
        for(int j=0;j<tempA.length;j++){
            Arrays.sort(tempA);
             maxValue=tempA[tempA.length-1];
                   }
            return maxValue;
    }
    private static void display(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println("");
    }
}
