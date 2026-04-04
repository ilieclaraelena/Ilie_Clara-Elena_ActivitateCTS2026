package cts.ilie.clara.g1161.factory;

public class Flyere implements ProdusMarketing{
    private String nume;
    private String culoare;
    private float nr;

    public Flyere(String nume, String culoare, float nr) {
        this.nume = nume;
        this.culoare = culoare;
        this.nr = nr;
    }


    @Override
    public String toString() {
        return "Flyere{" +
                "nume='" + nume + '\'' +
                ", culoare='" + culoare + '\'' +
                ", nr=" + nr +
                '}';
    }
}
