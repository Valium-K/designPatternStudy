package dev.valium.design_pattern.state_pattern;

import dev.valium.design_pattern.state_pattern.state.StateLike;
import dev.valium.design_pattern.state_pattern.state.StateLowerCase;

public class StateContext {

    private StateLike myState;

    StateContext() {
        setState(new StateLowerCase());
    }

    public void setState(final StateLike newState) {
        myState = newState;
    }

    public void writeName(final String name) {
        setState(myState.writeName(name));
    }
}