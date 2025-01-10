package app;

public class Car {

    public void start() {
        startElectricity();
        startCommand();
        startFuelSystem();
        System.out.println("------------------------------------------------" +
                "\n" + "Car is successfully activated.");
    }

    private void startElectricity() {
        System.out.println("Electric system of car started successfully.");
    }

    private void startCommand() {
        System.out.println("   Command system of car is initialized.");
    }

    private void startFuelSystem() {
        System.out.println("   Fuel system of car is activated successfully.");
    }
}
