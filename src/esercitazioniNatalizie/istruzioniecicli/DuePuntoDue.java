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
public class DuePuntoDue {

    /**
     * Esercizio 2.2: Scrivere un programma ContinuaFino che chiede all’utente
     * di inserire una sequenza di interi. Il programma continua a chiedere
     * all’utente di inserire valori fintanto che i valori inseriti soddisfano
     * almeno una delle seguenti condizioni: • è negativo e divisibile per 2 • è
     * positivo e divisibile per 3 Al termine il programma stampa la somma di
     * tutti i valori inseriti escluso quello ha violato le condizioni.
     * Risolvere questo esercizio senza usare array.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int num;
        int somma = 0;
        String input;
        String risultato = "";
        boolean ok = true;

        for (int i = 0; ok == true; i++) {
            input = JOptionPane.showInputDialog("inserisci la sequenza di numeri");
            num = Integer.parseInt(input);

            if ((num < 0 && num % 2 == 0) || (num > 0 && num % 3 == 0)) {
                risultato += (i + 1) + ") " + input + "\n";
                somma += num;
                ok = true;
            } else {
                JOptionPane.showMessageDialog(null, risultato + "la somma dei numeri che soddisfano \n"
                        + "la richiesta è: " + somma);
                break;
            }

        }
    }
}
