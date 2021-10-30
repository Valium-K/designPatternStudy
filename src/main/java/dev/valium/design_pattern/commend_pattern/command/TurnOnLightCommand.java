package dev.valium.design_pattern.commend_pattern.command;

import dev.valium.design_pattern.commend_pattern.receiver.Light;

/**
 * Command
 */
public class TurnOnLightCommand implements Command{
    private final Light theLight;

    public TurnOnLightCommand(Light light){
        this.theLight = light;
    }

    public void execute(){
        theLight.turnOn();
    }
}