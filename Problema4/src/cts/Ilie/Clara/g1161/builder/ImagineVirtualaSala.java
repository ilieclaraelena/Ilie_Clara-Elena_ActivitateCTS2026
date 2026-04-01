package cts.Ilie.Clara.g1161.builder;

public class ImagineVirtualaSala implements ImaginaVirtuala{
    private String sistemOperare;
    private boolean pachetOffice;
    private boolean antivirus;
    private boolean videoproiector;
    private  boolean tablaMarker;

    public ImagineVirtualaSala() {
        sistemOperare="";
        pachetOffice=false;
        antivirus=false;
        videoproiector=false;
        tablaMarker=false;
    }

    public ImagineVirtualaSala(String sistemOperare, boolean pachetOffice, boolean antivirus, boolean videoproiector, boolean tablaMarker) {
        this.sistemOperare = sistemOperare;
        this.pachetOffice = pachetOffice;
        this.antivirus = antivirus;
        this.videoproiector = videoproiector;
        this.tablaMarker = tablaMarker;
    }

    public void setSistemOperare(String sistemOperare) {
        this.sistemOperare = sistemOperare;
    }

    public void setPachetOffice(boolean pachetOffice) {
        this.pachetOffice = pachetOffice;
    }

    public void setAntivirus(boolean antivirus) {
        this.antivirus = antivirus;
    }

    public void setVideoproiector(boolean videoproiector) {
        this.videoproiector = videoproiector;
    }

    public void setTablaMarker(boolean tablaMarker) {
        this.tablaMarker = tablaMarker;
    }


    @Override
    public void afisareConfiguratie() {
        System.out.println("ImagineVirtualaSala{" +
                "sistemOperare='" + sistemOperare + '\'' +
                ", pachetOffice=" + pachetOffice +
                ", antivirus=" + antivirus +
                ", videoproiector=" + videoproiector +
                ", tablaMarker=" + tablaMarker +
                '}');
    }
}
