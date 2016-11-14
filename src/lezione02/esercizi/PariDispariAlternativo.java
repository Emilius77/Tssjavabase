/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione02.esercizi;

import java.util.Scanner;

/**
 *  legge un numero in input e stampa se è pari o dispari
 *
 * @author tss
 */
public class PariDispariAlternativo {
    
    public static void main(String[] args) {
        
        String risultato = "";
        int i = 0;
        
        // crea oggetto scanner per leggere un input dell'utente
        // è un metodo alternativo al JOptionpane.showInputDialog
        Scanner s = new Scanner (System.in);
        
        System.out.println("Inserisci un numero");  // "println" stampa e va a capo, "print" stampa senza andare a capo
        //System.out.print("Inserisci un numero ");
        
        // leggo il numero in input
        int numero = s.nextInt();
        int indice = 0;
        
        while (indice < numero) {   // fino a che [while] la mia condizione [indice < numero] (la variabile indice è minore della variabile numero)
            indice += 2;            // aggiugni 2 alla variabile indice
        }
        risultato = (indice == numero) ? "Il numero è pari" : "Il numero è dispari"; // se la variabile indice diventa = alla variabile numero mi restituisce 
                                                                    // il risultato

        System.out.println(risultato);
    }
    
}
