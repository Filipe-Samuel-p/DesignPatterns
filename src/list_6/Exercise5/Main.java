package list_6.Exercise5;

public class Main {

    public static void main(String[] args) {
        CelsiusThermometer adapter = new FahrenheitToCelsiusAdapter(new FahrenheitThermometer());
        System.out.println("Temperature in Celsius: " + adapter.getTemperatureC());
    }

}
