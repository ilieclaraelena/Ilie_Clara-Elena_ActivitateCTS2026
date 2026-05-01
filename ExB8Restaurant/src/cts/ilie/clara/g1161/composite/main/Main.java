package cts.ilie.clara.g1161.composite.main;


import cts.ilie.clara.g1161.composite.MeniuComposite;
import cts.ilie.clara.g1161.composite.Sectiune;

public class Main {
    public static void main(String[] args) {
        Sectiune s1= new Sectiune("cola", 10, true);
        Sectiune s2= new Sectiune("tiramisu", 30, false);
        Sectiune s3= new Sectiune("cafea", 12, false);

        MeniuComposite meniu1=new MeniuComposite("bauturi");
        MeniuComposite meniu2=new MeniuComposite("desert");

        meniu1.adaugaSectiune(s1);
        meniu1.adaugaSectiune(s3);
        meniu2.adaugaSectiune(s2);

        meniu1.afisare();
        meniu2.afisare();

    }
}
