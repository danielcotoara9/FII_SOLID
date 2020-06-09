package LSP_Liskov_Substitution_Principle.Before;

public class Bicycle extends TransportationDevice {
    
    @Override
    void startEngine()
    {
        // problem -> A bicycle hasn't an Engine
    }
}