package cts.Ilie.Clara.g1161.factory.main;

import cts.Ilie.Clara.g1161.factory.AMasina;

import cts.Ilie.Clara.g1161.factory.MasinaFactory;

public class Main {
    public static void main(String[] args) throws Exception {
        AMasina m1= MasinaFactory.createAMasina("SUV", "DJ79", 7000);
        AMasina m2= MasinaFactory.createAMasina("SEDAN", "OT49", 8000);
        AMasina m3= MasinaFactory.createAMasina("VAN", "B29", 86000);
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);

    }
}
