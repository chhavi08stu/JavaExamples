public class TestBreakingOfSingletonNatureUsingReflection {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException {
        MySingleton myS=MySingleton.getinstance();

        MySingleton myS2=null;
        myS.display("first object");

    // How to break Singleton nature of the class
        // 1. Reflection  2. Cloning  3. Deserialization

        // 1. Reflection example below ****************************************************************

        Constructor[] constructors=myS.getClass().getDeclaredConstructors();
        for(Constructor con: constructors){
            con.setAccessible(true);
            myS2= (MySingleton) con.newInstance();
            break;
        }
        // 1. END OF Reflection ****************************************************************
        myS2.display("Second object");
    }
}

class MySingleton{
    private static volatile MySingleton instance=null;
    private MySingleton(){
        if(instance!=null){
          //  throw new IllegalStateException("Error in creating Object");
        }
    }
    public static MySingleton getinstance(){
        if(instance ==null){
            synchronized (MySingleton.class){
            instance=new MySingleton();}
        }
        return instance;
    }
    public void display(String s){
        System.out.println("display the value: "+s);
    }
}
