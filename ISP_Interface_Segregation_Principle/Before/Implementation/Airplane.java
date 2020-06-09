package ISP_Interface_Segregation_Principle.Before.Implementation;

import ISP_Interface_Segregation_Principle.Before.Contracts.IVehicle;

public class Airplane implements IVehicle{

    // the Airplane class doesn't know how to drive. Since it's obligated to implement
    // everything from the interface will not do anything
    @Override
    public void Drive() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void Fly() {
        System.out.println("Fly an airplane");
    }
    
}