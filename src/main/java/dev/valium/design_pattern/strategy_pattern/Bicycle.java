package dev.valium.design_pattern.strategy_pattern;

public class Bicycle implements Transportation {
    @Override
    public void move() {
        System.out.println("move by 자전거.");
    }
}
