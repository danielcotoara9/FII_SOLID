package ISP_Interface_Segregation_Principle.After.Implementation;

import ISP_Interface_Segregation_Principle.After.Contracts.IAirplane;

public class Airplane implements IAirplane {
    
    @Override
    public void Fly()
    {
        // code related to fly behavior
        System.out.println("Fly an airplane");
    }
}
