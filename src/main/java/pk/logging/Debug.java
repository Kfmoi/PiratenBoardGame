package pk.logging;
import java.io.FileWriter;
import java.io.IOException;

public class Debug {
    public static void debug(String message) {
        try {
            FileWriter writer = new FileWriter("debug.txt", true);
            writer.write(message + "\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
