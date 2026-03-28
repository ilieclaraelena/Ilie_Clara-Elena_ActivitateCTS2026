package cts.Ilie.Clara.g1161.factory;

public class ProdusFactory {
    public static ProdusGeneric createProduct(String tipProdus, String nume, float pret, boolean garantie) throws Exception {
        switch (tipProdus){
            case"bio":
                return new ProdusBio(nume, pret, garantie);
            case "perisabil":
                return new ProdusPerisabil(nume, pret, garantie);
            case "electronic":
                return new ProdusElectronic(nume, pret, garantie);
            default: throw new Exception("Tip invalid");
        }

    }
    public static ProdusGeneric createProductcuEnum(TipProdus tipProdus, String nume, float pret, boolean garantie) throws Exception {
        switch (tipProdus){
            case BIO:
                return new ProdusBio(nume, pret, garantie);
            case PERISABIL:
                return new ProdusPerisabil(nume, pret, garantie);
            case ELECTRONIC:
                return new ProdusElectronic(nume, pret, garantie);
            default: throw new Exception("Tip invalid");
        }

    }

}
