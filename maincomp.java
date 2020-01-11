package computer;

public class maincomp {
    public static void main(String[] args) {
        String[] cpu=new String[]{String.valueOf(StandCpu.Xeon), String.valueOf(StandCpu.Elbrus)};
        String[] ram=new String[]{String.valueOf(StandDDR.DDR1), String.valueOf(StandDDR.DDR2)};
        String[] hdd=new String[]{String.valueOf(StandHDD.EDI), String.valueOf(StandHDD.SATA)};

        String[] pcpu=new String[]{String.valueOf(StandCpu.Zen), String.valueOf(StandCpu.Elbrus)};
        String[] pram=new String[]{String.valueOf(StandDDR.DDR1),String.valueOf(StandDDR.DDR2)};
        String[] phdd=new String[]{String.valueOf(StandHDD.SATA)};

        Computer pc=new Computer(cpu, ram, hdd);

        Parts parts=new Parts(pcpu, pram, phdd, true,false,true);
        pc.launch(parts);


    }

}
