package cts.ilie.clara.g1161.singleton.lazy;

public class Banner implements ProdusMarketing{
    private static Banner instance;
    private String numeBanner;

    private Banner(String numeBanner) {
        this.numeBanner = numeBanner;
    }
    public static Banner getInstance(String numeBanner){
        if(instance==null){
            instance =new Banner(numeBanner);
        }
        return instance;
    }

    @Override
    public String getNumeProdus() {
        return numeBanner;
    }
}
