package cts.Ilie.Clara.g1161.singleton.registry;

import java.util.HashMap;
import java.util.Map;

public class ProdusRegistry {
    private static Map<String, ProdusGeneric>map= new HashMap<>();
    private ProdusRegistry (){
    }

    public static void registry(String numeProdus, ProdusGeneric produsGeneric) throws Exception {
        if(map.containsKey(numeProdus)){
            throw new Exception("Produs deja existent");

        }
        else{
            map.put(numeProdus, produsGeneric);
        }

    }
    public static ProdusGeneric getProdus(String numeProdus){
        return map.get(numeProdus);
    }
}
