package dev.valium.design_pattern.commend_pattern;

import dev.valium.design_pattern.commend_pattern.command.Command;
import dev.valium.design_pattern.commend_pattern.command.TurnOffLightCommand;
import dev.valium.design_pattern.commend_pattern.command.TurnOnLightCommand;
import dev.valium.design_pattern.commend_pattern.invoker.Switch;
import dev.valium.design_pattern.commend_pattern.receiver.Light;

/**
 * Client
 */
public class Main {
    public static void main(String[] args){

        Light light = new Light();
        Command switchUp = new TurnOnLightCommand(light);
        Command switchDown = new TurnOffLightCommand(light);

        Switch s = new Switch(switchUp,switchDown);

        s.flipUp();
        s.flipDown();
    }
}
