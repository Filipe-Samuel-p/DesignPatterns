package list_6.Exercise5;

class FahrenheitToCelsiusAdapter implements CelsiusThermometer {
    private FahrenheitThermometer thermometer;

    public FahrenheitToCelsiusAdapter(FahrenheitThermometer thermometer) {
        this.thermometer = thermometer;
    }

    public double getTemperatureC() {
        double f = thermometer.getTemperatureF();
        return (f - 32) * 5 / 9;
    }
}