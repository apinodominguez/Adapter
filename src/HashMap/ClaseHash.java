package HashMap;

import java.util.HashMap;

public class ClaseHash implements IHashMap {
     public HashMap<Integer,String> mapa = new HashMap<>();

    @Override
    public void setValor(int clave, String valor) {
            mapa.put(clave, valor);
    }

    @Override
    public String getValor(int clave) {
         return mapa.get(clave);
    }
}
