package cts.ilie.clara.g1161.strategy;

public class MasinaSpalatRufeStrategy implements Electrocasnic{
    private String model;
    private boolean areDetergent;
    private ProgramSpalare programSpalare; //client

    public MasinaSpalatRufeStrategy(String model, boolean areDetergent) {
        this.model = model;
        this.areDetergent = areDetergent;
    }


    @Override
    public String getModel() {
        return model;
    }

    @Override
    public void pornesteProgram() {
        if(!areDetergent){
            System.out.println("Programul nu poate porni, nu exista detergent");
        }
        if(programSpalare==null){
            System.out.println("Programul trebuie setat pentru a fi pornit");
        }
        else {
            programSpalare.executaProgram();
        }

    }

    @Override
    public void seteazaProgram(ProgramSpalare programSpalare) {
        this.programSpalare=programSpalare;
        System.out.println("Program ales: "+ programSpalare.getnume());
    }

    @Override
    public void finalizareProgram() {
        System.out.println("Program finalizat pe masina de spalat: "+ model);
    }

    @Override
    public boolean verificaConditii() {
        return areDetergent;
    }
}
