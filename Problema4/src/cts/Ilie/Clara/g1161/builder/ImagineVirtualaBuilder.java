package cts.Ilie.Clara.g1161.builder;

public class ImagineVirtualaBuilder {
    private String sistemOperare;
    private boolean pachetOffice;
    private boolean antivirus;
    private boolean videoproiector;
    private  boolean tablaMarker;

    public ImagineVirtualaBuilder() {
        sistemOperare="";
        pachetOffice=false;
        antivirus=false;
        videoproiector=false;
        tablaMarker=false;
    }
    // daca build nu vine din interfata atunci clasa concreta implementeaza interfata
    // daca build vine atunci interfata se implementeaza in builder
    public ImagineVirtualaSala build(){
        return new ImagineVirtualaSala(sistemOperare, pachetOffice, antivirus, videoproiector, tablaMarker);

    }

    public ImagineVirtualaBuilder setSistemOperare(String sistemOperare) {
        this.sistemOperare = sistemOperare;
        return  this;
    }

    public ImagineVirtualaBuilder setPachetOffice(boolean pachetOffice) {
        this.pachetOffice = pachetOffice;
        return  this;
    }

    public ImagineVirtualaBuilder setAntivirus(boolean antivirus) {
        this.antivirus = antivirus;
        return  this;
    }

    public ImagineVirtualaBuilder setVideoproiector(boolean videoproiector) {
        this.videoproiector = videoproiector;
        return  this;
    }

    public ImagineVirtualaBuilder setTablaMarker(boolean tablaMarker) {
        this.tablaMarker = tablaMarker;
        return  this;
    }
}
