package cts.ilie.clara.g1161.composite;

public class Produs implements IProdus{
    private String denumire;
    private int stoc;

    public Produs(String denumire, int stoc) {
        this.denumire = denumire;
        this.stoc = stoc;
    }

    @Override
    public void afisare() {
        System.out.println("Produs: "+ denumire+" stoc: "+stoc);
    }

    @Override
    public int getNrProduse() {
        return stoc;
    }
}
