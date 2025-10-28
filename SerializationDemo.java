import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Config implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private int volume;
    private int brightness;
    private transient String wifiPassword;

    public Config(int volume, int brightness, String wifiPassword) {
        this.volume = volume;
        this.brightness = brightness;
        this.wifiPassword = wifiPassword;
    }

    public void printSettings() {
        System.out.println("Volume: " + volume);
        System.out.println("Brightness: " + brightness);
        System.out.println("WiFi Password: " + wifiPassword);
    }
}

public class SerializationDemo {

    private static final String FILENAME = "config.ser";

    public static void main(String[] args) {
        serializeConfig();
        deserializeConfig();
    }

    private static void serializeConfig() {
        Config myConfig = new Config(80, 95, "MySecretPassword123");
        
        System.out.println("Serializing this object:");
        myConfig.printSettings();

        try (FileOutputStream fileOut = new FileOutputStream(FILENAME);
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(myConfig);
            System.out.println("\nSuccessfully serialized config to " + FILENAME);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void deserializeConfig() {
        Config loadedConfig = null;

        try (FileInputStream fileIn = new FileInputStream(FILENAME);
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            loadedConfig = (Config) in.readObject();
            System.out.println("\nSuccessfully deserialized config from " + FILENAME);
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }

        System.out.println("\nDeserialized object:");
        if (loadedConfig != null) {
            loadedConfig.printSettings();
        }
    }
}
