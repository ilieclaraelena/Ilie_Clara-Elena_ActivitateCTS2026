package cts.ilie.clara.g1161.decorator;

public class Client implements IClient{
    private String nume;
    private String adresa;
    private String email;

    public Client(String nume, String adresa, String email) {
        this.nume = nume;
        this.adresa = adresa;
        this.email = email;
    }

    @Override
    public String getAdresa() {
        return adresa;
    }

    @Override
    public String getNume() {
        return nume;
    }

    @Override
    public String getEmail() {
        return email;
    }
}
