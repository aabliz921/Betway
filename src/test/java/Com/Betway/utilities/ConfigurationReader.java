package Com.Betway.utilities;

import java.io.FileInputStream;
import java.util.Properties;

/*
* This class reads the configuration file
*/

public class ConfigurationReader {

    private static Properties properties;

    static {

        try{

            String path="configuration.properties";
            FileInputStream input = new FileInputStream(path);
            properties = new Properties();
            properties.load(input);

            input.close();

        }catch (Exception e){

            e.printStackTrace();
        }
    }

    public static String get(String keyName){

        return properties.getProperty(keyName);
    }


}
