package com.learning.corejava.InheritanceConcepts;

public class EnhancedVehicle extends ExistingVehicle{

    public static void main(String[] args){
        EnhancedVehicle en = new EnhancedVehicle();
        en.brakes();
        en.gears();
        en.engine();
        en.bodycolor();



    }

    public void bodycolor(){


        System.out.println("color is " +color);
    }
    public void engine(){

        System.out.println("engine is implemented");
    }


}
