package dev.valium.design_pattern.state_pattern.state;

import dev.valium.design_pattern.state_pattern.StateContext;

public class StateLowerCase implements StateLike {

    @Override
    public StateLike writeName(final String name) {
        System.out.println(name.toLowerCase());
        return new StateUpperCase();
    }
}