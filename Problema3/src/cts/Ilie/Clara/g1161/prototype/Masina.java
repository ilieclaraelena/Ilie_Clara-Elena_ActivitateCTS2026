package cts.Ilie.Clara.g1161.prototype;

public class Masina implements IMasina{
    private String model;
    private int anFabricatie;

    public Masina(String model, int anFabricatie) {
        this.model = model;
        this.anFabricatie = anFabricatie;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public int getAnFabricatie() {
        return anFabricatie;
    }

}
