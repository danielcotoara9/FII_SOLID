package ISP_Interface_Segregation_Principle.After.Contracts;


public interface IMultiFunctionalCar extends ICar, IAirplane
{
    // Not duplicate the code for fly & drive behavior => use the existent interfaces
    // Pure example. Class extends all the interfaces that need 
}
