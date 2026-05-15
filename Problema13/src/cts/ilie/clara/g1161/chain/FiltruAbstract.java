package cts.ilie.clara.g1161.chain;

import java.util.List;

// este clasa AHandler;
public abstract class FiltruAbstract {
    private FiltruAbstract filtruUrmator;

    // se paseaza resposabilitatea de la o componenta la alta
    public FiltruAbstract setFiltruUrmator(FiltruAbstract filtruUrmator) {
        this.filtruUrmator = filtruUrmator;
        return filtruUrmator;
    }
    public abstract List<IProdus> aplicaFiltru(List<IProdus> listaProduse, ICautare cautare);
    public List<IProdus> filtreareProduse(List<IProdus>produse, ICautare cautare){
        List<IProdus> listaFiltrata =aplicaFiltru(produse, cautare);
        if(filtruUrmator!=null){
            return filtruUrmator.filtreareProduse(listaFiltrata,cautare);

        }
        return listaFiltrata;
    }
}
