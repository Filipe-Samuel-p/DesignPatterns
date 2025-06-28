package list_7.commander.Exercise1;

class TurnOffLightCommand implements Command {
    private Light light;

    public TurnOffLightCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.turnOff();
    }
}