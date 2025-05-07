package list_4.exercise2;

public class Main {
    public static void main(String[] args) {
        GlobalSettings settings1 = GlobalSettings.getInstance();
        settings1.set("language", "English");
        settings1.set("theme", "dark");

        GlobalSettings settings2 = GlobalSettings.getInstance();
        System.out.println("Language: " + settings2.get("language"));
        System.out.println("Theme: " + settings2.get("theme"));
    }
}
