package reflection;

public class MaliciousConfig extends Config {

    @Override
    public void configure() {
        System.out.println("Executing malicious code...");
        // executing malicious code...
    }

    @Override
    public Config newInstance() {
        return new MaliciousConfig();
    }
}
