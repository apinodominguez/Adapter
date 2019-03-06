/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapter;
import ArrayList.ClaseArrayList;
import HashMap.ClaseHash;

public class Adapter extends ClaseArrayList {
    
    public Adapter (ClaseHash convertido){
        lista.addAll(convertido.mapa.values());
    }

    

   
         
}
