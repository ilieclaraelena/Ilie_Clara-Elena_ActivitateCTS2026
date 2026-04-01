package cts.Ilie.Clara.g1161.builder.main;

import cts.Ilie.Clara.g1161.builder.ImaginaVirtuala;
import cts.Ilie.Clara.g1161.builder.ImagineVirtualaBuilder;

public class Main {
    public static void main(String[] args) {
        ImaginaVirtuala imagine1= new ImagineVirtualaBuilder().setAntivirus(true).setPachetOffice(false).setSistemOperare("windows").build();
        System.out.println("\n--- Configuratie1---");
        imagine1.afisareConfiguratie();

        ImaginaVirtuala imagine2 = new ImagineVirtualaBuilder().setAntivirus(false).setPachetOffice(true).setSistemOperare("Linux").build();

        System.out.println("\n--- Configuratie2 ---");
        imagine2.afisareConfiguratie();

    }
}
