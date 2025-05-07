package list_4.exercise3;

public class Main {
    public static void main(String[] args) {
        UniqueInstance a = UniqueInstance.getInstance();
        UniqueInstance b = UniqueInstance.getInstance();
        UniqueInstance c = UniqueInstance.getInstance();

        System.out.println("Same instance? " + (a == b));
        System.out.println("Total calls to getInstance: " + UniqueInstance.callCount);
    }
}
