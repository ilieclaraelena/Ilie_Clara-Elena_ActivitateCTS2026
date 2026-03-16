package cts.Ilie.Clara.g1161.factory;

public class MasinaFactory {
    public static AMasina createAMasina(String tipMasina, String nrInmatriculare, double valoare) throws Exception {
        switch (tipMasina){
            case "SUV":
                return new MasinaSUV(nrInmatriculare, valoare);
            case "SEDAN":
                return new MasinaSEDAN(nrInmatriculare, valoare);
            case "VAN":
                return new MasinaVAN(nrInmatriculare, valoare);
            default: throw new Exception("Tip invalid");
        }
    }
}
