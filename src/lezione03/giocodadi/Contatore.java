/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione03.giocodadi;

/**
 *
 * @author tss
 */
public class Contatore {
    
    private int valore;
    private int step;
    
    public Contatore(int valoreIniziale, int aumento){
        valore = valoreIniziale;
        step = aumento;
    }
    
    public void conta(){
        valore += step;
    }
    
    public int valoreCorrente(){
        return valore;
    }
    
}
