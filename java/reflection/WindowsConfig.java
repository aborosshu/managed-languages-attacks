package reflection;

public class WindowsConfig extends Config {

    @Override
    public void configure() {
        System.out.println("Loading configuration for Windows...");
        // do some configuration
    }

    @Override
    public Config newInstance() {
        return new WindowsConfig();
    }
}
