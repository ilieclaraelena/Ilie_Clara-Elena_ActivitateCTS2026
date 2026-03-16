package cts.Ilie.Clara.g1161.singleton.lazy.main;

import cts.Ilie.Clara.g1161.singleton.lazy.AMasina;
import cts.Ilie.Clara.g1161.singleton.lazy.MasinaSport;
import cts.Ilie.Clara.g1161.singleton.lazy.Service;

public class Main {
    public static void main(String[] args) {
        Service service= Service.getInstance();
        Service service2= Service.getInstance();
        //verificam ca cele 2 referinte au aceasi adresa
        System.out.println(service==service2);
        AMasina m1= new MasinaSport("B102", 20000);
        AMasina m2= new MasinaSport("Ag302", 45000);
        service.intrareMasina(m1);
        service.intrareMasina(m2);

        service.iesireMasina();
        service.intrareMasina(m2);


    }
}
