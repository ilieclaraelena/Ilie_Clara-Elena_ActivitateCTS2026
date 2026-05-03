package cts.ilie.clara.g1161.proxy;

public class ProgramRapid implements ProgramSpalare {

    @Override
    public String getnume() {
        return "program rapid";
    }

    @Override
    public void executaProgram() {
        System.out.println("Program rapid 20 min");
    }

    @Override
    public int getDurata() {
        return 20;
    }
}
