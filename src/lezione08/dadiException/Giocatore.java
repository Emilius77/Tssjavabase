/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione08.dadiException;

import lezione03.giocodadi.*;

/**
 *
 * @author tss
 */
public class Giocatore {
    
    private String nome;
    private int soldi;

    
    // costruttore
    public Giocatore(String nomeGiocatore, int soldiGiocatore) {
        if (soldiGiocatore < 10) {
            throw new GiocoDadiException("Non è possibile creare un giocatore con credito inferiore a 10");
        }
        nome = nomeGiocatore;
        soldi = soldiGiocatore;
    }
    
    public void vince(){
        soldi++;
    }
    
    public void perde (){
        soldi--;
    }
    
    public void stampa(){
        System.out.println("Nome: " + nome + "\n" + "Soldi: " + soldi);
    }

    public int saldo() {
        return soldi;
    }
    
}
