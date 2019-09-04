package objecthijacking;

public class Malicious extends Secret implements Cloneable {

    protected Malicious(String a) {
        super(a);
    }

    @Override
    public Malicious clone() {
        Malicious s = null;
        try {
            s = (Malicious) super.clone();
        } catch (Exception e) {
            System.out.println("not cloneable");
        }
        return s;
    }

    public static void main(String[] args) {
        Malicious ms1 = new Malicious("this is my secret");
        Malicious ms2 = ms1.clone();
        ms1.printSecret();
        ms2.delete();
        ms1.printSecret();
    }
}
