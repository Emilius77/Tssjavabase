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
public class CdPlayer implements Multimedia {

    @Override
    public void play() {
      System.out.println(this.getClass() + "... CD_play() ...");
    }

    @Override
    public void stop() {
        System.out.println(this.getClass() + "... CD_stop() ...");
    }

    @Override
    public void pause() {
        System.out.println(this.getClass() + "... CD_pause() ...");
    }
    
}
