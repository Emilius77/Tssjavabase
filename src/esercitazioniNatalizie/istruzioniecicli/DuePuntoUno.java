/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercitazioniNatalizie.istruzioniecicli;

import javax.swing.JOptionPane;

/**
 *
 * @author Emilius
 */
public class DuePuntoUno {

    /**
     * Esercizio 2.1: Scrivere un programma TuttiPositiviPari che chiede
     * all’utente di inserire una sequenza di interi (chiedendo prima quanti
     * numeri voglia inserire) e poi, al termine dell’inserimento dell’intera
     * sequenza, stampa "Tutti positivi e pari" se i numeri inseriti sono tutti
     * positivi e pari, altrimenti stampa "NO". Risolvere questo esercizio senza
     * usare array.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        String input;
        String risultato = "Tutti positivi e pari";

        input = JOptionPane.showInputDialog("quanti numeri vuoi inserire?");
        int msg = Integer.parseInt(input);

        for (int i = 0; i < msg; i++) {
            boolean valore = true; //diventa inutile

            input = JOptionPane.showInputDialog("inserisci la sequenza di numeri");
            num = Integer.parseInt(input);
            
            if (num < 0 || num % 2 != 0) {
                risultato = "NO";
            }

            // versione precedente che analizzava il singolo valore invece della sequenza intera
//            if (num %2 == 0 && valore == true) {
//                risultato = "Positivi e Pari";
//            } else {
//                risultato = "NO";
            }
            System.out.println(risultato);
        }
    }


