package dev.valium.design_pattern.state_pattern.state;

import dev.valium.design_pattern.state_pattern.StateContext;

public interface StateLike {
    StateLike writeName(String name);
}