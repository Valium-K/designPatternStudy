package dev.valium.design_pattern.commend_pattern.invoker;

import dev.valium.design_pattern.commend_pattern.command.Command;

/**
 * Invoker
 */
public class Switch {

    // 객체의 형태로 캡슐화된 요청을 가지고 있는다.
    private final Command flipUpCommand;
    private final Command flipDownCommand;

    public Switch(Command flipUpCmd, Command flipDownCmd){
        this.flipUpCommand = flipUpCmd;
        this.flipDownCommand = flipDownCmd;
    }

    public void flipUp(){
        flipUpCommand.execute();
    }
    public void flipDown(){
        flipDownCommand.execute();
    }
}
