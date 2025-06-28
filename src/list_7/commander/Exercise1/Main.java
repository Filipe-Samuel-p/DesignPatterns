package list_7.commander.Exercise1;

public class Main {

    public static void main(String[] args) {
        System.out.println("=== Exercise 1: Basic Commands ===");

        Light light = new Light();
        TV tv = new TV();

        Command turnOnLight = new TurnOnLightCommand(light);
        Command turnOffLight = new TurnOffLightCommand(light);
        Command turnOnTV = new TurnOnTVCommand(tv);
        Command turnOffTV = new TurnOffTVCommand(tv);

        System.out.println("Executing commands:");
        turnOnLight.execute();
        turnOnTV.execute();
        turnOffLight.execute();
        turnOffTV.execute();
    }

}
