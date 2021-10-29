package dev.valium.design_pattern.strategy_pattern;

public class Main {
    public static void main(String[] args) {
        Person person = new Person(new ElectricKickboard());
        person.move();

        person.changeTo(new Bicycle());
        person.move();
    }
}
