package computer;

public class Computer {
    String[] cpu;
    String[] ram;
    String[] hdd;


    public Computer(String[] sCpu, String[] sRam, String[] sHdd) {
        this.cpu=sCpu;
        this.ram=sRam;
        this.hdd=sHdd;
    }

    public void launch(Parts parts) {
        int nCompat=0;
        int nComputer=this.cpu.length;
        for (String i : this.cpu)
            for (String j : parts.cpu)
                if (i == j)
                    nCompat++;

        int nCompat1=0;
        int nComputer1=this.ram.length;
        for (String i : this.ram)
            for (String j : parts.ram)
                if (i == j)
                    nCompat1++;

        int nCompat2=0;
        int nComputer2=this.hdd.length;
        for (String i : this.hdd)
            for (String j : parts.hdd)
                if (i == j)
                    nCompat2++;

        if (nCompat>=1&&nCompat1>=1&&nCompat2>=1)
        {
            System.out.println("Compatible");

            if (parts.qcpu&&parts.qram&&parts.qhdd)
                System.out.println("Works");
            else
                System.out.println("System failure");
        }
        else
            System.out.println("Incompatible");

    }



}