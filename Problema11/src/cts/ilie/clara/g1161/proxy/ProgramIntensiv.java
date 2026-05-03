package cts.ilie.clara.g1161.proxy;

public class ProgramIntensiv implements ProgramSpalare {
    @Override
    public String getnume() {
        return "program intensiv";
    }

    @Override
    public void executaProgram() {
        System.out.println("program intensiv 10 min");
    }

    @Override
    public int getDurata() {
        return 10;
    }
}
