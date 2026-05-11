package cts.ilie.clara.g1161.observer.main;

import cts.ilie.clara.g1161.observer.Client;
import cts.ilie.clara.g1161.observer.Magazin;

public class Main {
    public static void main(String[] args) {
        Magazin magazin= new Magazin();
        Client client1= new Client("Ion");
        Client client2= new Client("Radu");

        magazin.abonareClient(client1);
        magazin.abonareClient(client2);
        magazin.modificaPret(100, "laptop");
        magazin.dezabonareClient(client2);
        magazin.modificaPret(200, "laptop");
    }
}
