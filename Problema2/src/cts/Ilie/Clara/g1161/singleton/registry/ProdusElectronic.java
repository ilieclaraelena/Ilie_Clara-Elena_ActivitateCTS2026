package cts.Ilie.Clara.g1161.singleton.registry;

public class ProdusElectronic implements ProdusGeneric {
    private String nume;
    private float pret;
    private boolean garantie;

    public ProdusElectronic(String nume, float pret, boolean garantie) {
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
        return "ProdusElectonic{" +
                "nume='" + nume + '\'' +
                ", pret=" + pret +
                ", garantie=" + garantie +
                '}';
    }
}
