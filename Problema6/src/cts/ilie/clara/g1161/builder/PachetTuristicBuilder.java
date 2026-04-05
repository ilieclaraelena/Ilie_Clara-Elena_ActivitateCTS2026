package cts.ilie.clara.g1161.builder;


public class PachetTuristicBuilder implements AbstractHolidayPackage {
    private boolean transport;
    private boolean cazare;
    private boolean activitatiExtra;

    public PachetTuristicBuilder() {
        transport=false;
        cazare=false;
        activitatiExtra=false;
    }


    @Override
    public PachetTuristic build() {
        return new PachetTuristic(transport, cazare, activitatiExtra);
    }

    public PachetTuristicBuilder setTransport(boolean transport) {
        this.transport = transport;
        return this;
    }

    public PachetTuristicBuilder setCazare(boolean cazare) {
        this.cazare = cazare;
        return this;
    }

    public PachetTuristicBuilder  setActivitatiExtra(boolean activitatiExtra) {
        this.activitatiExtra = activitatiExtra;
        return this;
    }
}
