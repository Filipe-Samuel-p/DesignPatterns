package list_7.commander.Exercise1;

class TurnOnTVCommand implements Command {
    private TV tv;

    public TurnOnTVCommand(TV tv) {
        this.tv = tv;
    }

    public void execute() {
        tv.turnOn();
    }
}
