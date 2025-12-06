package SuperANDThisKeywordConcepts;

public class ChildDemo extends ParentDemo {
    int a=6,b=7;
    String name="teja";
    public  ChildDemo(){
        super();
        System.out.println("child constructor");
    }
    public void getData(){
        System.out.println("child  method");
        System.out.println(a+b);
        System.out.println(name);
        System.out.println(super.name);
        super.getData();
    }
    public static void main(String[] args){
        ChildDemo cd = new ChildDemo();
        cd.getData();
}
}
