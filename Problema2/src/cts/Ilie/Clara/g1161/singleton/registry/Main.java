package cts.Ilie.Clara.g1161.singleton.registry;


public class Main {
    public static void main(String[] args) throws Exception {
        ProdusGeneric produs1 = new ProdusBio("lapte", 20, false);
        ProdusGeneric produs2 = new ProdusPerisabil("peste", 40, true);
        ProdusGeneric produs3 = new ProdusElectronic("tv", 20, false);

        ProdusRegistry.registry(produs1.getNumeProdus(), produs1);
        ProdusRegistry.registry(produs2.getNumeProdus(), produs2);
        ProdusRegistry.registry(produs3.getNumeProdus(), produs3);

        ProdusGeneric p1=ProdusRegistry.getProdus("lapte");
        System.out.println(p1);
    }
    }

