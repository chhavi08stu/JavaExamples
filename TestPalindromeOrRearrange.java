public class TestPalindrome {

	public static void main(String[] args) {
		System.out.println("Palindrome: "+isPalindrome("madamm"));
	}
	/** Check whether a string is Palindrome or not. ********** ONE WAY ***************** 	*/
public static boolean isPalindrome(String s){
	boolean flag=false;
	System.out.println("Time started: "+new Date());
	char[] charArray=s.toCharArray();
	for(int i=0,j=charArray.length-1;i<(charArray.length/2)+1 & j>i;i++,j--){
		if(!(charArray[i]== charArray[j])){
			flag=false;
			break;
		}else{
			flag=true;
		}
	}
	System.out.println("Time completed: "+new Date());
	return flag;
}
/** Check whether a string is Palindrome or not. ********** SECOND WAY ***************** 	*/

 private static boolean isPalindrome(String val){
        char[] c=val.toCharArray();
        int length=c.length;boolean flag=false;
        for(int i=0;i<length/2;i++){
            if(!(c[i]==c[length-1-i])){
                flag=false;
            }else{
                flag=true;
            }
        }
        return flag;
    }
    /** Check whether a string could be rearranged to form a palindrome or not. */
    
     private static boolean canCreatePalindrome(String val)
    {
                boolean flag=false;
                List<Character> list=new ArrayList<Character>();
        for(int i=0;i<val.length();i++)
        {
            if(list.contains(val.charAt(i)))
                list.remove((Character)val.charAt(i));
            else
                list.add(val.charAt(i));
        }
        if((val.length() %2==0 && list.isEmpty()) || (val.length() %2!=0 && list.size()==1)){
            flag=true;
        }
        return flag;
    }
	/* Check whether a string could be rearranged to form a palindrome or not. */
	protected static boolean isPalindrome(String s){
        boolean flag=false;
        List<String> temp=new ArrayList<String>();
        char[] charA=s.toCharArray();

        for(int i=0;i<charA.length;i++){
            if(!temp.contains(""+charA[i])){
                      temp.add(""+charA[i]);
            }else{
                      temp.remove(""+charA[i]);
            }
        }
         if((charA.length %2==0 && temp.size()==0) || charA.length%2!=0 && temp.size()==1){
            flag=true;
        }
        return flag;
    }
}
