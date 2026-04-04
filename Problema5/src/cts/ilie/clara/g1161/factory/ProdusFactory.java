package cts.ilie.clara.g1161.factory;

public class ProdusFactory{
    public static ProdusMarketing creeareProdusMarketing(String tipProdus, String nume, String culoare,float nr) throws Exception {
        switch (tipProdus){
            case"Flyere":
                return  new Flyere(nume,culoare, nr);
            case"Postere":
                return new Postere(nume ,culoare, nr);
            case"Stikere":
                return new Stikere(nume ,culoare, nr);
            default: throw new Exception("invalid");
        }
    }
}
