package list_4.exercise1;

public class Main {
    public static void main(String[] args) {
        LogManager log1 = LogManager.getInstance();
        log1.log("Starting system...");

        LogManager log2 = LogManager.getInstance();
        log2.log("System running.");

        System.out.println("Same instance? " + (log1 == log2));
    }
}
