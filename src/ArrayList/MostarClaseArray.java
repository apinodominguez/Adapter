/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;

import javax.swing.JOptionPane;

/**
 *
 * @author Angel
 */
public class MostarClaseArray {
    
    public static void mostrar(ClaseArrayList lista) {
        String text = "";
        for (int j = 0; j < lista.lista.size(); j++) {
            text = text + j + "           " + lista.getElemento(j) + "\n";

        }
        JOptionPane.showMessageDialog(null, text);
    }
}

