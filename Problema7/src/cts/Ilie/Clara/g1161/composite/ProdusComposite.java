package cts.Ilie.Clara.g1161.composite;

import java.util.ArrayList;
import java.util.List;

public class ProdusComposite implements IProdus{
    private String denumire;
    private List<IProdus> listaProduse =new ArrayList<>();

    public ProdusComposite(String denumire) {
        this.denumire = denumire;
    }
    public void adaugaProdus(IProdus produs){
        listaProduse.add(produs);

    }
    public void stergeProdus(IProdus produs){
        listaProduse.remove(produs);
    }

    @Override
    public float getPret() {
        float suma=0;
        for(IProdus p:listaProduse){
            suma+=p.getPret();
        }
        return suma;
    }

    @Override
    public String getDenumireProdus() {
        return denumire;
    }

    @Override
    public float getValoareTVA(int procentTVA) {
        float pretTotal=getPret();
        return pretTotal-(pretTotal/(1+procentTVA/100.0f));
    }
}
