package cts.ilie.clara.g1161.observer;

public interface IClient {
	String getNume();
	void notifica(String mesaj);
	void platesteComanda(String comanda, double total);
}
