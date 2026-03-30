package cts.Ilie.Clara.g1161.prototype.main;

import cts.Ilie.Clara.g1161.prototype.IMasina;
import cts.Ilie.Clara.g1161.prototype.Masina;
import cts.Ilie.Clara.g1161.prototype.PrototypeCollection;
import cts.Ilie.Clara.g1161.prototype.Sticker;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        IMasina masina1= new Masina("audi", 2010);
        IMasina masina2= new Masina("audi", 2007);
        IMasina masina3= new Masina("bmw", 2009);
        Sticker s1= PrototypeCollection.getSticker(masina1);
        System.out.println(s1);
        Sticker s2= PrototypeCollection.getSticker(masina2);
        System.out.println(s2);
        Sticker s3= PrototypeCollection.getSticker(masina3);
        System.out.println(s3);
    }
}
