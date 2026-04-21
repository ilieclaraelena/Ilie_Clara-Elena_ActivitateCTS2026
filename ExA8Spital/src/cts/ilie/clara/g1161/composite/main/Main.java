package cts.ilie.clara.g1161.composite.main;

import cts.ilie.clara.g1161.composite.DepartamentComposite;
import cts.ilie.clara.g1161.composite.ISectie;
import cts.ilie.clara.g1161.composite.Sectie;

public class Main {
    public static void main(String[] args) {
        ISectie s1= new Sectie("cardiologie", 3, true);
        ISectie s2= new Sectie("gastro", 2, true);

        DepartamentComposite departament1= new DepartamentComposite("interne");
        departament1.adaugaSectie(s1);
        departament1.adaugaSectie(s2);

        System.out.println(departament1.getDenumire());
        departament1.afisare();


    }
}
