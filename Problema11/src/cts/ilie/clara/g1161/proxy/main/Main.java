package cts.ilie.clara.g1161.proxy.main;

import cts.ilie.clara.g1161.proxy.Electrocasnic;
import cts.ilie.clara.g1161.proxy.MasinaSpalatProxy;
import cts.ilie.clara.g1161.proxy.MasinaSpalatRufe;
import cts.ilie.clara.g1161.proxy.ProgramNormal;

public class Main {
    public static void main(String[] args) {
        MasinaSpalatRufe masina1= new MasinaSpalatRufe("Samsung");
        Electrocasnic masinaProxy1= new MasinaSpalatProxy(masina1, true, true, false, false);
        masinaProxy1.seteazaProgram(new ProgramNormal());
        masinaProxy1.pornesteProgram();
        System.out.println("--------------------------------------------");
        MasinaSpalatRufe masina2= new MasinaSpalatRufe("LG");
        Electrocasnic masinaProxy2= new MasinaSpalatProxy(masina2, true, true, false, true);
        masinaProxy2.seteazaProgram(new ProgramNormal());
        masinaProxy2.pornesteProgram();
        System.out.println("------------------");

        MasinaSpalatRufe masina3= new MasinaSpalatRufe("LG");
        Electrocasnic masinaProxy3= new MasinaSpalatProxy(masina3, true, false, false, false);
        masinaProxy3.seteazaProgram(new ProgramNormal());
        masinaProxy3.pornesteProgram();

        System.out.println("----------------------------");
        MasinaSpalatRufe masina4= new MasinaSpalatRufe("LG");
        Electrocasnic masinaProxy4= new MasinaSpalatProxy(masina4, true, true, true, true);
        masinaProxy4.seteazaProgram(new ProgramNormal());
        masinaProxy4.pornesteProgram();
    }
}
