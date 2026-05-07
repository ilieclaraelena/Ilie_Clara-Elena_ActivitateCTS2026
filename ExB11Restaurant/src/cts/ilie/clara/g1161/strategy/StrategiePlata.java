package cts.ilie.clara.g1161.strategy;

import cts.ilie.clara.g1161.strategy.ModPlata;

public class StrategiePlata {
    private String nume;
    private ModPlata modPlata;// nu se face constructor

    public StrategiePlata(String nume) {
        this.nume = nume;
    }
    public void plateste(double sumaDePlata){
        this.modPlata.plateste(nume, sumaDePlata);
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public ModPlata getModPlata() {
        return modPlata;
    }

    public void setModPlata(ModPlata modPlata) {
        this.modPlata = modPlata;
    }
}
