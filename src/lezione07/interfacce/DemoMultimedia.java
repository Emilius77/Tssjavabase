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
public class DemoMultimedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Multimedia mm = new CdPlayer();
        mm.play();
        mm.stop();
        mm.pause();

        Multimedia mm1 = new Mp3Player();
        mm1.play();
        mm1.stop();
        mm1.pause();
        mm1.reset();

        //creo l'array "medias" che conterrà le istanze mm e mm1
        Multimedia medias[] = new Multimedia[2];
        medias[0] = mm;
        medias[1] = mm1;

        for (Multimedia media : medias) {
            media.play();
            media.reset();
        }
        System.out.println(Multimedia.version());
    }

}
