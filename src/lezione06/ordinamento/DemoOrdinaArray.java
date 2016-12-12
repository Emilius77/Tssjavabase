/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione06.ordinamento;

import java.util.ArrayList;

/**
 *
 * @author tss
 */
public class DemoOrdinaArray {

    public static void main(String[] args) {

        Persona persone[] = new Persona[3];    //creo un array di 3 persone, della classe Persona

        //istanzio l'array di persone
        persone[0] = new Persona("Mario", "Rossi");
        persone[1] = new Persona("Gianni", "Verdi");
        persone[2] = new Persona("Luca", "Bianchi");

        //stampo l'array
        stampa(persone);            //scrivendo in questo modo e dando "alt+invio" gli possiamo dire di creare in automatico il metodo "stampa"

        //richiamo il metodo "ordina" passando l'array di persone
        ordina(persone);

        //stampo l'array ordinato
        stampa(persone);
    }

    private static void stampa(Persona[] persone) {
        System.out.println("---------------STAMPA---------------");
        for (Persona persona : persone) {               //metodo for "ristretto" per sfogliare il contenuto dell'array e stamparlo a video
            System.out.println(persona);
        }
        System.out.println("------------FINE STAMPA-------------");

    }

    /**
     * Ordinamento con bubble sort!
     *
     * @param persone
     */
    private static void ordina(Persona[] persone) {
        boolean disordinato;

        do {
            disordinato = false;
            for (int i = 0; i < persone.length - 1; i++) {
                Persona p = persone[i];
                Persona pNext = persone[i + 1];
                if (p.compareTo(pNext) >= 0) {
                    
                    //scambio le posizioni
                    persone[i] = pNext;
                    persone[i + 1] = p;

                    disordinato = true;
                }
            }
        } while (disordinato);

    }
}
