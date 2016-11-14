/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione02.esercizi;

import java.util.Scanner;

/**
 *  Leggo un numero in input e stampo il suo fattoriale
 *
 * @author tss
 */
public class Fattoriale {
    
    
    public static void main(String[] args) {
        
        String risultato = "";
                
        // crea oggetto scanner per leggere un input dell'utente
        // è un metodo alternativo al JOptionpane.showInputDialog
        Scanner s = new Scanner (System.in);
        
        System.out.println("Inserisci un numero");  // "println" stampa e va a capo, "print" stampa senza andare a capo
        //System.out.print("Inserisci un numero ");
        
        // leggo il numero in input
        int numero = s.nextInt();
        
        
    }
    
}
