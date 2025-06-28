package list_7.commander.Exercise1;

class TurnOffTVCommand implements Command {
    private TV tv;

    public TurnOffTVCommand(TV tv) {
        this.tv = tv;
    }

    public void execute() {
        tv.turnOff();
    }
}