package list_5.factoryMethod.Exercise2;

class CarFactory extends VehicleFactory {
    public Vehicle createVehicle() {
        return new Car();
    }
}
