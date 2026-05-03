package cts.ilie.clara.g1161.strategy;

public class ProgramNormal implements ProgramSpalare{

    @Override
    public String getnume() {
        return "program normal";
    }

    @Override
    public void executaProgram() {
        System.out.println("program normal 45 min");
    }

    @Override
    public int getDurata() {
        return 45;
    }
}
