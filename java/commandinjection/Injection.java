package commandinjection;

class Injection {

    public static void main(String[] args) throws Exception {
        String command = args[0];
        Runtime rt = Runtime.getRuntime();
        Process proc = rt.exec(command);
        int result = proc.waitFor();
    }
}
