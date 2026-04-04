package cts.ilie.clara.g1161.factory.main;

import cts.ilie.clara.g1161.factory.ProdusFactory;
import cts.ilie.clara.g1161.factory.ProdusMarketing;

public class Main {
    public static void main(String[] args) throws Exception {
        ProdusMarketing p1= ProdusFactory.creeareProdusMarketing("Flyere", "Campanie", "galben", 25);
        ProdusMarketing p2= ProdusFactory.creeareProdusMarketing("Postere", "Angajare", "verde", 63);
        ProdusMarketing p3= ProdusFactory.creeareProdusMarketing("Stikere", "workshop", "galben", 45);
        ProdusMarketing p4= ProdusFactory.creeareProdusMarketing("Stikere", "conferinta ", "rosu",45);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
    }
}
