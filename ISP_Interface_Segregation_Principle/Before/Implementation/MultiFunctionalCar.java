package ISP_Interface_Segregation_Principle.Before.Implementation;

import ISP_Interface_Segregation_Principle.Before.Contracts.IVehicle;

public class MultiFunctionalCar implements IVehicle {

    @Override
    public void Drive()
    {
        // code related to drive behavior
        System.out.println("Drive a multifunctional car");
    }

    @Override
    public void Fly() {
        // code related to fly behavior
        System.out.println("Fly a multifunctional car");
    }
    
}