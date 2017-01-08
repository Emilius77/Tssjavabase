/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercitazioniNatalizie.stringhe;

import javax.swing.JOptionPane;

/**
 *
 * @author Emilius
 */
public class TrePuntoDue {

    /**
     * Esercizio 3.2: Scrivere un programma SoloVocali che chiede all’utente di
     * inserire una stringa e ne stampa le sole vocali. Per esempio, se si
     * immette la stringa "Viva Java", il programma stampa "iaaa".
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String input = "";
        String soloVocali = "";
        input = JOptionPane.showInputDialog("inserire una parolo o frase");

        int numChar = input.length(); // leggo il numero totale di caratteri nella stringa in input

        for (int i = 0; i < numChar; i++) { // leggo ogni indice dell'input stringa
            char[] vocali = {'a', 'e', 'i', 'o', 'u'}; // inizializzo un array vocali

            for (int c = 0; c < vocali.length; c++) { // confronto ogni carattere della stringa input con tutti 
                // gli indici dell'array vocali
                if (input.charAt(i) == vocali[c]) {
                    soloVocali = soloVocali + input.charAt(i);
                }
            }
        } JOptionPane.showMessageDialog(null, soloVocali);

    }
}
