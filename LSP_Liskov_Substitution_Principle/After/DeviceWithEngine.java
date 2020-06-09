package LSP_Liskov_Substitution_Principle.After;

import LSP_Liskov_Substitution_Principle.Common.*;

public class DeviceWithEngine extends TransportationDevice{

    Engine engine;

    Engine getEngine() {
        return Engine;
    }

    void setEngine(final Engine engine)
    {
        this.Engine = engine;
    }
    void startEngine()
    {
        //code to start the engine
    }
}