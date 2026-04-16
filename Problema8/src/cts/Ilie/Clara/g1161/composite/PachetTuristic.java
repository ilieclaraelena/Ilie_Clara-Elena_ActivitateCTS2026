package cts.Ilie.Clara.g1161.composite;

import cts.Ilie.Clara.g1161.composite.TravelItem;

import java.util.ArrayList;
import java.util.List;

public class PachetTuristic implements TravelItem {
    private String denumire;
    private List<TravelItem >items=new ArrayList<>();

    public PachetTuristic(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public float getPret() {
        float suma =0;
        for(TravelItem item: items){
            suma+=item.getPret();
        }
        return suma;
    }

    @Override
    public void adaugaItem(TravelItem travelItem) {
        items.add(travelItem);
    }

    @Override
    public void stergeItem(TravelItem travelItem) {
        items.remove(travelItem);
    }
}
