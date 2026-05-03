package cts.ilie.clara.g1161.strategy.main;

import cts.ilie.clara.g1161.strategy.MasinaSpalatRufeStrategy;
import cts.ilie.clara.g1161.strategy.ProgramIntensiv;
import cts.ilie.clara.g1161.strategy.ProgramRapid;

public class Main {
    public static void main(String[] args) {
        MasinaSpalatRufeStrategy masina1= new MasinaSpalatRufeStrategy("Samsung", true);
        MasinaSpalatRufeStrategy masina2= new MasinaSpalatRufeStrategy("LG", true);
        masina1.seteazaProgram(new ProgramRapid());//obiect anonim
        masina1.pornesteProgram();
        masina1.finalizareProgram();
        masina1.seteazaProgram(new ProgramIntensiv());
        masina1.pornesteProgram();
        masina1.finalizareProgram();

    }
}
