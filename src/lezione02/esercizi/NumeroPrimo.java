/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione02.esercizi;

import java.util.Scanner;

/**
 *
 * @author tss
 */
public class NumeroPrimo {
    
    
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
        int c = 1; i= 0;
        
        while (c <= numero) {
            if ((numero % c) == 0) {
                i = i+1;
            }
            c++;    
        }
        
        risultato = (i <= 2) ? "Il numero è primo" : "Il numero non è primo"; // se la variabile indice diventa = alla variabile numero mi restituisce 
                                                                    // il risultato

        System.out.println(risultato);
        
    }
    
}
