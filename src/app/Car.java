package app;

public class Car {

    public void start() {
        startElectricity();
        startCommand();
        startFuelSystem();
        System.out.println("------------------------------------------------" +
                "\n" + "Car is successfully activated.");
    }
}
