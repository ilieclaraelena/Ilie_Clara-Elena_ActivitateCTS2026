package cts.ilie.clara.g1161.observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Magazin implements IMagazin{
    private List<IClient > clienti = new ArrayList<>();
    private Map<String , Double> catalogProduse= new HashMap<>();

    public void abonareClient(IClient client){
        clienti.add(client);

    }
    public void dezabonareClient(IClient client){
        clienti.remove(client);
    }
    @Override
    public void modificaPret(double pretNou, String denumireProdus) {
        catalogProduse.put(denumireProdus, pretNou);
        for(IClient client: clienti){
            client.notifica("Pretul produsului "+ denumireProdus+" a fost modificat la "+ pretNou);
        }
    }

}
