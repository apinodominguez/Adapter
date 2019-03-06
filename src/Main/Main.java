package Main;

import Adapter.Adapter;
import ArrayList.MostarClaseArray;
import HashMap.ClaseHash;

public class Main {

    public static void main(String[] args) {
        
        ClaseHash miHash = new ClaseHash();
        
        miHash.setValor(10, "uno");
        miHash.setValor(11, "dos");
        miHash.setValor(12, "tres");
        
        Adapter obj = new Adapter(miHash);
        MostarClaseArray.mostrar(obj);
    }
    }
    

