package cts.Ilie.Clara.g1161.prototype;

import java.util.HashMap;
import java.util.Map;

public class PrototypeCollection {
    private static Map<String , Sticker> map=new HashMap<>();
    public static Sticker getSticker(IMasina masina) throws CloneNotSupportedException {
        String cheie=masina.getModel()+" "+masina.getAnFabricatie();
        if(map.containsKey(cheie)){
            System.out.println("Sticker clonat");
            return map.get(cheie).clone();
        }
        else{
            Sticker sticker=new Sticker(masina);
            map.put(cheie, sticker);
            return sticker.clone();
        }
    }
}
