package cts.Ilie.Clara.g1161.composite.main;

import cts.Ilie.Clara.g1161.composite.Cazare;
import cts.Ilie.Clara.g1161.composite.PachetTuristic;
import cts.Ilie.Clara.g1161.composite.Transport;
import cts.Ilie.Clara.g1161.composite.TravelItem;

public class Main {
    public static void main(String[] args) {
        TravelItem c1= new Cazare("hotel", 300);
        TravelItem t1= new Transport("autocar", 600);
        PachetTuristic pachet1= new PachetTuristic("sejur");
        pachet1.adaugaItem(c1);
        pachet1.adaugaItem(t1);
        TravelItem c2= new Cazare("pensiune", 200);
        TravelItem t2= new Transport("avion", 690);
        PachetTuristic pachet2= new PachetTuristic("vacanta1");
        pachet2.adaugaItem(pachet1);
        pachet2.adaugaItem(t2);
        pachet2.adaugaItem(c2);

        pachet2.adaugaItem(new Cazare("motel", 150));
        System.out.println(pachet1.getPret());
        System.out.println(pachet2.getPret());
        pachet2.stergeItem(pachet1);
        Cazare c3=new Cazare("hotelNou", 900);
        pachet2.adaugaItem(c3);
        System.out.println(pachet2.getPret());
    }
}
