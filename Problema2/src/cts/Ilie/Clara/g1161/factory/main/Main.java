package cts.Ilie.Clara.g1161.factory.main;

import cts.Ilie.Clara.g1161.factory.ProdusFactory;
import cts.Ilie.Clara.g1161.factory.ProdusGeneric;
import cts.Ilie.Clara.g1161.factory.TipProdus;

public class Main {
    public static void main(String[] args) throws Exception {
        ProdusGeneric produs1= ProdusFactory.createProduct("bio", "lapte", 20,true);
        ProdusGeneric produs2=ProdusFactory.createProduct("perisabil", "peste", 20,true);
        ProdusGeneric produs3=ProdusFactory.createProduct("electronic", "tv", 30,true);
        System.out.println(produs1.getNumeProdus());
        System.out.println(produs1);
        System.out.println(produs2);
        System.out.println(produs3);
        ProdusGeneric produs4=ProdusFactory.createProductcuEnum(TipProdus.ELECTRONIC, "tv", 30,true);
        System.out.println(produs4);
    }
}
