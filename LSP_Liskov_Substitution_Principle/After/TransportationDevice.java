package LSP_Liskov_Substitution_Principle.After;

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
}