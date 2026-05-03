package cts.ilie.clara.g1161.proxy;

public class MasinaSpalatRufe implements Electrocasnic {
   private String model;
   private ProgramSpalare programSpalare;

    public MasinaSpalatRufe(String model) {
        this.model = model;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public void pornesteProgram() {
        System.out.println("Masina " + model + " porneste programul "+ programSpalare.getnume());
    }

    @Override
    public void seteazaProgram(ProgramSpalare programSpalare) {
            this.programSpalare=programSpalare;
            System.out.println("Program selectat: "+programSpalare.getnume());
    }

    @Override
    public void finalizareProgram() {
        System.out.println("Program finalizat pentru masina "+ model);
    }

    @Override
    public boolean verificaConditii() {
        return true;
    }
}
