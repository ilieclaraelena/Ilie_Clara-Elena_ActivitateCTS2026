package cts.ilie.clara.g1161.singleton.lazy.main;

import cts.ilie.clara.g1161.singleton.lazy.Banner;

public class Main {
    public static void main(String[] args) {
        Banner banner1= Banner.getInstance("Show");
        Banner banner2= Banner.getInstance("Lansare");
        System.out.println(banner1==banner2);
        System.out.println(banner1.getNumeProdus());
    }
}
