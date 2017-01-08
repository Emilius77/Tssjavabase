/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercitazioniNatalizie.stringhe;

import javax.swing.JOptionPane;

/**
 * @author Emilius
 */
public class TrePuntoUno {

    /**
     * * Esercizio 3.1: Scrivere un programma Contrario che chiede all’utente
     * di inserire una stringa e la stampa al contrario. Per esempio, se si
     * immette la stringa "Viva Java", il programma stampa "avaJaviV "
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String contrario = "";
        String input = "";

        input = JOptionPane.showInputDialog("inserire una parolo o frase");

        for (int i = input.length() - 1; i >= 0; i--) {
            contrario = contrario + input.charAt(i);
        }
        JOptionPane.showMessageDialog(null, contrario);
    }

}
