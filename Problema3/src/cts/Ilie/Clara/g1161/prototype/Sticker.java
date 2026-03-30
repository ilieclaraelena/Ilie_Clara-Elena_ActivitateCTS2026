package cts.Ilie.Clara.g1161.prototype;

public class Sticker implements Cloneable{
    private String model;
    private int anFabricatie;
    private double latime;
    private double lungime;
    public Sticker(IMasina masina){
        this.model=masina.getModel();
        this.anFabricatie=masina.getAnFabricatie();
        this.latime=Math.random()*2;
        this.lungime=Math.random()*3;
    }

    @Override
    //deep copy
    public Sticker clone() throws CloneNotSupportedException {
        Sticker clone= (Sticker) super.clone();
        clone.model=this.model;
        clone.anFabricatie=this.anFabricatie;
        clone.latime=this.latime;
        clone.lungime=this.lungime;
        return clone;

    }

    @Override
    public String toString() {
        return "Sticker{" +
                "model='" + model + '\'' +
                ", anFabricatie=" + anFabricatie +
                ", latime=" + latime +
                ", lungime=" + lungime +
                '}';
    }
}
