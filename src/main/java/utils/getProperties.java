package utils;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Properties;

public class getProperties {
    public static String getApplicationProperties(String varName) throws Exception {
        Properties properties = new Properties();
        properties.load(new InputStreamReader(new FileInputStream("/Users/evgenijsicilin/IdeaProjects/test_vk/src/test/resources/application.properties"), "UTF-8"));
        return properties.getProperty(varName);
    }
}
