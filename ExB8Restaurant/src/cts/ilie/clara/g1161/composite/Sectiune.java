package cts.ilie.clara.g1161.composite;

import cts.ilie.clara.g1161.composite.IMeniu;

public class Sectiune implements IMeniu {
    private String denumire;
    private float pret;
    private boolean rece;

    public Sectiune(String denumire, float pret, boolean rece) {
        this.denumire = denumire;
        this.pret = pret;
        this.rece = rece;
    }

    @Override
    public String getNume() {
        return denumire;
    }

    @Override
    public void afisare() {
        System.out.println("nume: "+ denumire +" Pret: "+ pret+ " Este rece? "+rece);
    }
}
