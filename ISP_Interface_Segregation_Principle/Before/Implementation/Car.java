package ISP_Interface_Segregation_Principle.Before.Implementation;

import ISP_Interface_Segregation_Principle.Before.Contracts.IVehicle;

public class Car implements IVehicle{

    @Override
    public void Drive() {
         // code related to drive behavior
        System.out.println("Drive a care");
    }

    // the simple car doesn't know how to fly so will since it's obligated to implement
    // everything from the interface will not do anything
    @Override
    public void Fly() {
        throw new UnsupportedOperationException();
    }
    
}