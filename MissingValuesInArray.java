public class MissingNumberInSecondArray{
public static void main(String[] args) {
      int[] arr={203, 204, 205, 206, 207,208 ,203 ,204 ,205 ,206};
int[] brr={203, 204, 204, 205, 206, 207, 205, 208 ,203 ,206 ,205 ,206 ,204};
int[]  list= missingNumbers(arr,brr);
}

private static int[]  missingNumbers(int[] arr,int[] brr){
        int count=0;
        HashMap<Integer,Integer> maparr=new HashMap<>();
    for(int i=0;i<arr.length;i++){
        if(maparr.containsKey(arr[i])){
            count=maparr.get(arr[i])+1;
            maparr.put(arr[i],count);
        }else{
            maparr.put(arr[i],1);
        }
    }
        count=0;
        HashMap<Integer,Integer> mapbrr=new HashMap<>();
        for(int i=0;i<brr.length;i++){
            if(mapbrr.containsKey(brr[i])){
                count=mapbrr.get(brr[i])+1;
                mapbrr.put(brr[i],count);
            }else{

                mapbrr.put(brr[i],1);
            }
        }
             List<Integer> list=new ArrayList<>();
         for(Map.Entry<Integer,Integer> map : mapbrr.entrySet()){
            if(maparr.containsKey(map.getKey())){
                if(map.getValue()!=maparr.get(map.getKey()))
                list.add(map.getKey());
            }else{
                list.add(map.getKey());
            }
          }
    int[] val=new int[list.size()];
        for(int i=0;i< val.length;i++){
            val[i]=list.get(i);
        }
        return val;
    }
}
