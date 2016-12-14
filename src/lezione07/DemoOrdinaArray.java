/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione07;

import firstLibrary.DateFunction;
import firstLibrary.LibreriaFunzioniArray;
import lezione06.ordinamento.*;
import java.util.ArrayList;
import java.util.Date;

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
        LibreriaFunzioniArray.stampa(persone);            //scrivendo in questo modo e dando "alt+invio" gli possiamo dire di creare in automatico il metodo "stampa"

        //richiamo il metodo "ordina" passando l'array di persone
        LibreriaFunzioniArray.ordina(persone);

        //stampo l'array ordinato
        LibreriaFunzioniArray.stampa(persone);
        
        //istanzio l'array Messaggi
        Messaggio messaggi[] = new Messaggio[3];
        
        messaggi[0] = new Messaggio("Arrivederci");
        messaggi[1] = new Messaggio("Buona sera");
        messaggi[2] = new Messaggio("Buona notte");
        
        //richiamo il metodo "ordina" passando l'array di persone
        LibreriaFunzioniArray.ordina(messaggi);
        
        //stampo l'array ordinato
        LibreriaFunzioniArray.stampa(messaggi);
        
        //cerco un oggetto all'interno dell'array
        System.out.println(LibreriaFunzioniArray.cerca(persone, new Persona("Luca", "Bianchi")));
        System.out.println(LibreriaFunzioniArray.cerca(messaggi, new Messaggio("Buona sera")));
        
        //richiamo la funzione "Data" e stampo la data corrente nel formato specificato nella libreria
        System.out.println(DateFunction.convert(new Date()));
        
    }
}

   

    

