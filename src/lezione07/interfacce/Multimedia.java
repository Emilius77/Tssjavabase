/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione07.interfacce;

/**
 *
 * @author tss
 */
public interface Multimedia {  //nelle interfacce si possono implementare SOLO "costanti" e "metodi"
    
    //costante
    static final String PLAYER = "CD_PLAYER";       //le costanti (si identificano dal prefisso "final", vengono scritte con il carattere maiuscolo
    
    //metodo astratto (vuoto)
    public void play();
    public void stop();
    public void pause();
    
    //metodo di default
    default public void reset () {
        System.out.println(this.getClass() + "." + "reset()... di default...");
    }
    
    //metodo statico
    public static String version () {
        return "1.0";
    }
    
}
