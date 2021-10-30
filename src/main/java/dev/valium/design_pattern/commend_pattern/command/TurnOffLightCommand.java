package dev.valium.design_pattern.commend_pattern.command;

import dev.valium.design_pattern.commend_pattern.receiver.Light;

/**
 * Command
 */
public class TurnOffLightCommand implements Command{
    private final Light theLight;

    public TurnOffLightCommand(Light light){
        this.theLight = light;
    }

    public void execute(){
        theLight.turnOff();
    }
}