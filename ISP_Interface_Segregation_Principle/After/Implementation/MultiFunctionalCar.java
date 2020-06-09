package ISP_Interface_Segregation_Principle.After.Implementation;

import ISP_Interface_Segregation_Principle.After.Contracts.IMultiFunctionalCar;


// this class implement everything from the Interface
public class MultiFunctionalCar implements IMultiFunctionalCar
{
    // This can be a solution but we will not duplicate the code from Car and Airplane here ???
    public void Drive()
    {
        // code related to drive behavior
        System.out.println("Drive a multifunctional car");
    }

    public void Fly()
    {
        // code related to fly behavior
        System.out.println("Fly a multifunctional car");
    }
}
