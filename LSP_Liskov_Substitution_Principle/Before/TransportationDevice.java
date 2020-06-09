package LSP_Liskov_Substitution_Principle.Before;

import LSP_Liskov_Substitution_Principle.Common.Engine;

public class TransportationDevice {
    
    String name;
    Double speed;
    Engine Engine;

    String getName(){
        return name;
    }
    void setName(final String name) {
        this.name = name;
    }

    Double getSpeed() {
        return speed;
    }

    void setSpeed(final double speed) {
        this.speed = speed;
    }

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