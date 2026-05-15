package cts.ilie.clara.g1161.chain;

public class Produs implements IProdus{
    private String denumire;
    private double pret;
    private double rating;
    private int nrRecenzii;
    private int anLansare;

    public Produs(String denumire, double pret, double rating, int nrRecenzii, int anLansare) {
        this.denumire = denumire;
        this.pret = pret;
        this.rating = rating;
        this.nrRecenzii = nrRecenzii;
        this.anLansare = anLansare;
    }

    @Override
    public double getPret() {
        return pret;
    }

    @Override
    public String getDenumire() {
        return denumire;
    }

    @Override
    public double getRating() {
        return rating;
    }

    @Override
    public int getNrRecenzii() {
        return nrRecenzii ;
    }

    @Override
    public int getAnLansare() {
        return anLansare;
    }

    @Override
    public String toString() {
        return "Produs{" +
                "denumire='" + denumire + '\'' +
                ", pret=" + pret +
                ", rating=" + rating +
                ", nrRecenzii=" + nrRecenzii +
                ", anLansare=" + anLansare +
                '}';
    }
}
