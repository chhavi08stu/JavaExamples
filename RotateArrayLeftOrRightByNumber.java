public class RotateByANumber {
    public static void main(String[] args) {
        int[] arr=new int[]{2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        rotateLeftByNum(arr,2);
        rotateRightByNum(arr,2);
    }
    private static void rotateLeftByNum(int[] arr,int num){
        System.out.println("\n");
        System.out.println("******************************************************");

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
        for(int i=0;i<num;i++){
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
