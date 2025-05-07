package list_4.exercise3;

public class UniqueInstance {
    private static UniqueInstance instance;
    public static int callCount = 0;

    private UniqueInstance() {}

    public static UniqueInstance getInstance() {
        callCount++;
        if (instance == null) {
            instance = new UniqueInstance();
        }
        return instance;
    }

}
