package cts.ilie.clara.g1161.composite.main;

import cts.ilie.clara.g1161.composite.Categorie;
import cts.ilie.clara.g1161.composite.IProdus;
import cts.ilie.clara.g1161.composite.Produs;

public class Main {
    public static void main(String[] args) {
        IProdus p1= new Produs("laptop", 10);
        IProdus p2= new Produs("telefon", 50);
        IProdus p3= new Produs("mouse", 30);

        Categorie c1= new Categorie("electronice");
        c1.adauga(p1);
        c1.adauga(p2);

        Categorie c2=new Categorie("electronice noi");
        c2.adauga(p3);
        c2.adauga(c1);
        c2.afisare();
    }
}
