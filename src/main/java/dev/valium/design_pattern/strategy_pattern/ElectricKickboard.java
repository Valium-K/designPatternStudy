package dev.valium.design_pattern.strategy_pattern;

public class ElectricKickboard implements Transportation {

    @Override
    public void move() {
        System.out.println("move by 전동킥보드.");
    }
}
