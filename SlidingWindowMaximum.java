public class SlidingWindowMaximum {
    public static void main(String[] args) {
        int[] arr={1,3,-1,-3,5,3,6, 7};
            int winSize=3;
        for(int i=0;i<arr.length-2;i++){
            int[] tempA={arr[i],arr[i+1],arr[i+2]};

            int maxValue=getMaxValueFromSortedArray(tempA);
            System.out.print(maxValue+" ");
        }
        System.out.println("");
    }
    private static int getMaxValueFromSortedArray(int[] tempA){

        int maxValue=0;
        for(int j=0;j<tempA.length;j++){
            Arrays.sort(tempA);
            maxValue=tempA[tempA.length-1];
        }
        return maxValue;
    }
}
