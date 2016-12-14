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
public class Mp3Player implements MultiMediaPlus {
    
    @Override
    public void play() {
      System.out.println(this.getClass() + "... Mp3_play() ...");
    }

    @Override
    public void stop() {
        System.out.println(this.getClass() + "... Mp3_stop() ...");
    }

    @Override
    public void pause() {
        System.out.println(this.getClass() + "... Mp3_pause() ...");
    }

    @Override
    public void reset() {
        System.out.println(this.getClass() + "... Mp3_reset() ...");
    }

    @Override
    public void fastForward() {
        System.out.println(this.getClass() + "... Mp3_FastForward() ...");
    }

    @Override
    public void fastRewind() {
        System.out.println(this.getClass() + "... Mp3_FastRewind() ...");
    }
    
    
    
}
