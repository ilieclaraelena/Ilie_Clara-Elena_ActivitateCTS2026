package cts.ilie.clara.g1161.builder;

public class PachetTuristic{
    private boolean transport;
    private boolean cazare;
    private boolean activitatiExtra;

    public PachetTuristic() {
        transport=false;
        cazare=false;
        activitatiExtra=false;
    }

    public PachetTuristic(boolean transport, boolean cazare, boolean activitatiExtra) {
        this.transport = transport;
        this.cazare = cazare;
        this.activitatiExtra = activitatiExtra;
    }

    public void setTransport(boolean transport) {
        this.transport = transport;
    }

    public void setCazare(boolean cazare) {
        this.cazare = cazare;
    }

    public void setActivitatiExtra(boolean activitatiExtra) {
        this.activitatiExtra = activitatiExtra;
    }

    @Override
    public String toString() {
        return "PachetTuristic{" +
                "transport=" + transport +
                ", cazare=" + cazare +
                ", activitatiExtra=" + activitatiExtra +
                '}';
    }
}
