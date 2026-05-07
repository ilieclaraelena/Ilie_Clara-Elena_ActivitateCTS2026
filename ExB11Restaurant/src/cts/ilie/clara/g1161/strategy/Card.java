package cts.ilie.clara.g1161.strategy;

public class Card implements ModPlata{
    @Override
    public void plateste(String numeClient, double sumaPlatita) {
        System.out.println(numeClient +" plateste card suma de: "+ sumaPlatita );
    }
}
