package InstanceStaticLocalVariablesConcept;

public class Demo {
    String name;
    String address;
    static int i=0;
    static String city ;

    Demo(String name,String address){
        this.name = name;
        this.address= address;
      i++;
        System.out.println(i);
    }
    static{

        city = "Bangalore";

    }
    public void getAddress(){

        System.out.println(address);
    }
    public static void getCity(){
        System.out.println(city);

    }
    public static void main (String[] args){
        Demo obj1 = new Demo("uma","manikonda");
        Demo obj2 = new Demo("teja","hitechcity");
        obj1.getAddress();
        obj2.getAddress();
        obj1.address = "nanakramguda";
        System.out.println(obj1.address);
        Demo.i=7;
        System.out.println(i);
        Demo.getCity();


    }











}
