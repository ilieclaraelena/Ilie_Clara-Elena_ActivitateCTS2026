package cts.Ilie.Clara.g1161.singleton.lazy;

public class Service implements IService {

    private static Service instance;
    //obiect singleton

    private AMasina masinaCurenta;

    private Service() {
    }

    public static Service getInstance() {
        if (instance == null) {
            instance = new Service();
        }
        return instance;
    }

    @Override
    public void intrareMasina(AMasina masina) {
        if (masinaCurenta == null) {
            masinaCurenta = masina;
            System.out.println("Masina a intrat in service");
        } else {
            System.out.println("Service OCUPAT");
        }

    }

    @Override
    public void iesireMasina() {
        if (masinaCurenta != null) {
            System.out.println("masina a iesit din service");
            masinaCurenta = null;
        } else {
            System.out.println("Nu exista masina in service");
        }
    }

    @Override
    public AMasina getMasina() {
        return masinaCurenta;
    }
}
