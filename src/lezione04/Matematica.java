/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione04;

/**
 *
 * @author tss
 */
public class Matematica {
    
    public static final double PI_COSTANTE = 3.1415;
    
    // metodo VARARGS
    public long somma (int... numeri){  //i tre puntini dopo il tipo di variabile "int" indicano che a quel tipo di dato verrà associato un numero
                            //non specificato di parametri [equivale ad utilizzare un array]
        long risultato = 0;
        for (int i = 0; i < numeri.length; i++) {
            risultato += numeri[i];
        }
        return risultato;
    }
    
    // metodo Array (equivalente di VARARGS)
    public long sommaDiversa (int[] numeri) {
        return 0;
    }
}
