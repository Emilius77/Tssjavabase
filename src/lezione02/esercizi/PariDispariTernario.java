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
public class PariDispariTernario {
    
    public static void main(String[] args) {
        
        String risultato;
        
        // crea oggetto scanner per leggere un input dell'utente
        // è un metodo alternativo al JOptionpane.showInputDialog
        Scanner s = new Scanner (System.in);
        
        System.out.println("Inserisci un numero");  // "println" stampa e va a capo, "print" stampa senza andare a capo
        //System.out.print("Inserisci un numero ");
        
        // leggo il numero in input
        int numero = s.nextInt();
        
        // comando per fare un "IF ternario" che si utilizza SOLO quando abbiamo una condizione da verificare che 
        // abbia come risultato SOLO due opzioni
        risultato = (numero % 2) == 0 ? "Il numero è pari" : "Il numero è dispari";
        
        System.out.println(risultato);
    }
    
}
