package cts.ilie.clara.g1161.chain.main;

import cts.ilie.clara.g1161.chain.*;

public class Main {
    public static void main(String[] args) {
        Magazin magazin=new Magazin();
        IProdus produs1= new Produs("Iphone17", 6000, 6, 1000, 2025);
        IProdus produs2= new Produs("Laptop", 4000, 7, 1000, 2025);
        IProdus produs3= new Produs("Tableta", 8000, 9, 1000, 2025);
        magazin.adaugaProdus(produs1);
        magazin.adaugaProdus(produs2);
        magazin.adaugaProdus(produs3);

        CriteriiCautare criteriiCautareClient1= new CriteriiCautare();
        criteriiCautareClient1.setFiltruPret(6000, 10000);
        criteriiCautareClient1.setFiltruRating(8);
        Client client1=new Client("Andrei", criteriiCautareClient1);
        magazin.afisareProduse(client1.getCautare());
    }
}
