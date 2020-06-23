 // We want to swap a and b (also a1 & b1) without using extra variable to store the value
    int a=10;
    int b=20;

    a=a+b;
    b=a-b;
    a=a-b;

    System.out.println("a: "+a+" & b: "+b);

For String variables:

     String a1="abc";
     String b1="def";
     a1=a1.concat(b1);
     b1=a1.substring(0,b1.length());
     a1=a1.substring(b1.length(),a1.length());
     System.out.println("a1: "+a1+" & b1 "+b1);
