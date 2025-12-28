package com.learning.corejava.InterfaceConcepts;

public class AustralianTraffic implements CentralTraffic,ContinentalTraffic{


    public static void main(String args[]){

       CentralTraffic ct = new AustralianTraffic();
        ContinentalTraffic cot = new AustralianTraffic();
        AustralianTraffic at = new AustralianTraffic();
        ct.Green();
         ct.Red();
         ct.Yellow();
         cot.Train();
         at.walk();

         at.Red(); // then why to declare ct ?
         at.Train(); // then why to declare cot ?

    }

    @Override
    public void Green() {
       System.out.println("green");
    }

    @Override
    public void Red() {
        System.out.println("red");
    }

    @Override
    public void Yellow() {
        System.out.println("yellow");
    }

    @Override
    public void Train() {
        System.out.println("train");
    }

    public void walk(){
        System.out.println("walk");

    }
}
