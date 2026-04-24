package cts.ilie.clara.g1161.decorator;

import java.util.HashSet;
import java.util.Set;

public class MagazinDecorator implements IMagazin{
    private IMagazin magazin;
    //private static final double DISCOUNT=0.10;
    private Set<String> clientiCuDiscountConsumat= new HashSet<>();

    public MagazinDecorator(IMagazin magazin) {
        this.magazin = magazin;
    }

    public IMagazin getMagazin() {
        return magazin;
    }

    @Override
    public double getTotal(ICosCumparaturi cos, IClient client) {
        double total= magazin.getTotal(cos, client);
        if(!clientiCuDiscountConsumat.contains(client.getEmail())){
            clientiCuDiscountConsumat.add(client.getEmail());
            double discount =total*0.10;
            System.out.println("Discount pentru prima comanda pentru clientul: "+ client.getNume()+ " "+ client.getEmail()+" are valoarea de "+discount);
            return total-discount;
        }
        System.out.println("Clientul a avut deja o comanda, nu se aplica discount");
        return total;
    }
}
