package list_4.exercise1;

import java.io.FileWriter;
import java.io.IOException;

public class LogManager {
    private static LogManager instance;
    private FileWriter writer;

    private LogManager() {
        try {
            writer = new FileWriter("log.txt", true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static LogManager getInstance() {
        if (instance == null) {
            instance = new LogManager();
        }
        return instance;
    }

    public void log(String message) {
        try {
            writer.write(message + "\n");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
