package cts.ilie.clara.g1161.composite;
import cts.ilie.clara.g1161.composite.ISectie;

public class Sectie implements ISectie {
    private String denumire;
    private int etaj;
    private boolean aparate;

    public Sectie(String denumire, int etaj, boolean aparate) {
        this.denumire = denumire;
        this.etaj = etaj;
        this.aparate = aparate;
    }

    @Override
    public String getDenumire() {
        return denumire;
    }

    @Override
    public Integer getEtaj() {
        return etaj;
    }

    @Override
    public Boolean getAparate() {
        return aparate;
    }

    @Override
    public void afisare() {
        System.out.println("Sectie: " + denumire + " Etaj: " + etaj +" Are aparate: "+ aparate);
    }


}
