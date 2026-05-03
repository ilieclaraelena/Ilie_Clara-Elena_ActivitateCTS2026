package cts.ilie.clara.g1161.proxy;

public class MasinaSpalatProxy implements Electrocasnic {
    private MasinaSpalatRufe masinaSpalatRufe;
    private  boolean areApa;
    private boolean areDetergent;
    private boolean areBalsam;
    private boolean conditiiVerificate; // specifica pentru proxy

    public MasinaSpalatProxy(MasinaSpalatRufe masinaSpalatRufe, boolean areApa, boolean areDetergent, boolean areBalsam, boolean conditiiVerificate) {
        this.masinaSpalatRufe = masinaSpalatRufe;
        this.areApa = areApa;
        this.areDetergent = areDetergent;
        this.areBalsam = areBalsam;
        this.conditiiVerificate = conditiiVerificate;
    }

    @Override
    public String getModel() {
        return masinaSpalatRufe.getModel();
    }

    @Override
    public void pornesteProgram() {
        if(verificaConditii()){
        masinaSpalatRufe.pornesteProgram();
    }else{
            System.out.println("Conditii neindeplinite");
        }
    }

    @Override
    public void seteazaProgram(ProgramSpalare programSpalare) {
        masinaSpalatRufe.seteazaProgram(programSpalare);
    }

    @Override
    public void finalizareProgram() {
        masinaSpalatRufe.finalizareProgram();
    }

    @Override
    public boolean verificaConditii() {
        if(!areApa){
            return false;
        }
        if(conditiiVerificate){
            return areDetergent && areBalsam;
        }
        else {
            return areDetergent || areBalsam;

        }
    }
}
