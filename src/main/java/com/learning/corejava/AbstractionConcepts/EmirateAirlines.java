package com.learning.corejava.AbstractionConcepts;

public class EmirateAirlines extends ParentAircraft{

    public static void main(String[] args){

        EmirateAirlines e = new EmirateAirlines();
        e.engine();
        e.safetyGuidelines();
        e.bodyColor();
       // ParentAircraft p = new ParentAircraft(); -- not allowed to instantiate an abstract class
    }

    @Override
    public void bodyColor() {
        System.out.println("color of the aircraft body is red");
    }
}
