package Overloading_Overriding_Concepts;

public class OverloadingConcept {


    public void getData(int a){
        System.out.println(a);
    }

    public void getData(String a){
        System.out.println(a);
    }

    public void getData(int a,int b){
        System.out.print(+a);
        System.out.print(+b);
    }
public static void main(String[] args){
    OverloadingConcept ol = new OverloadingConcept();

    ol.getData(2);
    ol.getData("uma");
    ol.getData(3,4);



}

}
