package cts.ilie.clara.g1161.observer;

public class Client implements IClient{
    private String nume;

    public Client(String nume) {
        this.nume = nume;
    }

    @Override
    public String getNume() {
        return nume;
    }

    @Override
    public void notifica(String mesaj) {
        System.out.println("Notificare pentru "+ getNume()+ " "+ mesaj);
    }

    @Override
    public void platesteComanda(String comanda, double total) {

    }
}
