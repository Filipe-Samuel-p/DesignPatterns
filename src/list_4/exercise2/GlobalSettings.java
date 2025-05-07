package list_4.exercise2;

import java.util.HashMap;
import java.util.Map;

public class GlobalSettings {
    private static GlobalSettings instance;
    private Map<String, String> settings;

    private GlobalSettings() {
        settings = new HashMap<>();
    }

    public static GlobalSettings getInstance() {
        if (instance == null) {
            instance = new GlobalSettings();
        }
        return instance;
    }

    public void set(String key, String value) {
        settings.put(key, value);
    }

    public String get(String key) {
        return settings.get(key);
    }

}

