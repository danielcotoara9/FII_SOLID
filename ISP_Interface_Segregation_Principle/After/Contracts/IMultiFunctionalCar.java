package ISP_Interface_Segregation_Principle.After.Contracts;

// not duplicate the code for fly drive behavior => use the existent interfaces
public interface IMultiFunctionalCar extends ICar, IAirplane
{

}
