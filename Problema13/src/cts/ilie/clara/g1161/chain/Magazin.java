package cts.ilie.clara.g1161.chain;

import java.util.ArrayList;
import java.util.List;

public class Magazin implements IMagazin{
    private List<IProdus>produse= new ArrayList<>();
    private FiltruAbstract filtru;

    public Magazin() {
        FiltruPret filtruPret=new FiltruPret();
        FiltruRating filtruRating= new FiltruRating();
        filtruPret.setFiltruUrmator(filtruRating);
        filtru= filtruPret;

    }

    @Override
    public List<IProdus> getListaProduse() {
        return produse;
    }

    @Override
    public void afisareProduse(ICautare cautare) {
        List<IProdus> listaFiltrata= filtru.filtreareProduse(new ArrayList<>(produse), cautare);
        for(IProdus produs: listaFiltrata){
            System.out.println(produs);
        }
    }
    public void adaugaProdus(IProdus produs){
        produse.add(produs);

    }
}
