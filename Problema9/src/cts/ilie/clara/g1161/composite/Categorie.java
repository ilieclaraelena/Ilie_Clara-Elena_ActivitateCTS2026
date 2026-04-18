package cts.ilie.clara.g1161.composite;

import java.util.ArrayList;
import java.util.List;

public class Categorie implements IProdus{
    private String denumire;
    private List<IProdus>listaProduse=new ArrayList<>();

    public Categorie(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public void afisare() {
        System.out.println("Categorie: "+ denumire+" Total produse: "+getNrProduse());
        for(IProdus p:listaProduse){
            p.afisare();
        }
    }

    @Override
    public int getNrProduse() {
        int total=0;
        for (IProdus p:listaProduse){
            total+=p.getNrProduse();
        }
        return total;
    }
    public void adauga(IProdus p){
        listaProduse.add(p);
    }

}
