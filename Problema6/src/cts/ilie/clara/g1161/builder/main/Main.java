package cts.ilie.clara.g1161.builder.main;

import cts.ilie.clara.g1161.builder.PachetTuristic;
import cts.ilie.clara.g1161.builder.PachetTuristicBuilder;

public class Main {
    public static void main(String[] args) {
        PachetTuristic pachet1=new PachetTuristicBuilder().setTransport(true).setCazare(true).setActivitatiExtra(false).build();
        System.out.println(pachet1);
    }
}
