package cts.ilie.clara.g1161.chain;

public class Client implements IClient{
    private String nume;
    private ICautare cautare;

    public Client(String nume, ICautare cautare) {
        this.nume = nume;
        this.cautare = cautare;
    }

    public String getNume() {
        return nume;
    }

    @Override
    public ICautare getCautare() {
        return cautare;
    }
}
