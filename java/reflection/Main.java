package reflection;

import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        String os = args[0];
        Class c = Class.forName("reflection." + os + "Config");
        Config config = (Config) c.getDeclaredConstructor().newInstance();
        config.configure();
    }
}
