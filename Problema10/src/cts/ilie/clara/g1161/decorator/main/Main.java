package cts.ilie.clara.g1161.decorator.main;

import cts.ilie.clara.g1161.decorator.*;

public class Main {
    public static void main(String[] args) {
        IMagazin magazin= new MagazinDecorator(new Magazin());
        IClient client1= new Client("Ana", "Bucuresti", "ana@gmail.com");
        IClient client2= new Client("Radu", "Cluj", "radu@gmail.com");
        IClient client3= new Client("Ana", "Bucuresti", "ana@gmail.com");

        Produs produs1= new Produs("laptop", 10, 1000);
        Produs produs2= new Produs("telefon", 40, 500);
        Produs produs3= new Produs("tableta", 20, 1040);

        CosCumparaturi cos1Client1= new CosCumparaturi();
        cos1Client1.adaugaProdus(produs1);
        cos1Client1.adaugaProdus(produs2);
        System.out.println(magazin.getTotal(cos1Client1,client1));

        System.out.println(magazin.getTotal(cos1Client1,client1));
    }
}
