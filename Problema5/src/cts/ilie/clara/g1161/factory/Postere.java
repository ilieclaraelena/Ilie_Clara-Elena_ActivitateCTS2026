package cts.ilie.clara.g1161.factory;

public class Postere implements ProdusMarketing{
    private String nume;
    private String culoare;
    private float nr;

    public Postere(String nume, String culoare, float nr) {
        this.nume = nume;
        this.culoare = culoare;
        this.nr = nr;
    }


    @Override
    public String toString() {
        return "Postere{" +
                "nume='" + nume + '\'' +
                ", culoare='" + culoare + '\'' +
                ", nr=" + nr +
                '}';
    }
}
