package dev.valium.design_pattern.state_pattern;

public class Main {
    public static void main(String[] args) {
        final StateContext sc = new StateContext();

        sc.writeName("Monday");
        sc.writeName("Tuesday");
        sc.writeName("Wednesday");
        sc.writeName("Thursday");
        sc.writeName("Friday");
        sc.writeName("Saturday");
        sc.writeName("Sunday");

        StateContextUsingEnum scue = new StateContextUsingEnum();

        scue.writeName("Monday");
        scue.writeName("Tuesday");
        scue.writeName("Wednesday");
        scue.writeName("Thursday");
        scue.writeName("Friday");
        scue.writeName("Saturday");
        scue.writeName("Sunday");
    }
}
