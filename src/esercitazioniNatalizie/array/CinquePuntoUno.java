/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercitazioniNatalizie.array;

/**
 *
 * @author Emilius
 */
public class CinquePuntoUno {

    /**
     * Esercizio 5.1: Scrivere un programma StampaZigZag che prevede un array di
     * 10 numeri interi contenente valori a piacere (senza bisogno di chiederli
     * all’utente) e ne stampa gli elementi secondo il seguente ordine: il
     * primo, l’ultimo, il secondo, il penultimo, il terzo, il terz’ultimo,
     * ecc... Il nome dell’array puo essere scelto a piacere. (Il programma deve
     * essere scritto facendo finta di non sapere quali siano i valori inseriti
     * nell’array)
     *
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here

        int valori[] = {10, 8, 6, 4, 2, 1, 3, 5, 7, 9}; // creo e inizializzo l'array valori[]
        int totNum = valori.length;     //creo una variabile totNum, assegnandogli come valore la lunghezza dell'array (valori.lenght)

        if (totNum % 2 == 0) {
            stampaArrayPari(valori);
        } else {
            stampaArrayDispari(valori);
        }
    }

    public static void stampaArrayPari(int valori[]) {
        int totNum = valori.length;

        int pari[] = new int[totNum / 2];

        for (int i = totNum - 1; i >= (totNum / 2); i--) {
            pari[(totNum - 1) - i] = valori[i];

        }
        for (int j = 0; j < pari.length; j++) {
            System.out.print(valori[j] + " " + pari[j] + " ");
        }
    }

    public static void stampaArrayDispari(int valori[]) {
        int totNum = valori.length;

        int dispari[] = new int[totNum / 2];

        for (int i = totNum - 1; i > (totNum / 2); i--) {
            dispari[(totNum - 1) - i] = valori[i];
        }
        for (int j = 0; j < dispari.length; j++) {
            System.out.print(valori[j] + " " + dispari[j] + " ");
        }
        System.out.print(valori[(totNum / 2)] + " ");
    }

}
