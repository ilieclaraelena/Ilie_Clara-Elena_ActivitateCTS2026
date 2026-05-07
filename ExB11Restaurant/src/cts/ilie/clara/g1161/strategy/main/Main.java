package cts.ilie.clara.g1161.strategy.main;

import cts.ilie.clara.g1161.strategy.Card;
import cts.ilie.clara.g1161.strategy.Cash;
import cts.ilie.clara.g1161.strategy.StrategiePlata;

public class Main {
    public static void main(String[] args) {
        StrategiePlata strategie1= new StrategiePlata("Mihai");
        StrategiePlata strategie2= new StrategiePlata("Radu");
        strategie1.setModPlata(new Card());

        strategie1.plateste(300);

        strategie2.setModPlata(new Cash());
        strategie2.plateste(50);
    }
}
