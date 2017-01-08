/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercitazioniNatalizie.metodi;

import javax.swing.JOptionPane;

/**
 *
 * @author Emilius
 */
public class QuattroPuntoUno {

    /**
     * Esercizio 4.1: Scrivere un programma Ripeti che chiede all’utente di
     * inserire una stringa e un numero intero positivo. Entrambe le cose
     * dovranno essere passate a un metodo ausiliario che stamperà tante copie
     * della stringa quante indicate nel numero inserito dall’utente. Se il
     * numero inserito dall’utente è negativo il metodo ausiliario stampera
     * "ERRORE: numero negativo". Il nome del metodo ausiliario puo essere
     * scelto a piacere.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String input = "";
        String numero = "";
        String ris = "";
        int num = 0;

        input = JOptionPane.showInputDialog("Inserire una frase");
        numero = JOptionPane.showInputDialog("Inserire un numero");
        num = Integer.parseInt(numero);

        String stampa = ripeti(num, ris, input);

        JOptionPane.showMessageDialog(null, stampa);
    }

    static String ripeti(int num, String ris, String input) {
        
            if (num < 0) {
                ris = "Errore, numero negativo";
            } else {
                for (int i = 0; i < num; i++) {
                ris = (ris + "\n" + input);
            }
        }
        return ris;
    }

}
