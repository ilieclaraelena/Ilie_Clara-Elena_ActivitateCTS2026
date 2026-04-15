package cts.Ilie.Clara.g1161.composite.main;

import cts.Ilie.Clara.g1161.composite.IProdus;
import cts.Ilie.Clara.g1161.composite.Produs;
import cts.Ilie.Clara.g1161.composite.ProdusComposite;

public class Main {
    public static void main(String[] args) {
        IProdus p1= new Produs("paracetamol", 10, true);
        IProdus p2= new Produs("nurofen", 15, false);
        IProdus p3= new Produs("teraflu", 20, true);

        ProdusComposite cutie1= new ProdusComposite("cutie1");
        cutie1.adaugaProdus(p1);
        cutie1.adaugaProdus(p2);
        ProdusComposite cutie2= new ProdusComposite("cutie2");
        cutie2.adaugaProdus(p3);

        ProdusComposite bax= new ProdusComposite("bax");
        bax.adaugaProdus(cutie1);
        bax.adaugaProdus(cutie2);
        bax.adaugaProdus(new Produs("larofen" , 25, true));

        System.out.println(bax.getPret());
        System.out.println(bax.getValoareTVA(19));

    }
}
