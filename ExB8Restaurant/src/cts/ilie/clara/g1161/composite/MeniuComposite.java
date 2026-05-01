package cts.ilie.clara.g1161.composite;


import java.util.ArrayList;
import java.util.List;

public class MeniuComposite implements IMeniu {
    private String categorie;
    private List<IMeniu> listaMeniuri=new ArrayList<>();

    public MeniuComposite(String categorie) {
        this.categorie = categorie;
    }
    public void adaugaSectiune(IMeniu sectiune){
        listaMeniuri.add(sectiune);
    }
    @Override
    public String getNume() {
        return "";
    }

    @Override
    public void afisare() {
        System.out.println("Meniu "+ categorie);
        for(IMeniu m: listaMeniuri){
            m.afisare();
        }
    }
}
