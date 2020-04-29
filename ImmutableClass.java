final class ImmutableClass{
    private final String name;

    ImmutableClass(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public String subStringValue(String name,int start,int end){
        return name.substring(start,end+1);
    }

}
public class TestImmutable{
    public static void main(String[] args) {
        ImmutableClass imm = new ImmutableClass("Hello, this is java programming.");
        System.out.println(imm.getName()); // "Hello, this is java programming."
        System.out.println(imm.subStringValue("Hello, this is java programming.", 7, 10)); // o/p: this
    }
}
