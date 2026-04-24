package cts.ilie.clara.g1161.decorator;

import java.util.ArrayList;
import java.util.List;

public class CosCumparaturi implements ICosCumparaturi{
    private List<Produs> listaProduse= new ArrayList<>();
    public void adaugaProdus(Produs produs){
        listaProduse.add(produs);

    }
    @Override
    public double getTotal() {
        double total=0;
        for(Produs produs: listaProduse){
            total+= produs.getValoareProdus();
        }
        return total;
    }

    public List<Produs> getListaProduse() {
        return listaProduse;
    }
}
