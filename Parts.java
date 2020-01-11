package computer;
import java.lang.Enum;

public class Parts {
    String[] cpu;
    String[] ram;
    String[] hdd;

    boolean qcpu;
    boolean qram;
    boolean qhdd;


    protected Parts(String[] cpu, String[] ram, String[] hdd, boolean qcpu, boolean qram, boolean qhdd) {
        this.cpu=cpu;
        this.ram=ram;
        this.hdd=hdd;
        this.qcpu=qcpu;
        this.qram=qram;
        this.qhdd=qhdd;
    }
}
