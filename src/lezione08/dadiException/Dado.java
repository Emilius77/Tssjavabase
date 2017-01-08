/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione08.dadiException;

import lezione03.giocodadi.*;
import java.util.Random;

/**
 *
 * @author tss
 */
public class Dado {
    
    private int numeroFacce;
    
    // costruttore
    public Dado(int facce){
        numeroFacce = facce;
    }
    
    /**
     * * ritorna un numero casuale tra 1 ed il numero di facce
     * 
     * @return 
     */
    
    public int lancio(){
        Random rmd = new Random ();
        return rmd.nextInt(numeroFacce) + 1;
    }
    
}
