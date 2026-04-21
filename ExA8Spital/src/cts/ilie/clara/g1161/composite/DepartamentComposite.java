package cts.ilie.clara.g1161.composite;

import java.util.ArrayList;
import java.util.List;

public class DepartamentComposite implements ISectie{
    private String denumire;
    private List<ISectie> listaDepartamente=new ArrayList<>();

    public DepartamentComposite(String denumire) {
        this.denumire = denumire;
    }
    public void adaugaSectie(ISectie sectie){
        listaDepartamente.add(sectie);
    }

    @Override
    public String getDenumire() {
        return denumire;
    }

    @Override
    public Integer getEtaj() {
        return 0;
    }

    @Override
    public Boolean getAparate() {
        return null;
    }

    @Override
    public void afisare() {
        System.out.println("Departament: " + denumire);
        for (ISectie s : listaDepartamente) {
            s.afisare();
        }
    }

}
