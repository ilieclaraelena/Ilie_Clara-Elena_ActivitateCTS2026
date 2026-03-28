package cts.Ilie.Clara.g1161.singleton.registry;

public class ProdusBio implements ProdusGeneric {
    private String nume;
    private float pret;
    private boolean garantie;

    public ProdusBio(String nume, float pret, boolean garantie) {
        this.nume = nume;
        this.pret = pret;
        this.garantie = garantie;
    }

    @Override
    public String getNumeProdus() {
        return nume;
    }

    @Override
    public String toString() {
        return "ProdusBiol{" +
                "nume='" + nume + '\'' +
                ", pret=" + pret +
                ", garantie=" + garantie +
                '}';
    }

}
