public class StackForStringReverse {

	public static void main(String[] args) {
		  /*create a new string */
        StringBuffer s= new StringBuffer("GeeksQuiz"); 
          
        /*call reverse method*/ 
        reverse(s); 
          
        /*print the reversed string*/ 
        System.out.println("Reversed string is " + s); 
	}
	private static void reverse(StringBuffer str) {
		int n=str.length();
		MyStack obj=new MyStack(n);
		// Push all characters of string  
        // to stack 
        int i; 
        for (i = 0; i < n; i++) 
        obj.push(str.charAt(i)); 
      
        // Pop all characters of string and put them back to str 
        for (i = 0; i < n; i++) 
        {  
            char ch = obj.pop(); 
            str.setCharAt(i,ch); 
        } 
	}
}
/**
 * 1. Create empty Stack by passing size in Constructor.
 * 2. Insert(Push) data into Stack:	a) if Stack is Empty, insert data to 0th position
 * 							 		b) if stack is Full, throw Exception displaying the message "Stack is Full".
 * 							 		c) else check for the index to store data.
 * 3. Delete(Pop) data from Stack:	a) if Stack is Empty, throw Exception displaying the message "Stack is Empty".
 * 							 		b) if stack is Full, throw Exception displaying the message "Stack is Full".
 * 							 		c) else check for the index to store data.
 * 2. Check 
 * */
class MyStack{
	int size;
	char[] a;
	int top;
	public MyStack(int n) {
		top=-1;
		size=n;
		a=new char[size];//{'1','f','f','f'};
		
	}
	public boolean isEmpty() {
		return top<0;
	}
	/**
	 * Insert data into Stack if it's not full*/
	public void push(char c) throws IllegalArgumentException{
		if(top>=size) {
			throw new IllegalArgumentException("Stack overflow.");
		}
		a[++top]=c;
		
	}
	/**
	 * Delete the element s from Stack. Throw exception "Stack is Empty" if stack does not have any element.*/
	public char pop() {
		if(top<0) {
			throw new IllegalArgumentException("Stack underflow.");
		} 
			  char x=a[top--];
		return x;
		
	}
	/**
	 * Delete all the elements present in the Stack
	 * */
	public void clear() {
		while(top>0) {
			top--;
			size=top;
		}
	}
	/**
	 * Display the data inserted */
	public void display() {
		for(int i=0;i<a.length;i++) 
		{
		System.out.print(a[i]);
		}
		System.out.println("");
	}
	
}
