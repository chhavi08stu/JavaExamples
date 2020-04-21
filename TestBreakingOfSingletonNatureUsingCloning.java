public class TestBreakingOfSingletonNatureUsingCloning {
        public static void main(String[] args) throws CloneNotSupportedException {
            MySingleton2 myS=MySingleton2.getinstance();
            myS.display("first object: "+System.identityHashCode(myS));
            // How to break Singleton nature of the class
            // 2. Cloning
            MySingleton2 myS2= (MySingleton2) myS.clone();
            myS2.display("Second object "+System.identityHashCode(myS2));
            // 2. Example below ****************************************************************
          }
}
class MySingleton2 implements Cloneable{
    private static volatile MySingleton2 instance=null;
    private MySingleton2(){
        if(instance!=null){
            //  throw new IllegalStateException("Error in creating Object");
        }
    }@Override
    protected Object clone() throws CloneNotSupportedException
    {
        throw new CloneNotSupportedException(); // Prevents from Cloning of Singleton class
        //super.clone();
    }
    public static MySingleton2 getinstance(){
        if(instance ==null){
            synchronized (MySingleton2.class){
                instance=new MySingleton2();}
        }
        return instance;
    }
    public void display(String s){
        System.out.println("display the value: "+s);
    }
}
