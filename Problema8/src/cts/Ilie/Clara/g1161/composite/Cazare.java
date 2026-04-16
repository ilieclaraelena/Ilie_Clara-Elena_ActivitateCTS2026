package cts.Ilie.Clara.g1161.composite;

public class Cazare implements TravelItem {

    private String tip;
    private float pret;

    public Cazare(String tip, float pret) {
        this.tip = tip;
        this.pret = pret;
    }

    @Override
    public float getPret() {
        return pret;
    }

    @Override
    public void adaugaItem(TravelItem travelItem) {
        throw new TravelItemException("Eroare! Nu se poate adauga");
    }

    @Override
    public void stergeItem(TravelItem travelItem) {
        throw new TravelItemException("Eroare! Nu se poate sterge");
    }
}
