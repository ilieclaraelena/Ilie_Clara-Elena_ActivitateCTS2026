package cts.ilie.clara.g1161.decorator;

public class Produs implements IProdus{
    private String denumire;
    private int cantitate;
    private double pret;

    public Produs(String denumire, int cantitate, double pret) {
        this.denumire = denumire;
        this.cantitate = cantitate;
        this.pret = pret;
    }

    @Override
    public void afisare() {
        System.out.println("Produs{" +
                "denumire='" + denumire + '\'' +
                ", cantitate=" + cantitate +
                ", pret=" + pret +
                '}');
    }
    public double getValoareProdus(){
        return pret*cantitate;
    }

    @Override
    public int getNrProduse() {
        return cantitate;
    }
}
