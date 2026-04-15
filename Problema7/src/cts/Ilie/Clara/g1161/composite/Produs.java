package cts.Ilie.Clara.g1161.composite;

public class Produs implements IProdus {
    private String denumire;
    private float pret;
    private boolean garantie;

    public Produs(String denumire, float pret, boolean garantie) {
        this.denumire = denumire;
        this.pret = pret;
        this.garantie = garantie;
    }


    @Override
    public float getPret() {
        return pret;
    }

    @Override
    public String getDenumireProdus() {
        return denumire;
    }

    @Override
    public float getValoareTVA(int procentTVA) {
        return pret * procentTVA/100;
    }
}
