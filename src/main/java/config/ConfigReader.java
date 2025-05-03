package config;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
    private static Properties props;

    static {
        try {
            props = new Properties();
            FileInputStream fis = new FileInputStream("src/test/resources/config.properties");
            props.load(fis);
        } catch (Exception e) {
            throw new RuntimeException("Failed to load config file: " + e.getMessage());
        }
    }

    public static String get(String key) {
    	
        return props.getProperty(key);
    }
}
