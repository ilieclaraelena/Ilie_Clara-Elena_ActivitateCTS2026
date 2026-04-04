package cts.ilie.clara.g1161.factory;

public class Stikere implements ProdusMarketing {
    private String nume;
    private String culoare;
    private float nr;

    public Stikere(String nume, String culoare, float nr) {
        this.nume = nume;
        this.culoare = culoare;
        this.nr = nr;
    }

    @Override
    public String toString() {
        return "Stikere{" +
                "nume='" + nume + '\'' +
                ", culoare='" + culoare + '\'' +
                ", nr=" + nr +
                '}';
    }
}
