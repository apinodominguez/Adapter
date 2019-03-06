/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;

import java.util.ArrayList;

/**
 *
 * @author Angel
 */
public class ClaseArrayList implements IArrayList {

    public ArrayList<String> lista = new ArrayList<>();
    
    @Override
    public void setElemento(String valor) {
        lista.add(valor);
    }

    @Override
    public String getElemento(int valor) {
       return lista.get(valor);
    }

   
    
}
