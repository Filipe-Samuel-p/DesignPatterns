package list_7.commander.Exercise1;

class TV {
    private boolean isOn = false;

    public void turnOn() {
        isOn = true;
        System.out.println("TV is ON");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("TV is OFF");
    }
}