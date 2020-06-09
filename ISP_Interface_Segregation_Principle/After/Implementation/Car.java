package ISP_Interface_Segregation_Principle.After.Implementation;

import ISP_Interface_Segregation_Principle.After.Contracts.ICar;

public class Car implements ICar {
    public void Drive()
    {
        // code related to drive behavior
        System.out.println("Drive a car");
    }
}


