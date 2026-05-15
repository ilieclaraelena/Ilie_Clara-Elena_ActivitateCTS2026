package cts.ilie.clara.g1161.chain;

import java.util.ArrayList;
import java.util.List;

public class FiltruPret extends FiltruAbstract{

    @Override
    public List<IProdus> aplicaFiltru(List<IProdus> listaProduse, ICautare cautare) {
        if(!cautare.isFiltruPret()){
            return  listaProduse;
        }
        List<IProdus>listaFiltrata=new ArrayList<>();
        for (IProdus produs: listaProduse){
            if(produs.getPret()>= cautare.getPretMinim()&& produs.getPret()<=cautare.getPretMaxim()){
                listaFiltrata.add(produs);

            }
        }
        return  listaFiltrata;
    }
}
