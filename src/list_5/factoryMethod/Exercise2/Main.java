package list_5.factoryMethod.Exercise2;

public class Main {
    public static void main(String[] args) {
        VehicleFactory factory = new CarFactory();
        Vehicle v = factory.createVehicle();
        v.accelerate();
        v.brake();
    }

}
