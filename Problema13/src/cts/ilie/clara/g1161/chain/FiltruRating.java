package cts.ilie.clara.g1161.chain;

import java.util.ArrayList;
import java.util.List;

public class FiltruRating extends FiltruAbstract{
    @Override
    public List<IProdus> aplicaFiltru(List<IProdus> listaProduse, ICautare cautare) {
        if(!cautare.isFiltruRating()){
            return  listaProduse;
        }
        List<IProdus>listaFiltrata=new ArrayList<>();
        for (IProdus produs: listaProduse){
            if(produs.getRating()>= cautare.getRatingMinim()){
                listaFiltrata.add(produs);

            }
        }
        return  listaFiltrata;
    }
}
