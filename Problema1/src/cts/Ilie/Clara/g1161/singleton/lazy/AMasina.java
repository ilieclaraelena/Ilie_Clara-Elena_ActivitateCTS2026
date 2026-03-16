package cts.Ilie.Clara.g1161.singleton.lazy;

public abstract class AMasina {
    private String nrInmatriculare;
    private double valoare;

    public AMasina(String nrInmatriculare, double valoare) {
        this.nrInmatriculare = nrInmatriculare;
        this.valoare = valoare;
    }

    public String getNrInmatriculare() {
        return nrInmatriculare;
    }

    public void setNrInmatriculare(String nrInmatriculare) {
        this.nrInmatriculare = nrInmatriculare;
    }

    public double getValoare() {
        return valoare;
    }

    public void setValoare(double valoare) {
        this.valoare = valoare;
    }

    @Override
    public String toString() {
        return "AMasina{" +
                "nrInmatriculare='" + nrInmatriculare + '\'' +
                ", valoare=" + valoare +
                '}';
    }
}
