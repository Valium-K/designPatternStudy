package dev.valium.design_pattern.strategy_pattern;

public class Person {

    // 전략
    private Transportation transportation;

    public Person(Transportation transportation) {
        this.transportation = transportation;
    }

    public void move() {
        transportation.move();
    }

    public void changeTo(Transportation transportation) {
        this.transportation = transportation;
    }

}
